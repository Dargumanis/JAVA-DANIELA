/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.RequestDA;
import entities.Product;
import entities.Request;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alulab14
 */
public class RequestBL {
    private RequestDA dataAccess;
    public RequestBL(){
        dataAccess = new RequestDA();
    }
    public ArrayList<Request> listRequest(ArrayList<String> fullName) throws SQLException{
        return dataAccess.listRequest(fullName);
    }
    public void requestAttended(){
        
    }
}
