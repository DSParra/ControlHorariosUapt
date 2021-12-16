/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author JParra
 */
public class pruebaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] horas = {
        "09:20",
        "09:50",
        "10:20",
        "Incorrecto",
        "15:25",
        "01:00",
        "00:00",
        "0",
        "",
        "  ",
        "  ",
        "00",
        "2:20"
        };        
        for (int i = 0; i < horas.length; i++) {
            Pattern pat = Pattern.compile("[0-9][0-9]:[0-9][0-9]");
            Matcher mat = pat.matcher(horas[i]);
            if (mat.find()) {
                 System.out.println("Paso"+horas[i]);
            }else{
                 System.out.println("No Paso"+horas[i]);
            } 
        }
        
        
        
        
    }
    
}
