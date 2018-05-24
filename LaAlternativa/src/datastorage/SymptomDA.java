/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Employee;
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
            System.out.println("Error al agregar síntoma: "  + ex.toString());
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
}
