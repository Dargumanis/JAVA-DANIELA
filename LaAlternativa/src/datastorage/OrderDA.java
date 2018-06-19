/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.*;
import java.sql.*;
import java.util.ArrayList;
import utils.Constants;

/**
 *
 * @author Daniel
 */
public class OrderDA {
    
    public int addOrderDA(Order o) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.addOrderProcedure);
        cst.setDate("_expirationDate", o.getTransactionDate());
        cst.setInt("_idSupplier", o.getIdSupplier());
        cst.execute();
        int id= cst.getInt("_idSupplierOrder");
        con.close();
        return id;
    }

    public void modifyOrder (Order o) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.modifyOrderProcedure);
        cst.setInt("_idSupplierOrder", o.getId());
        cst.setDate("_transactionDate", o.getTransactionDate());
        cst.setInt("id_supplier", o.getIdSupplier());
        cst.execute();
        con.close();
    }
    
    public void deleteOrder(int id) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.deleteOrderProcedure);
        cst.setInt("_idSupplierOrder", id);
        cst.execute();
        con.close();
    }
    
    public ArrayList<Order> searchOrders(Integer _idOrder, Integer _idSupplier, String _transactionDate) throws SQLException {
        ArrayList<Order> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.searchOrdersProcedure);
        if (_idOrder == null) {
            cst.setNull("_idSupplierOrder", Types.INTEGER);
        } else {
            cst.setInt("_idSupplierOrder", _idOrder);
        }
        if (_idSupplier == null) {
            cst.setNull("_idSupplier", Types.INTEGER);
        } else {
            cst.setInt("_idSupplier",_idSupplier );
        }
        if (_transactionDate == null) {
            cst.setNull("_fecha", Types.DATE);
        } else {
            cst.setDate("_fecha", Date.valueOf(_transactionDate));
        }
        
        ResultSet rs = cst.executeQuery();
        while (rs.next()) {
            int state = rs.getInt("State");
            if (state == 0) {
                continue;
            }
            int id = rs.getInt("IdSupplierOrder");
            int idSupplier = rs.getInt("Supplier_IdSupplier");
            Date fecha = rs.getDate("TransactionDate");
            Order o = new Order();
            o.setId(id);
            o.setIdSupplier(idSupplier);
            o.setTransactionDate(fecha);
            list.add(o);
        }
        con.close();
        return list;
    }
    
}
