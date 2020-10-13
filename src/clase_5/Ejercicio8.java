/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio8 {

    /**
     * Desarrollar un programa que pida un carácter al usuario y que por cada
carga pregunte si se desea seguir ingresando. De la forma “¿Desea
ingresar otro carácter? [S/N]”. La carga de datos finaliza cuando se
detecta una n o N. La computadora debe mostrar la cantidad de letras
vocales ingresadas. (Debe admitir mayúsculas y minúsculas).
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        char letraUsuario, letraPregunta;
        int contadorVocales = 0;
        
        do {
            System.out.println("Ingrese algun caracter:");
            letraUsuario = entradaUsuario.next().charAt(0);
            if (letraUsuario == 'a' || letraUsuario == 'A' || letraUsuario == 'e' || letraUsuario == 'E' || letraUsuario == 'i' || letraUsuario == 'I' || letraUsuario == 'o' || letraUsuario == 'O' || letraUsuario == 'u' || letraUsuario == 'U') {
                contadorVocales++;
            }
            do {
                System.out.println("¿Desea ingresar otro carácter? [S/N]");
                letraPregunta = entradaUsuario.next().charAt(0);
                if ((letraPregunta != 's' && letraPregunta != 'S') && (letraPregunta != 'n' && letraPregunta != 'N')) {
                    System.out.println("Respuesta invalida");
                }
            } while ((letraPregunta != 's' && letraPregunta != 'S') && (letraPregunta != 'n' && letraPregunta != 'N'));
            
            System.out.println("-----------------------------");
        } while (letraPregunta != 'n' && letraPregunta != 'N');
        
        System.out.println("Cantidad de vocales ingresadas: " + contadorVocales);
    }
    
}
