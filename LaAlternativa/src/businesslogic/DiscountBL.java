/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.DiscountDA;
import entities.Discount;
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
    
    public void addDiscount(Discount d) {
        dataAccess.addDiscount(d);
    }
    
    public void modifyDiscount(Discount d) {
        dataAccess.modifyDiscount(d);
    }
    
    public void deleteDiscount(int id) {
        dataAccess.deleteDiscount(id);
    }
    
    public ArrayList<Discount> searchDiscounts(int id, int clientPointsRequired, int productId, double factor) {
        ArrayList<Discount> list = dataAccess.searchDiscounts(id, clientPointsRequired, productId, factor);
        return list;
    }
    
}
