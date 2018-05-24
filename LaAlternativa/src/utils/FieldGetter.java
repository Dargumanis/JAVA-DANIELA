/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class FieldGetter {
    public static Integer getFieldInt(JTextField field) throws Exception {
        if ("".equals(field.getText())) {
            return null;
        } else {
            return Integer.parseInt(field.getText());
        }
    }
    
    public static String getFieldString(JTextField field) {
        if ("".equals(field.getText())) {
            return null;
        } else {
            return field.getText();
        }
    }
}
