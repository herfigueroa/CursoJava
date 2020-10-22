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
public class Ejercicio3 {

    /**
     * Leer una frase y encontrar la palabra de mayor longitud
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String[] frase;
        int contadorPalabra = 0;
        String palabraLarga = "";
        System.out.println("Ingrese una frase:");
        frase = entradaUsuario.nextLine().split(" ");
        for (int i = 0; i < frase.length; i++) {
            for (int j = 0; j < frase.length; j++) {
                if (i != j) {
                    if (frase[i].length() >= frase[j].length()) {
                        palabraLarga = frase[i];
                    } else {
                        palabraLarga = frase[j];
                    }
                }
            }
            contadorPalabra = palabraLarga.length();
        }
        System.out.println("La palabra larga es " + palabraLarga + " con " + contadorPalabra + " caracteres.");
    }
    
}
