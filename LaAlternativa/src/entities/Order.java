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
public class Order {

    /**
     * @return the transactionDate
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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
     * @return the bundles
     */
    public ArrayList<Bundle> getBundles() {
        return bundles;
    }

    /**
     * @param bundles the bundles to set
     */
    public void setBundles(ArrayList<Bundle> bundles) {
        this.bundles = bundles;
    }

    /**
     * @return the idSupplier
     */
    public int getIdSupplier() {
        return idSupplier;
    }

    /**
     * @param idSupplier the idSupplier to set
     */
    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    
    private int id;
    private ArrayList<Bundle> bundles;
    private int idSupplier;
    private Date transactionDate;
    private String nameSupplier;
    
    public Order(){
        bundles= new ArrayList<>();
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }
    
}
