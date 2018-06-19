/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
/**
 *
 * @author alulab14
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int needsPrescription;
    private int points;
    private int totalItems;
    private int minStock;
    private int maxStock;
    ArrayList<Symptom> symptoms;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price, int needsPrescription, int points, int totalItems, int minStock, int maxStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.needsPrescription = needsPrescription;
        this.points = points;
        this.totalItems = totalItems;
        this.minStock = minStock;
        this.maxStock = maxStock;
    }
    
    public Product(String name, double price, int needsPrescription, int points, int minStock, int maxStock) {
        this.name = name;
        this.price = price;
        this.needsPrescription = needsPrescription;
        this.points = points;
        this.minStock = minStock;
        this.maxStock = maxStock;        
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
    public int getNeedsPrescription() {
        return needsPrescription;
    }

    /**
     * @param needsPrescription the needsPrescription to set
     */
    public void setNeedsPrescription(int needsPrescription) {
        this.needsPrescription = needsPrescription;
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

    public String getTag() {
        return symptoms.get(0).getName();
    }
    
    public void addSymptom(Symptom s) {
        symptoms.add(s);
    }
    
}
