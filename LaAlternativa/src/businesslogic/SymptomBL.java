/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.SymptomDA;
import entities.Symptom;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SymptomBL {
    public SymptomDA dataAccess;
    
    public SymptomBL() {
        dataAccess = new SymptomDA();
    }
    
    public void addSymptom(Symptom s) {
        dataAccess.addSymptom(s);
    }
    

    public ArrayList<Symptom> searchSymptom() throws SQLException {
        ArrayList<Symptom> list = dataAccess.searchSymptoms();
        return list;
    }
    
    public int searchSymptom(String name) throws SQLException {
        return dataAccess.searchSymptom(name);
    }
    
    public ArrayList<Integer> searchProductSymptoms(int id) throws SQLException {
        return dataAccess.searchProductSymptoms(id);
    }
    
    public String searchSymptoms(int id) throws SQLException {
        return dataAccess.searchSymptoms(id);
    }
    
    public void deleteProductXTag(int prodId, int tagId) throws SQLException {
        dataAccess.deleteProductXTag(prodId, tagId);
    }
}
