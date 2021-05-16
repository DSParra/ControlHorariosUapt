/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Objetos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author JParra
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Profesor> profesores = new ArrayList();
        profesores.add(new Profesor("xml", "", "", "", "", "", ""));
        profesores.add(new Profesor("alksjdas", "", "", "", "", "", ""));
        profesores.add(new Profesor("lskljda", "", "", "", "", "", ""));
        profesores.add(new Profesor("andjhk", "", "", "", "", "", ""));
        profesores.add(new Profesor("pskldjal", "", "", "", "", "", ""));
        profesores.add(new Profesor("opwiejk", "", "", "", "", "", ""));
        profesores.add(new Profesor("asñdlk", "", "", "", "", "", ""));
        profesores.add(new Profesor("apldnq", "", "", "", "", "", ""));
        profesores.add(new Profesor("qsmdpo", "", "", "", "", "", ""));
        profesores.add(new Profesor("assjkdn,", "", "", "", "", "", ""));
        profesores.add(new Profesor("atsndlka", "", "", "", "", "", ""));
        profesores.add(new Profesor("a,msdnq", "", "", "", "", "", ""));
        System.out.println(profesores.contains("xml"));
        profesores.

        

        for (Profesor p : profesores) {
            System.out.println(p.getRfc());
        }
    }

    public static ArrayList<Profesor> ordenamientoBurbuja(ArrayList<Profesor> profes) {
        Profesor auxiliar;
        ArrayList<Profesor> profesores = new ArrayList();
        int[] arregloOrdenado;
        for (int i = 2; i < profes.size(); i++) {
            for (int j = 0; j < profes.size() - i; j++) {
                if (profes.get(j).getRfc().compareToIgnoreCase(profes.get(j + 1).getRfc()) > 0) {
                    auxiliar = profes.get(j);
                    profes.set(j, profes.get(j + 1));
                    profes.set(j + 1, auxiliar);
                }
            }
        }
        profesores = profes;
        return profesores;
    }

    public static int busquedaBinaria(int vector[], int dato) {
        int n = vector.length;
        int centro, inf = 0, sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (vector[centro] == dato) {
                return centro;
            } else if (dato < vector[centro]) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }
}
