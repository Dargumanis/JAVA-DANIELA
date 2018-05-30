/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Symptom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class SymptomDA {

    public void addSymptom(Symptom s) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.addSymptomProcedure);
            st.setString(1, s.getName());
            st.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error al agregar síntoma: " + ex.toString());
        }
    }

    public ArrayList<Symptom> searchSymptoms() {
        ArrayList<Symptom> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Constants.searchSymptomQuery);
            while (rs.next()) {
                Symptom s = new Symptom(rs.getInt("IdTag"), rs.getString("Descripcion"));
                list.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar sintomas: " + ex.toString());
        }
        return list;
    }

    public int searchSymptom(String name) throws SQLException {
        int id = -1;
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        String query = Constants.searchSymptomQuery + "WHERE Descripcion = '" + name + "'";
        ResultSet rs = st.executeQuery(query);
        rs.next();
        id = rs.getInt("IdTag");
        con.close();
        return id;
    }

    public String searchSymptoms(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        String query = Constants.searchSymptomQuery + "WHERE IdTag = " + id;
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name = rs.getString("Descripcion");
        con.close();
        return name;
    }

    public ArrayList<Integer> searchProductSymptoms(int id) throws SQLException {
        ArrayList<Integer> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        Statement st = con.createStatement();
        String query = Constants.searchProductSymptomQuery + id;
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Integer _id = rs.getInt("Tag_IdTag");
            list.add(_id);
        }
        con.close();
        return list;
    }

    public void deleteProductXTag(int prodId, int tagId) throws SQLException {

        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteProductXTagProcedure);
        st.setInt(1, prodId);
        st.setInt(2, tagId);
        st.executeUpdate();
        con.close();

    }

}
