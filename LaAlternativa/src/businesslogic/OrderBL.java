/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.OrderDA;
import entities.Order;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class OrderBL {
    private OrderDA orderDA;
    public OrderBL(){
        orderDA= new OrderDA();
    }
    
    public String getSupplierName(int idSupplier){
        return orderDA.getSupplierName(idSupplier);
    }
    
    public int addOrder(Order o) throws SQLException {
        return orderDA.addOrderDA(o);
    }
    public void modifyOrder(Order o) throws SQLException{
        orderDA.modifyOrder(o);
    }
    
    public void deleteOrder(int id) throws SQLException{
        orderDA.deleteOrder(id);
    }
    public ArrayList<Order> searchOrders(Integer idOrder, Integer idSupplier, String transactionDate, String supplierName) throws SQLException{
        return orderDA.searchOrders(idOrder, idSupplier, transactionDate,supplierName);
    }
}
