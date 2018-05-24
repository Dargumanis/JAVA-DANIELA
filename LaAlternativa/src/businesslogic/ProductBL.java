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

    public ArrayList<Product> searchAllProducts() throws SQLException {
        ArrayList<Product> list = dataAccess.searchAllProducts();
        return list;
    }

    public Product searchProducts(String name) throws SQLException {
        Product p = dataAccess.searchProducts(name);
        return p;
    }

    public ArrayList<Product> searchProducts2(Integer _id, String _name, String _tag, Double _price) throws SQLException {
        ArrayList<Product> list = dataAccess.searchProducts2(_id, _name, _tag, _price);
        return list;
    }
}
