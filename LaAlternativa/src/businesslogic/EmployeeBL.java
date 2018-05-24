/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.EmployeeDA;
import entities.Employee;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EmployeeBL {
    public EmployeeDA dataAccess;
    
    public EmployeeBL() {
        dataAccess = new EmployeeDA();
    }
    
    public void addEmployee(Employee e) {
        dataAccess.addEmployee(e);
    }
    
    public void modifyEmployee(Employee e) {
        dataAccess.modifyEmployee(e);
    }
    
    public void deleteEmployee(int id) {
        dataAccess.deleteEmployee(id);
    }
    
    public ArrayList<Employee> searchEmployees(Integer _id, String _dni, String _name, String _surname) {
        ArrayList<Employee> list = dataAccess.searchEmployees( _id,  _dni,  _name,  _surname);
        return list;
    }
}
