/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author Daniel
 */
public class Bundle {

    private int id;
    private int idProduct;
    private int idOrder;
    private int quantity;
    private double adqPrice;
    private Date expirationDate;    

    public Bundle(int idOrder, int idProduct, int quantity, Date expirationDate, double adqPrice) {
        this.idProduct = idProduct;
        this.idOrder = idOrder;
        this.quantity = quantity;
        this.adqPrice = adqPrice;
        this.expirationDate = expirationDate;
    }

    
    public Bundle(){
    }
    
    /**
     * @return the adqPrice
     */
    public double getAdqPrice() {
        return adqPrice;
    }

    /**
     * @param adqPrice the adqPrice to set
     */
    public void setAdqPrice(double adqPrice) {
        this.adqPrice = adqPrice;
    }

    /**
     * @return the idOrder
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     * @param idOrder the idOrder to set
     */
    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
            
    
    
    
}
