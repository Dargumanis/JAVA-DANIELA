/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class ProductDA {

    public ArrayList<Product> searchAllProducts() throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Constants.searchProductQuery);
        while (rs.next()) {
            Product p = new Product(rs.getInt("IdProduct"), rs.getString("Name"), rs.getDouble("Price"));
            list.add(p);
        }
        con.close();
        return list;
    }

    public Product searchProducts(String name) throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(Constants.searchProduct2Query + name + "'");
        rs.next();
        Product p = new Product(rs.getInt("IdProduct"), rs.getString("Name"), rs.getDouble("Price"));
        con.close();
        return p;
    }
    
    public ArrayList<Product> searchProducts2(Integer _id, String _name, String _tag, Double _price) throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.searchEmployeeProcedure);
        if (_id == null) {
            st.setNull(1, Types.INTEGER);
        } else {
            st.setInt(1, _id);
        }
        if (_name == null) {
            st.setNull(2, Types.VARCHAR);
        } else {
            st.setString(2, _name);
        }
        if (_tag == null) {
            st.setNull(3, Types.VARCHAR);
        } else {
            st.setString(3, _tag);
        }
        if (_price == null) {
            st.setNull(4, Types.DOUBLE);
        } else {
            st.setDouble(4, _price);
        }
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("IdProduct");
            String name = rs.getString("Name");
            double price = rs.getDouble("Price");
//            int presc = rs.getInt("Prescription");
//            int points = rs.getInt("Points");
//            int totalItems = rs.getInt("TotalItems");
//            int minS = rs.getInt("MinStock");
//            int maxS = rs.getInt("MaxStock");
            Product p = new Product(id, name, price);
            list.add(p);
        }
        con.close();
        return list;
    }
     

}
