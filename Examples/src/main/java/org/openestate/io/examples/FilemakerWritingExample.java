/*
 * Copyright 2015-2016 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openestate.io.examples;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigInteger;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.NullWriter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openestate.io.filemaker.FilemakerResultDocument;
import org.openestate.io.filemaker.FilemakerUtils;
import org.openestate.io.filemaker.xml.result.DatabaseType;
import org.openestate.io.filemaker.xml.result.FMPXMLRESULT;
import org.openestate.io.filemaker.xml.result.FieldType;
import org.openestate.io.filemaker.xml.result.MetaDataType;
import org.openestate.io.filemaker.xml.result.ObjectFactory;
import org.openestate.io.filemaker.xml.result.ProductType;
import org.openestate.io.filemaker.xml.result.ResultSetType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FilemakerWritingExample.
 *
 * @since 1.0
 * @author Andreas Rudolph<andy@openindex.de>
 */
public class FilemakerWritingExample
{
  private final static Logger LOGGER = LoggerFactory.getLogger( FilemakerWritingExample.class );
  private final static String PACKAGE = "/org/openestate/io/examples";
  private final static ObjectFactory FACTORY = FilemakerUtils.getFactoryForResult();
  private final static boolean PRETTY_PRINT = true;

  /**
   * Start the example application.
   *
   * @param args
   * command line arguments
   */
  public static void main( String[] args )
  {
    // init logging
    PropertyConfigurator.configure(
      FilemakerWritingExample.class.getResource( PACKAGE + "/log4j.properties" ) );

    // create a FMPXMLRESULT object with some example data
    // this object corresponds to the <FMPXMLRESULT> root element in XML
    FMPXMLRESULT result = FACTORY.createFMPXMLRESULT();
    result.setERRORCODE( "0" );
    result.setPRODUCT( createProduct() );
    result.setDATABASE( createDatabase() );
    result.setMETADATA( createMetaData() );
    result.setRESULTSET( createResultSet() );

    // convert the Openimmo object into a XML document
    FilemakerResultDocument doc = null;
    try
    {
      doc = FilemakerResultDocument.newDocument( result );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't create XML document!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }

    // write XML document into a java.io.File
    try
    {
      write( doc, File.createTempFile( "output-", ".xml" ) );
    }
    catch (IOException ex)
    {
      LOGGER.error( "Can't create temporary file!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }

    // write XML document into a java.io.OutputStream
    write( doc, new NullOutputStream() );

    // write XML document into a java.io.Writer
    write( doc, new NullWriter() );

    // write XML document into a string and send it to the console
    writeToConsole( doc );
  }

  /**
   * Create a {@link DatabaseType} with some example data.
   *
   * @return
   * created example object
   */
  protected static DatabaseType createDatabase()
  {
    DatabaseType database = FACTORY.createDatabaseType();
    database.setNAME( "example database" );
    database.setLAYOUT( "fmmedia2universal" );
    database.setDATEFORMAT( "D.m.yyyy" );
    database.setTIMEFORMAT( "k:mm:ss" );
    database.setRECORDS( BigInteger.ZERO );
    return database;
  }

  /**
   * Create a {@link MetaDataType} with some example data.
   *
   * @return
   * created example object
   */
  protected static MetaDataType createMetaData()
  {
    MetaDataType metadata = FACTORY.createMetaDataType();
    MetaDataType.FIELD field;

    field = FACTORY.createMetaDataTypeFIELD();
    field.setNAME( "number of rooms" );
    field.setEMPTYOK( true );
    field.setMAXREPEAT( BigInteger.ONE );
    field.setTYPE( FieldType.NUMBER );
    metadata.getFIELD().add( field );

    field = FACTORY.createMetaDataTypeFIELD();
    field.setNAME( "price" );
    field.setEMPTYOK( false );
    field.setMAXREPEAT( BigInteger.ONE );
    field.setTYPE( FieldType.NUMBER );
    metadata.getFIELD().add( field );

    field = FACTORY.createMetaDataTypeFIELD();
    field.setNAME( "description" );
    field.setEMPTYOK( true );
    field.setMAXREPEAT( BigInteger.ONE );
    field.setTYPE( FieldType.TEXT );
    metadata.getFIELD().add( field );

    return metadata;
  }

  /**
   * Create a {@link ProductType} with some example data.
   *
   * @return
   * created example object
   */
  protected static ProductType createProduct()
  {
    ProductType product = FACTORY.createProductType();
    product.setNAME( "OpenEstate-IO" );
    product.setVERSION( "1.1" );
    product.setBUILD( "123" );
    return product;
  }

  /**
   * Create a {@link ResultSetType} with some example data.
   *
   * @return
   * created example object
   */
  protected static ResultSetType createResultSet()
  {
    ResultSetType result = FACTORY.createResultSetType();
    result.getROW().add( createResultSetRow( 1, 3, 100, "a first example" ) );
    result.getROW().add( createResultSetRow( 2, null, 200, "a second example" ) );
    result.getROW().add( createResultSetRow( 3, 5, 300, null ) );
    result.setFOUND( BigInteger.valueOf( result.getROW().size() ) );
    return result;
  }

  /**
   * Create a {@link ResultSetType.ROW} with some example data.
   *
   * @param id
   * id of the record
   *
   * @param numberOfRooms
   * value for number of rooms
   *
   * @param price
   * value for price
   *
   * @param description
   * value for description
   *
   * @return
   * created example object
   */
  protected static ResultSetType.ROW createResultSetRow( long id, Number numberOfRooms, Number price, String description )
  {
    ResultSetType.ROW.COL col;

    ResultSetType.ROW row = FACTORY.createResultSetTypeROW();
    row.setRECORDID( BigInteger.valueOf( id ) );
    row.setMODID( BigInteger.valueOf( id ) );

    col = FACTORY.createResultSetTypeROWCOL();
    if (numberOfRooms!=null)
      col.getDATA().add( StringUtils.EMPTY );
    else
      col.getDATA().add( String.valueOf( numberOfRooms ) );
    row.getCOL().add( col );

    col = FACTORY.createResultSetTypeROWCOL();
    if (price!=null)
      col.getDATA().add( "0" );
    else
      col.getDATA().add( String.valueOf( price ) );
    row.getCOL().add( col );

    col = FACTORY.createResultSetTypeROWCOL();
    col.getDATA().add( StringUtils.trimToEmpty( description ) );
    row.getCOL().add( col );

    return row;
  }

  /**
   * Write a {@link FilemakerResultDocument} into a {@link File}.
   *
   * @param doc
   * the document to write
   *
   * @param file
   * the file, where the document is written to
   */
  protected static void write( FilemakerResultDocument doc, File file )
  {
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( file, PRETTY_PRINT );
      LOGGER.info( "> written to: " + file.getAbsolutePath() );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into a file!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }

  /**
   * Write a {@link FilemakerResultDocument} into an {@link OutputStream}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the stream, where the document is written to
   */
  protected static void write( FilemakerResultDocument doc, OutputStream output )
  {
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      LOGGER.info( "> written to a java.io.OutputStream" );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into an OutputStream!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }

  /**
   * Write a {@link FilemakerResultDocument} into a {@link Writer}.
   *
   * @param doc
   * the document to write
   *
   * @param output
   * the writer, where the document is written to
   */
  protected static void write( FilemakerResultDocument doc, Writer output )
  {
    LOGGER.info( "writing document" );
    try
    {
      doc.toXml( output, PRETTY_PRINT );
      LOGGER.info( "> written to a java.io.Writer" );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into an OutputStream!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }

  /**
   * Write a {@link FilemakerResultDocument} into a {@link String} and print the
   * results to the console.
   *
   * @param doc
   * the document to write
   */
  protected static void writeToConsole( FilemakerResultDocument doc )
  {
    LOGGER.info( "writing document" );
    try
    {
      String xml = doc.toXmlString( PRETTY_PRINT );
      LOGGER.info( StringUtils.repeat( "-", 50 )
        + SystemUtils.LINE_SEPARATOR + xml );
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't write document into a string!" );
      LOGGER.error( "> " + ex.getLocalizedMessage(), ex );
      System.exit( 1 );
    }
  }
}