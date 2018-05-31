/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.DiscountDA;
import entities.Discount;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class DiscountBL {
    public DiscountDA dataAccess;
    
    public DiscountBL() {
        dataAccess = new DiscountDA();
    }
    
    public int addDiscount(Discount d) throws SQLException {
        return dataAccess.addDiscount(d);
    }
    
    public void modifyDiscount(Discount d) throws SQLException {
        dataAccess.modifyDiscount(d);
    }
    
    public void deleteDiscount(int id) throws SQLException {
        dataAccess.deleteDiscount(id);
    }
    
    public void deleteAllForProduct(int id) throws SQLException {
        dataAccess.deleteAllForProduct(id);
    }
    
    public ArrayList<Discount> searchDiscounts(Integer id, Integer productId) throws SQLException {
        ArrayList<Discount> list = dataAccess.searchDiscounts(id, productId);
        return list;
    }
    
}
