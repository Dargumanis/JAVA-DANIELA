/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class EmployeeDA {
    
    
    public void addEmployee(Employee e) {
        try {                    
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.addEmployeeProcedure);
            st.setString(1, e.getAddress());
            st.setInt(2, e.getPhoneNumber());
            st.setString(3, e.getEmail());
            st.setString(4, String.valueOf(e.getDni()));
            st.setString(5, e.getName());
            st.setString(6, e.getSurname());
            st.setString(7, e.getPassword());
            st.setInt(8, e.getType());
            st.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println("Error al agregar empleado: "  + ex.toString());
        }
    }
    
    public void modifyEmployee(Employee e) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.modifyEmployeeProcedure);
            st.setString(1, e.getDni());
            st.setString(1, e.getAddress());
            st.setInt(2, e.getPhoneNumber());
            st.setString(3, e.getEmail());
            st.setString(4, e.getDni());
            st.setString(5, e.getName());
            st.setString(6, e.getSurname());
            st.setString(7, e.getPassword());
            st.setInt(8, e.getType());
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al modificar empleado");
        }
    }
    
    public void deleteEmployee(int id) {
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.deleteEmployeeProcedure);
            st.setInt(1, id);
            st.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar empleado");
        }
    }
    
    public ArrayList<Employee> searchEmployees(Integer _id, String _dni, String _name, String _surname) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.searchEmployeeProcedure);
            st.setInt(1,_id);
            st.setString(2, _dni);
            st.setString(3, _name);
            st.setString(4, _surname);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Person_IdPerson");
                String dni = rs.getString("Dni");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                String password = rs.getString("Password");
                int type = rs.getInt("Type");
                int changePassword = rs.getInt("ChangePassword");
                Employee e = new Employee(dni, name, surname, name, changePassword, name, password, type);
                list.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar empleados");
        }
        return list;
    }
}
