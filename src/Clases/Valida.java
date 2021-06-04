/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author mvidalh
 */
public class Valida
{

    public static void convertirAMayusculas(JTextField caja) {
        String cadena = (caja.getText()).toUpperCase();
        caja.setText(cadena);
    }

    public static void convertirAMayusculasP(JPasswordField contra) {
        String cadena = (contra.getText()).toUpperCase();
        contra.setText(cadena);
    }
    
    public static void validaLongitud(JTextField caja, int limite, KeyEvent evt) {
        if (caja.getText().length() == limite)
        {
            evt.consume();
        }
    }
    
}
