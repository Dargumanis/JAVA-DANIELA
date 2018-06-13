/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.BundleDA;
import entities.Bundle;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class BundleBL {
    private BundleDA bundleDA;
    public BundleBL(){
        bundleDA= new BundleDA();
    }
    public void addBundles(ArrayList<Bundle> bundles) throws SQLException{
        bundleDA.addBundles(bundles); //FALTA IMPLEMENTAR
    }
    
    public void deleteBundles(int orderId) throws SQLException {
        bundleDA.deleteBundles(orderId);
    }
    
    public ArrayList<Bundle> searchBundles (int orderId) throws SQLException {
        return bundleDA.searchBundles(orderId);
    }
    
}
