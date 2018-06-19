/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Bundle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Daniel
 */
public class BundleDA {

    public void addBundles(ArrayList<Bundle> bundles) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        for (Bundle bundle : bundles) {
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

    public void deleteBundles(int orderId) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.deleteBundlesProcedure);
        cst.setInt("id", orderId);
        cst.execute();
        con.close();
    }

    public ArrayList<Bundle> searchBundles(int orderId) throws SQLException {
        ArrayList<Bundle> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        String query = Constants.searchBundleQuery + orderId + " AND State = 1";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Integer _idProd = rs.getInt("idProduct");
            Integer _cantProd = rs.getInt("ProductQuantity");
            Date _date = rs.getDate("ExpirationDate");
            Double _costUnit = rs.getDouble("CostUnit");
            Bundle b = new Bundle(orderId, _idProd, _cantProd, _date, _costUnit);
            list.add(b);
        }
        con.close();
        return list;
    }

}
