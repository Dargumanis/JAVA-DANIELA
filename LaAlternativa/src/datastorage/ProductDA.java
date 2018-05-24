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
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class ProductDA {
    public void addProduct(Product p) {
        try {                    
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.addProductProcedure);
            st.setString(1, p.getName());
            st.setDouble(2, p.getPrice());
            st.setString(3, p.ge());
            st.setString(4, String.valueOf(p.getDni()));
            st.setString(5, e.getName());
            st.setString(6, e.getSurname());
            st.setString(7, e.getPassword());
            st.setInt(8, e.getType());
            st.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error al agregar producto: "  + ex.toString());
        }
    }
}
