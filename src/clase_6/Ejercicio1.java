/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_6;

import java.util.Scanner;

/**
 *
 * @author hernán figueroa
 */
public class Ejercicio1 {

    /**
     * Realizar un programa donde se ingresan dos palabras e indicar cual tiene
menos caracteres.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.println("Ingrese la primera palabra");
        palabra1 = entradaUsuario.nextLine();
        System.out.println("Ingrese la segunda palabra");
        palabra2 = entradaUsuario.nextLine();
        
        System.out.println("-----------------------------");
        if (palabra1.length() > palabra2.length()) {
            System.out.println(palabra2 + " tiene menos caracteres");
        } else {
            System.out.println(palabra1 + " tiene menos caracteres");
        }
    }
    
}
