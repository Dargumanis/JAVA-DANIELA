/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Supplier;
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
public class SupplierDA {

    public void addSupplier(Supplier s) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.addSupplierProcedure);
        st.setString(1, s.getRuc());
        st.setString(2, s.getName());
        st.setString(3, s.getAddress());
        st.setString(4, s.getPhone());
        st.setString(5, s.getEmail());
        st.executeUpdate();
        con.close();

    }

    public void modifySupplier (Supplier s) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.modifySupplierProcedure);
        st.setInt(1, s.getId());
        st.setString(2, s.getRuc());
        st.setString(3, s.getName());
        st.setString(4, s.getAddress());
        st.setString(5, s.getPhone());
        st.setString(6, s.getEmail());
        st.executeUpdate();
        con.close();
    }
    
    public void deleteSupplier(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteSupplierProcedure);
        st.setInt(1, id);
        st.executeUpdate();
        con.close();
    }
    
    public ArrayList<Supplier> searchSuppliers(Integer _id, String _ruc, String _name) throws SQLException {
        ArrayList<Supplier> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.searchSupplierProcedure);
        if (_id == null) {
            st.setNull(1, Types.INTEGER);
        } else {
            st.setInt(1, _id);
        }
        if (_ruc == null) {
            st.setNull(2, Types.VARCHAR);
        } else {
            st.setString(2, _ruc);
        }
        if (_name == null) {
            st.setNull(3, Types.VARCHAR);
        } else {
            st.setString(3, _name);
        }
        
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int state = rs.getInt("State");
            if (state == 0) {
                continue;
            }
            int id = rs.getInt("IdSupplier");
            String ruc = rs.getString("Ruc");
            String name = rs.getString("Name");
            String address = rs.getString("Address");
            String phoneNumber = rs.getString("PhoneNumber");
            String email = rs.getString("Email");
            
            Supplier s = new Supplier(id, ruc, name, address, phoneNumber, email);
            list.add(s);
        }
        con.close();
        return list;
    }
}
