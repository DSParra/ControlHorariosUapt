/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mosh_
 */
public class GeneraCodigo
{
    private final int cont = 1;
    private String num = "";

    public void generar(int consecutivo)
    {
        int canF;
        if ((consecutivo >= 1000) || (consecutivo < 10000))
        {
            canF = cont + consecutivo;
            num = "" + canF;
        }
        if ((consecutivo >= 100) || (consecutivo < 1000))
        {
            canF = cont + consecutivo;
            num = "0" + canF;
        }
    }

    public String serie()
    {
        return this.num;
    }

}
