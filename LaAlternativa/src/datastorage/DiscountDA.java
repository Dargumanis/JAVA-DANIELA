/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Discount;
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
 * @author alulab14
 */
public class DiscountDA {

    public int addDiscount(Discount d) throws SQLException {

        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement st = con.prepareCall(Constants.addDiscountProcedure);
        st.setInt(1, d.getClientPointsRequired());
        st.setString(2, d.getDescription());
        st.setDouble(3, d.getFactor());
        st.setInt(4, d.getProductId());
        st.registerOutParameter("_idDiscount", java.sql.Types.INTEGER);
        st.executeUpdate();
        int id = st.getInt("_idDiscount");
        con.close();
        return id;

    }

    public void modifyDiscount(Discount d) throws SQLException {

        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.modifyDiscountProcedure);
        st.setInt(1, d.getId());
        st.setInt(2, d.getClientPointsRequired());
        st.setString(3, d.getDescription());
        st.setInt(4, d.getProductId());
        st.setDouble(5, d.getFactor());
        st.setInt(6, d.getState());
        st.executeUpdate();
        con.close();

    }

    public void deleteDiscount(int id) throws SQLException {

        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteDiscountProcedure);
        st.setInt(1, id);
        st.executeUpdate();
        con.close();

    }

    public void deleteAllForProduct(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteAllDiscounts);
        st.setInt(1, id);
        st.executeUpdate();
        con.close();
    }

    public ArrayList<Discount> searchDiscounts(Integer id, Integer productId) throws SQLException {
        ArrayList<Discount> list = new ArrayList<>();

        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.searchDiscountProcedure);
        if (id == null) {
            st.setNull(1, Types.INTEGER);
        } else {
            st.setInt(1, id);
        }
        if (productId == null) {
            st.setNull(2, Types.INTEGER);
        } else {
            st.setInt(2, productId);
        }
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int state = rs.getInt("State");
            if (state == 0) {
                continue;
            }
            int dId = rs.getInt("IdDiscount");
            int points = rs.getInt("ClientPointsRequired");
            String description = rs.getString("Description");
            int pId = rs.getInt("Product_IdProduct");
            double fact = rs.getDouble("Factor");
            Discount d = new Discount(dId, points, description, pId, fact);
            list.add(d);
        }
        con.close();
        return list;
    }

}
