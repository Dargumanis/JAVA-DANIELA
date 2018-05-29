/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.ProductDA;
import entities.Product;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ProductBL {

    ProductDA dataAccess;

    public ProductBL() {
        dataAccess = new ProductDA();
    }

    public void addProduct(Product p) throws SQLException {
        dataAccess.addProduct(p);
    }
    
    public void updateProduct(Product p) throws SQLException {
        dataAccess.updateProduct(p);
    }
    
    public void deleteProduct(int id) throws SQLException {
        dataAccess.deleteProduct(id);
    }
    
    public ArrayList<Product> searchProducts(Integer _id, String _name, Double _price) throws SQLException {
        ArrayList<Product> list = dataAccess.searchProducts(_id, _name, _price);
        return list;
    }
}
