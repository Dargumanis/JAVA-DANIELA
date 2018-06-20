/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import entities.Request;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Constants;
import utils.Enumerators;

/**
 *
 * @author alulab14
 */
public class RequestDA {
    public ArrayList<Request> listRequest(ArrayList<String> fullName){
        ArrayList<Request> list = new ArrayList<>();
        //fullName.clear();
        try{
            Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
            PreparedStatement st = con.prepareStatement(Constants.listRequestProcedure);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Request r = new Request();
                r.setDescription(rs.getString("Description"));
                String t = rs.getString("Type");
                if(t.equals("Sugerencia")) r.setType(Enumerators.RequirementType.Sugerencia);
                else if(t.equals("Problema")) r.setType(Enumerators.RequirementType.Problema);
                else r.setType(Enumerators.RequirementType.Otro);
                r.setIdRequest(rs.getInt("IdRequirement"));
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                fullName.add(name+" "+surname);
                list.add(r);
            }
            con.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    public void requestAttended(int num) throws SQLException{
        Connection con = DriverManager.getConnection(Constants.urlBD, Constants.userBD, Constants.passwordBD);
        CallableStatement cst = con.prepareCall(Constants.requestAtended);
        cst.setInt(1, num);
        cst.execute();
        con.close();
        
    }
}
