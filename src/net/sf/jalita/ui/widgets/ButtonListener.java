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
 * Creation date: 10.05.2003
 *  
 * Revision:      $Revision: 1.1 $
 * Checked in by: $Author: danielgalan $
 * Last modified: $Date: 2004/07/26 21:40:27 $
 * 
 * $Log: ButtonListener.java,v $
 * Revision 1.1  2004/07/26 21:40:27  danielgalan
 * Jalita initial cvs commit :)
 *
 **********************************************************************/
package net.sf.jalita.ui.widgets;

import net.sf.jalita.io.TerminalEvent;



/**
 * "Button-pressed"-Event
 *
 * @author  Daniel "tentacle" Gal�n y Martins
 * @version $Revision: 1.1 $
 */
public interface ButtonListener {

    //--------------------------------------------------------------------------
    // public methods
    //--------------------------------------------------------------------------

    /** Button was pressed */
    public void actionPerformed(TerminalEvent e);


}
