/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.SupplierDA;
import entities.Supplier;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SupplierBL {

    SupplierDA dataAccess;

    public SupplierBL() {
        dataAccess = new SupplierDA();
    }
    
    public void addSupplier(Supplier s) throws SQLException {
        dataAccess.addSupplier(s);
    }

    public void modifySupplier (Supplier s) throws SQLException {
        dataAccess.modifySupplier(s);
    }
    
    public void deleteSupplier(int id) throws SQLException {
        dataAccess.deleteSupplier(id);
    }
    
    public ArrayList<Supplier> searchSuppliers(Integer _id, String _ruc, String _name) throws SQLException {
        return dataAccess.searchSuppliers(_id, _ruc, _name);
    }
}
