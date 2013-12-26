/***********************************************************************
 * This software is published under the terms of the LGPL
 * version 2.1, a copy of which has been included with this
 * distribution in the 'lgpl.txt' file.
 * Copyright (C) 2004 Daniel Gal�n y Martins
 * Author: Daniel Gal�n y Martins
 * Creation date: 03.05.2003
 * Revision: $Revision: 1.2 $
 * Checked in by: $Author: danielgalan $
 * Last modified: $Date: 2009/12/02 21:53:59 $
 * $Log: TerminalEventListener.java,v $
 * Revision 1.2  2009/12/02 21:53:59  danielgalan
 * naming
 *
 * Revision 1.1 2004/07/26 21:40:28 danielgalan
 * Jalita initial cvs commit :)
 **********************************************************************/
package net.sf.jalita.io;

import java.util.EventListener;



/**
 * Interface for terminal eventlisteners, happend by userinteraction
 * 
 * @author Daniel Gal�n y Martins
 * @version $Revision: 1.2 $
 */
public interface TerminalEventListener extends EventListener {

	//--------------------------------------------------------------------------
	// public methods
	//--------------------------------------------------------------------------

	/** event barcode is scanned */
	public void barcodeReceived(TerminalEvent e);


	/** event key is pressed */
	public void keyPressed(TerminalEvent e);

}
