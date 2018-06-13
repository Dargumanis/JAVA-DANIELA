/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import entities.Entity;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface BusinessFacade {
    ArrayList<Entity> listFromBD();
    void updateInBD(Entity e) throws SQLException ;
    void deleteInBD(int id) throws SQLException ;
}
