/**
 * 
 */
package org.openmanager.model;


import java.util.Properties;


import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.I_C_BPartner;
import org.openmanager.LCL.sii.dte.RUT;
import org.openmanager.LCL.sii.dte.RUTException;

/**
 * @author raul
 *
 */
public class LCL_Callouts implements IColumnCalloutFactory {

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName,
			String columnName) {
		if (tableName.equalsIgnoreCase(I_C_BPartner.Table_Name)) {
			if (columnName.equalsIgnoreCase(I_C_BPartner.COLUMNNAME_TaxID))
				return new IColumnCallout[]{new VericarTaxid()};
		}
		return null;
	}



public static class VericarTaxid implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value, Object oldValue) {
		
		String rutxverificar = (String) value;
		RUT rutverificado;
		try {
			rutverificado = new RUT(rutxverificar);
		} catch (RUTException ruterrores){mTab.setValue("TaxID", oldValue);
			return ""+rutxverificar+" "+ruterrores;
			}
		
		mTab.setValue("TaxID", rutverificado.toString().toUpperCase());
		return null;
	}
	
}
}