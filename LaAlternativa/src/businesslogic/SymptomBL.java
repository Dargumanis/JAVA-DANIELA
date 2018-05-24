/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datastorage.SymptomDA;
import entities.Employee;
import entities.Symptom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

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
    

    public Map<String, String> searchSymptom() throws SQLException {
        Map<String, String> map = dataAccess.searchSymptoms();
        return map;
    }
}
