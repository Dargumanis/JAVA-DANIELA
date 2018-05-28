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
}
