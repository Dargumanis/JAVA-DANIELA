/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import com.mysql.jdbc.exceptions.MySQLDataException;
import datastorage.EmployeeDA;
import entities.Employee;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EmployeeBL {
    public EmployeeDA dataAccess;
    
    public EmployeeBL() {
        dataAccess = new EmployeeDA();
    }
    
    public int addEmployee(Employee e) throws SQLException {
        return dataAccess.addEmployee(e);
    }
    
    public void modifyEmployee(Employee e) throws SQLException {
        dataAccess.modifyEmployee(e);
    }
    
    public void deleteEmployee(int id) throws SQLException {
        dataAccess.deleteEmployee(id);
    }
    
    public ArrayList<Employee> searchEmployees(Integer _id, String _dni, String _name, String _surname) throws SQLException {
        ArrayList<Employee> list = dataAccess.searchEmployees( _id,  _dni,  _name,  _surname);
        return list;
    }
    
    public boolean passwordVerify(String user, String password){
        boolean flag=false;
        String passwordBD = dataAccess.returnPassword(user);
        if(passwordBD.equals("hWWelzAlRgVkPUj")) flag = false;
        if(passwordBD.equals(password)) flag=true;
        return flag;
    }

    public Employee getEmployee(String user){
        Employee e = new Employee();
        try {
            e = dataAccess.getEmployee(user);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }
}
