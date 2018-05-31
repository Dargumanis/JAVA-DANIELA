/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Bundle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Daniel
 */
public class BundleDA {
    public void addBundles(ArrayList<Bundle> bundles) throws SQLException{
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        for(Bundle bundle : bundles){
            CallableStatement cst = con.prepareCall(Constants.addBundleProcedure);
            cst.setInt("_idSupplierOrder", bundle.getIdOrder());
            cst.setInt("_idProd", bundle.getIdProduct());
            cst.setInt("_cantProd", bundle.getQuantity());
            cst.setDate("_expirationDate", bundle.getExpirationDate());
            cst.setDouble("_costUnit", bundle.getAdqPrice());
            
            cst.execute();
            
        }
        con.close();
    }
}
