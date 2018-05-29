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

    public int addProduct(Product p) throws SQLException {
        return dataAccess.addProduct(p);
    }
    
    public void addProductXTag(int idProd, int idTag) throws SQLException {
        dataAccess.addProductXTag(idProd, idTag);
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
