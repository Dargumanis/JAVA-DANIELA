/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.SupplierDA;
import entities.Supplier;
import java.sql.SQLException;

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
}
