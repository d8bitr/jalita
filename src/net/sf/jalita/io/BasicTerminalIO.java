/***********************************************************************
 * 
 * This software is published under the terms of the LGPL
 * version 2.1, a copy of which has been included with this
 * distribution in the 'lgpl.txt' file.
 * Copyright (C) 2004 Daniel Gal�n y Martins
 * 
 *********************************************************************** 
 *
 * Author:   	  Daniel "tentacle" Gal�n y Martins
 * Creation date: 02.05.2003
 *  
 * Revision:      $Revision: 1.1 $
 * Checked in by: $Author: danielgalan $
 * Last modified: $Date: 2004/07/26 21:40:27 $
 * 
 * $Log: BasicTerminalIO.java,v $
 * Revision 1.1  2004/07/26 21:40:27  danielgalan
 * Jalita initial cvs commit :)
 *
 **********************************************************************/
package net.sf.jalita.io;

import java.io.*;
import java.net.*;
import org.apache.log4j.Logger;
import net.sf.jalita.application.Configuration;



/**
 * Describes the basic functionality, which must be supported by each terminal
 *
 * @author  Daniel "tentacle" Gal�n y Martins
 * @version $Revision: 1.1 $
 */
public abstract class BasicTerminalIO implements TerminalIOInterface {

    //--------------------------------------------------------------------------
    // class variables
    //--------------------------------------------------------------------------

    /** log4j reference */
    public final static Logger log = Logger.getLogger(Configuration.class);



    //--------------------------------------------------------------------------
    // instance variables
    //--------------------------------------------------------------------------

    /** Session Socket */
    protected Socket socket;



    //--------------------------------------------------------------------------
    // private & protected methods
    //--------------------------------------------------------------------------

    /** Writer, which writes on the socket */
    protected abstract Writer getWriter();



    /** Reader, which reads from the socket */
    protected abstract Reader getReader();



    //--------------------------------------------------------------------------
    // public methods
    //--------------------------------------------------------------------------

    /** Returns the host address including port number in the notation: xxx.xxx.xxx.xxx:port */
    public String toString() {
        return socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
    }



    /** Closes the writer, reader and the socket */
    public void close() throws IOException {
        log.debug("Closing TerminalIO for '" + toString() + "'");

        if (!socket.isClosed()) {
            getWriter().close();
            getReader().close();
            socket.close();
        }
    }



    /** Returns the internet-adress associated with the socket */
    public InetAddress getInetAdress() {
        return socket.getInetAddress();
    }

}