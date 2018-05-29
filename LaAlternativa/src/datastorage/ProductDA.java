/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Product;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class ProductDA {

    public int addProduct(Product p) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement st = con.prepareCall(Constants.addProductProcedure);
        st.setString(1, p.getName());
        st.setDouble(2, p.getPrice());
        st.setInt(3, p.getNeedsPrescription());
        st.setInt(4, p.getPoints());
        st.setInt(5, p.getMinStock());
        st.setInt(6, p.getMaxStock());
        st.registerOutParameter("_idProduct", java.sql.Types.INTEGER);
        st.executeUpdate();
        int id = st.getInt("_idProduct");
        con.close();
        return id;
    }
    
    public void addProductXTag(int prodId, int tagId) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.addProductXTagProcedure);
        st.setInt(1, prodId);
        st.setInt(2, tagId);
        st.executeUpdate();
        con.close();
    }    

    public void updateProduct(Product p) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.modifyProductProcedure);
        st.setInt(1, p.getId());
        st.setString(2, p.getName());
        st.setDouble(3, p.getPrice());
        st.setInt(4, p.getNeedsPrescription());
        st.setInt(5, p.getPoints());
        st.setInt(6, p.getMinStock());
        st.setInt(7, p.getMaxStock());
        st.executeUpdate();
        con.close();
    }

    public void deleteProduct(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteProductProcedure);
        st.setInt(1, id);
        st.executeUpdate();
        con.close();
    }

    public ArrayList<Product> searchProducts(Integer _id, String _name, Double _price) throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.searchProductProcedure);
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
        if (_price == null) {
            st.setNull(3, Types.DOUBLE);
        } else {
            st.setDouble(3, _price);
        }
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("IdProduct");
            String name = rs.getString("Name");
            double price = rs.getDouble("Price");
            int presc = rs.getInt("NeedsPrescription");
            int points = rs.getInt("Points");
            int totalItems = rs.getInt("TotalItems");
            int minS = rs.getInt("MinStock");
            int maxS = rs.getInt("MaxStock");
            Product p = new Product(id, name, price, presc, points, totalItems, minS, maxS);
            list.add(p);
        }
        con.close();
        return list;
    }
    

}
