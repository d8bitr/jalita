/***********************************************************************
 * 
 * This software is published under the terms of the LGPL
 * License version 2.1, a copy of which has been included with this
 * distribution in the 'lgpl.txt' file.
 * Copyright (C) 2004 Daniel Gal�n y Martins
 * 
 *********************************************************************** 
 *
 * Author:   	  Daniel "tentacle" Gal�n y Martins
 * Creation date: 01.07.2003
 *  
 * Revision:      $Revision: 1.1 $
 * Checked in by: $Author: danielgalan $
 * Last modified: $Date: 2005/05/23 18:10:20 $
 * 
 * $Log: ConfigurationException.java,v $
 * Revision 1.1  2005/05/23 18:10:20  danielgalan
 * some cleaning and removing some cycles (not all removed yet)
 *
 * Revision 1.1  2004/07/26 21:40:28  danielgalan
 * Jalita initial cvs commit :)
 *
 **********************************************************************/
package net.sf.jalita.util;

import org.apache.log4j.Logger;



/**
 * Exception for the Configuration.
 *
 * @author  Daniel "tentacle" Gal�n y Martins
 * @version $Revision: 1.1 $
 */
public class ConfigurationException extends Exception {

    //--------------------------------------------------------------------------
    // class variables
    //--------------------------------------------------------------------------

	/** log4j reference */
    public final static Logger log = Logger.getLogger(Configuration.class);



    //--------------------------------------------------------------------------
    // constructors
    //--------------------------------------------------------------------------

    public ConfigurationException(String message) {
        super(message);
    }

}
