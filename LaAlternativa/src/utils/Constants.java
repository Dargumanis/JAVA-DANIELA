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
    public static String addDiscountProcedure = "{call addToBDDiscount(?,?,?,?,?)}";
    public static String modifyDiscountProcedure = "{call updateInBDDiscount(?,?,?,?,?,?)}";
    public static String deleteDiscountProcedure = "{call deleteInBDDiscount(?)}";
    public static String searchDiscountProcedure = "{call listDiscounts(?,?)}";
    
    //STORED PROCEDURES: EMPLOYEE
    
    public static String getPasswordProcedure = "{call getPassword(?,?)}";
    public static String getEmployeeProcedure = "{call getEmployee(?,?,?,?)}";
    public static String addEmployeeProcedure = "{call addToBDEmployee(?,?,?,?,?,?,?,?,?)}";
    public static String modifyEmployeeProcedure = "{call updateInBDEmployee(?,?,?,?,?,?,?,?,?)}";
    public static String deleteEmployeeProcedure = "{call deleteInBDEmployee(?)}";
    public static String searchEmployeeProcedure = "{call listEmployees(?,?,?,?)}";
    public static String deleteAllDiscounts = "{call deleteInBDAllDiscountsForAProduct(?)}";
    
    //STORED PROCEDURES: PACKAGE
    public static String addPackageProcedure = "addToBDPackage";
    public static String modifyPackageProcedure = "updateInBDPackage";
    public static String deletePackageProcedure = "deleteInBDPackage";
    
    //STORED PROCEDURES: PRODUCT
    public static String searchProductProcedure = "{call listProducts(?,?,?)}"; 
    public static String addProductProcedure = "{call addToBDProduct(?,?,?,?,?,?,?)}";
    public static String modifyProductProcedure = "{call updateInBDProduct(?,?,?,?,?,?,?)}";
    public static String deleteProductProcedure = "{call deleteInBDProduct(?)}";
    public static String addProductXTagProcedure = "{call addToBDProductXTag(?,?)}";
    
    //STORED PROCEDURES: SUPPLIERS
    public static String addSupplierProcedure = "{call addToBDSupplier(?,?,?,?,?)}";
    public static String modifySupplierProcedure = "{call updateInBDSupplier(?,?,?,?,?,?)}";
    public static String deleteSupplierProcedure = "{call deleteInBDSupplier(?)}";
    public static String searchSupplierProcedure = "{call listSupplier(?,?,?)}";
    
    //SYMPTOMS
    public static String searchSymptomQuery = "SELECT * FROM Tag ";
    public static String addSymptomProcedure = "{call addToBDTag(?)}";
    public static String searchProductSymptomQuery = "SELECT * FROM ProductXTag WHERE Product_IdProduct = ";
    public static String deleteProductXTagProcedure = "{call deleteInBDProductXTag(?,?)}";
    
    //ORDERS
    public static String getSupplierNameProcedure = "{call getSupplierName(?,?)}";
    public static String addOrderProcedure = "{call addToBDSupplierOrder(?,?,?)}";
    public static String modifyOrderProcedure = "{call updateInBDSupplierOrder(?,?,?)}";
    public static String deleteOrderProcedure = "{call deleteInBDSupplierOrder(?)}";
    public static String searchOrdersProcedure= "{call listSupplierOrder(?,?,?,?)}";
    
    //BUNDLES
    public static String addBundleProcedure = "{call addToBDBundle(?,?,?,?,?)}";
    public static String modifyBundleProcedure = "{call updateInBDBundle(?,?,?,?,?,?,?,?,?,?)}";
    //public static String deleteBundleProcedure = "{call deleteInBDBundle(?)}";
    public static String deleteBundlesProcedure = "{call deleteInBDBundles(?)}";
    public static String searchBundleQuery = "SELECT * FROM Bundle WHERE idSupplierOrder = ";
    
    //LOGIN
    private static String CurrentUserText;
    private static String CurrentUserName;
    private static String CurrentPassword;
    private static int CurrentUserID;
    
    //REQUESTS
    public static String listRequestProcedure = "SELECT R.Description, R.Type, E.Name, E.Surname FROM Requirement R, Employee E WHERE R.Employee_IdPerson = E.Person_IdPerson and R.State = 1;";

    public static String getCurrentUserText() {
        return CurrentUserText;
    }

    public static void setCurrentUserText(String aCurrentUserText) {
        CurrentUserText = aCurrentUserText;
    }

    public static String getCurrentUserName() {
        return CurrentUserName;
    }

    public static void setCurrentUserName(String aCurrentUserName) {
        CurrentUserName = aCurrentUserName;
    }

    public static String getCurrentPassword() {
        return CurrentPassword;
    }

    public static void setCurrentPassword(String aCurrentPassword) {
        CurrentPassword = aCurrentPassword;
    }

    public static int getCurrentUserID() {
        return CurrentUserID;
    }

    public static void setCurrentUserID(int aCurrentUserID) {
        CurrentUserID = aCurrentUserID;
    }
}
