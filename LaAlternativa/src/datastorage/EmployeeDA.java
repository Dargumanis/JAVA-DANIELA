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
import java.sql.Types;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class EmployeeDA {

    public void addEmployee(Employee e) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.addEmployeeProcedure);
        st.setString(1, e.getAddress());
        st.setString(2, e.getPhoneNumber());
        st.setString(3, e.getEmail());
        st.setString(4, e.getDni());
        st.setString(5, e.getName());
        st.setString(6, e.getSurname());
        st.setString(7, e.getPassword());
        st.setInt(8, e.getType());
        st.executeUpdate();
    }

    public void modifyEmployee(Employee e) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.modifyEmployeeProcedure);
        st.setInt(1, e.getId());
        st.setString(2, e.getAddress());
        st.setString(3, e.getPhoneNumber());
        st.setString(4, e.getEmail());
        st.setString(5, e.getDni());
        st.setString(6, e.getName());
        st.setString(7, e.getSurname());
        st.setString(8, e.getPassword());
        st.setInt(9, e.getType());
        st.executeUpdate();
        con.close();
    }

    public void deleteEmployee(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.deleteEmployeeProcedure);
        st.setInt(1, id);
        st.executeUpdate();
        con.close();
    }

    public ArrayList<Employee> searchEmployees(Integer _id, String _dni, String _name, String _surname) throws SQLException {
        ArrayList<Employee> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.searchEmployeeProcedure);
        if (_id == null) {
            st.setNull(1, Types.INTEGER);
        } else {
            st.setInt(1, _id);
        }
        if (_dni == null) {
            st.setNull(2, Types.VARCHAR);
        } else {
            st.setString(2, _dni);
        }
        if (_name == null) {
            st.setNull(3, Types.VARCHAR);
        } else {
            st.setString(3, _name);
        }
        if (_surname == null) {
            st.setNull(4, Types.VARCHAR);
        } else {
            st.setString(4, _surname);
        }
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            int state = rs.getInt("State");
            if (state == 0) {
                continue;
            }
            int id = rs.getInt("IdPerson");
            String phoneNumber = rs.getString("PhoneNumber");
            String email = rs.getString("Email");
            String dni = rs.getString("Dni");
            String name = rs.getString("Name");
            String surname = rs.getString("Surname");
            String address = rs.getString("Address");
            String password = rs.getString("Password");
            int type = rs.getInt("Type");
            Employee e = new Employee(id, dni, name, surname, address, password, email, phoneNumber, type);
            list.add(e);
        }
        con.close();
        return list;
    }
}
