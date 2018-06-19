/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import com.mysql.jdbc.CallableStatement;
import entities.Request;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                if(t.equals("sugerencia")) r.setType(Enumerators.RequirementType.Sugerencia);
                else if(t.equals("problema")) r.setType(Enumerators.RequirementType.Problema);
                else r.setType(Enumerators.RequirementType.Otro);
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                System.out.println(r.getDescription()+" "+r.getType().toString());
                fullName.add(name+" "+surname);
                list.add(r);
            }
            con.close();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
