/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author alulab14
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private boolean needsPrescription;
    private double utility;
    private int points;
    private int totalItems;
    private int minStock;
    private int maxStock;
    private String discounts;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, double price, boolean needsPrescription, double utility, int points, int totalItems, int minStock, int maxStock, String discounts) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.needsPrescription = needsPrescription;
        this.utility = utility;
        this.points = points;
        this.totalItems = totalItems;
        this.minStock = minStock;
        this.maxStock = maxStock;
        this.discounts = discounts;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the needsPrescription
     */
    public boolean isNeedsPrescription() {
        return needsPrescription;
    }

    /**
     * @param needsPrescription the needsPrescription to set
     */
    public void setNeedsPrescription(boolean needsPrescription) {
        this.needsPrescription = needsPrescription;
    }

    /**
     * @return the utility
     */
    public double getUtility() {
        return utility;
    }

    /**
     * @param utility the utility to set
     */
    public void setUtility(double utility) {
        this.utility = utility;
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }
    



    /**
     * @return the totalItems
     */
    public int getTotalItems() {
        return totalItems;
    }

    /**
     * @param totalItems the totalItems to set
     */
    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    /**
     * @return the minStock
     */
    public int getMinStock() {
        return minStock;
    }

    /**
     * @param minStock the minStock to set
     */
    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    /**
     * @return the maxStock
     */
    public int getMaxStock() {
        return maxStock;
    }

    /**
     * @param maxStock the maxStock to set
     */
    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    /**
     * @return the discounts
     */
    public String getDiscounts() {
        return discounts;
    }

    /**
     * @param discounts the discounts to set
     */
    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    
}
