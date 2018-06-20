/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Patrick
 */
public class DataValidation {
    
    public DataValidation(){}
    
    public boolean ValidField(String pattern, String text){
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(text);
        return match.matches();     
    }
}
