/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author alulab14
 */
public class Constants {
    //BD CONNECTION
    public static String urlBD = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g3";
    public static String userBD = "inf282g3";
    public static String passwordBD = "H9u1oC";
    
    //STORED PROCEDURES: DISCOUNT
    public static String addDiscountProcedure = "{call addToBDDiscount(?,?,?,?)}";
    public static String modifyDiscountProcedure = "{call updateDiscount(?,?,?,?,?,?)}";
    public static String deleteDiscountProcedure = "{call deleteInBDDiscount(?)}";
    public static String searchDiscountProcedure = "{call listDiscounts(?,?)}";
    
    //STORED PROCEDURES: EMPLOYEE
    public static String addEmployeeProcedure = "{call addToBDEmployee(?,?,?,?,?,?,?,?)}";
    public static String modifyEmployeeProcedure = "{call updateInBDEmployee(?,?,?,?,?,?,?,?,?)}";
    public static String deleteEmployeeProcedure = "{call deleteInBDEmployee(?)}";
    public static String searchEmployeeProcedure = "{call listEmployees(?,?,?,?)}";
    
    //STORED PROCEDURES: PACKAGE
    public static String addPackageProcedure = "addToBDPackage";
    public static String modifyPackageProcedure = "updateInBDPackage";
    public static String deletePackageProcedure = "deleteInBDPackage";
    
    //STORED PROCEDURES: PRODUCT
    public static String searchProductProcedure = "{call listProducts(?,?,?)}"; 
    public static String addProductProcedure = "{call addToBDProduct(?,?,?,?,?,?)}";
    
    //SYMPTOMS
    public static String searchSymptomQuery = "SELECT * FROM Tag";
    public static String addSymptomProcedure = "{call addToBDTag(?)}";
    
}
