/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Discount;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author alulab14
 */
public class DiscountDA {
    public void addDiscount(Discount d) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.addDiscountProcedure);
            st.setInt(1, d.getClientPointsRequired());
            st.setString(2, d.getDescription());
            st.setDouble(3, d.getFactor());
            st.setInt(4, d.getProductId());
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            
            System.out.println("Error al agregar descuento: "  + ex.toString());
        }
    }
    
    public void modifyDiscount(Discount d) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.modifyDiscountProcedure);
            st.setInt(1, d.getId());
            st.setInt(2, d.getClientPointsRequired());
            st.setString(3, d.getDescription());
            st.setDouble(4, d.getFactor());
            st.setInt(5, d.getProductId());
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar descuento");
        }
    }
    
    public void deleteDiscount(int id) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.deleteDiscountProcedure);
            st.setInt(1, id);
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al anular descuento");
        }
    }
    
    public ArrayList<Discount> searchDiscounts(int id, int clientPointsRequired, int productId, double factor) {
        ArrayList<Discount> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.searchDiscountProcedure);
            st.setInt(1, id);
            st.setInt(2, clientPointsRequired);
            st.setInt(3, productId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int dId = rs.getInt("IdDiscount");
                int points = rs.getInt("ClientPointsRequired");
                String description = rs.getString("Description");
                int pId = rs.getInt("Product_IdProduct");
                double fact = rs.getDouble("Factor");
                int state = rs.getInt("State");
                Discount d = new Discount(dId, points, description, pId, fact);
                list.add(d);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar descuentos");
        }
        return list;
    }
    
    
    
}
