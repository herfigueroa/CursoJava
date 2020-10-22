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
public class Ejercicio6 {

    /**
     * Realizar un programa que compruebe si una palabra es palíndroma es decir
si se lee igual de izquierda a derecha que de derecha a izquierda.
Ej: Radar o anilina
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String palabra, arbalap;
        System.out.println("Ingrese una palabra o frase:");
        palabra = entradaUsuario.nextLine();
        arbalap = new StringBuilder(palabra).reverse().toString();
        
        if (palabra.replace(" ","").equalsIgnoreCase(arbalap.replace(" ",""))) {
            System.out.println("La palabra o frase es palíndroma");
        } else {
            System.out.println("La palabra o frase no es palíndroma");
        }
    }
    
}
