/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            Product p = new Product(rs.getInt("IdProduct"), rs.getString("Name"));
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
        Product p = new Product(rs.getInt("IdProduct"), rs.getString("Name"));
        con.close();
        return p;
    }
     
}
