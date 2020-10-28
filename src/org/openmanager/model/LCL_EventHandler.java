/**
 * 
 */
package org.openmanager.model;


import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.MBPartner;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.openmanager.LCL.sii.dte.RUT;
import org.openmanager.LCL.sii.dte.RUTException;
import org.osgi.service.event.Event;

public class LCL_EventHandler extends AbstractEventHandler{

	private static CLogger log = CLogger.getCLogger(LCL_EventHandler.class);
	
	@Override
	protected void doHandleEvent(Event event) {
		PO po = getPO(event);
		String type = event.getTopic();
		log.info(po + " Type: " + type);
	
		// Check Digit based on TaxID
		if (po.get_TableName().equals(MBPartner.Table_Name) && ( type.equals(IEventTopics.PO_BEFORE_NEW) || type.equals(IEventTopics.PO_BEFORE_CHANGE)))
		{
			MBPartner bpartner = (MBPartner)po;
			String rutxverificar = bpartner.getTaxID();
			
			
			
			try {
			RUT	rutverificado = new RUT(rutxverificar);
			} catch (RUTException ruterrores){throw new RuntimeException ("RUT MALO O FALTA");
				}
		}
		
	}

	@Override
	protected void initialize() {
		registerTableEvent(IEventTopics.PO_BEFORE_NEW, MBPartner.Table_Name);
		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, MBPartner.Table_Name);
	
	}	//	initialize
	
}
