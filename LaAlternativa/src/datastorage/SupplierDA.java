/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Supplier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.Constants;

/**
 *
 * @author Usuario
 */
public class SupplierDA {

    public void addSupplier(Supplier s) throws SQLException {
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        PreparedStatement st = con.prepareStatement(Constants.addSupplierProcedure);
        st.setString(1, s.getRuc());
        st.setString(2, s.getName());
        st.setString(3, s.getAddress());
        st.setString(4, s.getPhone());
        st.executeUpdate();
        con.close();

    }
}
