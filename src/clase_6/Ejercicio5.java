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
public class Ejercicio5 {

    /**
     * Escribe una aplicación con un String que contenga una contraseña
cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos.
Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje
diciendo “Contraseña correcta”. Piensa bien en la condición de salida (3
intentos y si acierta sale, aunque le queden intentos).
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String contrasena = "", reingresoContrasena = "";
        int contadorIntentos = 3;
        boolean seguirPreguntando = true;
        System.out.println("-----------------------------");
        do {
            if (contadorIntentos == 3) {
                System.out.println("Ingrese una contraseña:");
                contrasena = entradaUsuario.nextLine();
            }
            System.out.println("Ingrese la contraseña otra vez:");
            reingresoContrasena = entradaUsuario.nextLine();
            System.out.println("-----------------------------");
            if (reingresoContrasena.equals(contrasena)) {
                System.out.println("Contraseña correcta");
                seguirPreguntando = false;
            } else {
                System.out.println("Contraseña incorrecta");
                contadorIntentos = --contadorIntentos;
                if (contadorIntentos == 0) {
                    seguirPreguntando = false;
                }
            }
        } while (seguirPreguntando);
    }
    
}
