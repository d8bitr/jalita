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
 * Creation date: 29.07.2003
 *  
 * Revision:      $Revision: 1.1 $
 * Checked in by: $Author: danielgalan $
 * Last modified: $Date: 2004/07/26 21:40:27 $
 * 
 * $Log: FormatFieldRangeException.java,v $
 * Revision 1.1  2004/07/26 21:40:27  danielgalan
 * Jalita initial cvs commit :)
 *
 **********************************************************************/
package net.sf.jalita.ui.widgets;



/**
 * Diese Exception wird geworfen wenn beim setzten der Zahl in einem FormatFieldWidget
 * die L�nge des Feldes �berschritten wird.
 *
 * @author  Daniel "tentacle" Gal�n y Martins
 * @version $Revision: 1.1 $
 */

public class FormatFieldRangeException extends Exception {

    //--------------------------------------------------------------------------
    // instance variables
    //--------------------------------------------------------------------------

    /** value, which was tried to be set */
    private double value;



    //--------------------------------------------------------------------------
    // constructors
    //--------------------------------------------------------------------------

    public FormatFieldRangeException(double wrongValue) {
        super();
        value = wrongValue;
    }



    //--------------------------------------------------------------------------
    // public methods
    //--------------------------------------------------------------------------

    /** Returns the value, which was tried to set */
    public double getValue() {
        return value;
    }



    /** Sets the value, which was tried to set */
    public void setValue(double value) {
        this.value = value;
    }

}
