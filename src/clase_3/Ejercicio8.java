/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_3;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio8 {

    /**
     * Escribir un programa que muestre el día de la semana. Ejemplo si
     * ingreso 1 que me diga que es lunes, 2 martes, etc.
     */
    public static void main(String[] args) {
        int diaSemana;
        String diaSemNombre = "bruh";
        Scanner numIngresado = new Scanner(System.in);
        
        System.out.println("Ingrese un día de la semana (de 1 a 7)");
        diaSemana = numIngresado.nextInt();
        
        switch (diaSemana) {
            case 1:
                diaSemNombre = "Lunes";
                break;
            case 2:
                diaSemNombre = "Martes";
                break;
            case 3:
                diaSemNombre = "Miércoles";
                break;
            case 4:
                diaSemNombre = "Jueves";
                break;
            case 5:
                diaSemNombre = "Viernes";
                break;
            case 6:
                diaSemNombre = "Sábado";
                break;
            case 7:
                diaSemNombre = "Domingo";
                break;
            default:
                break;
        }

        if (diaSemana >= 1 && diaSemana <= 7) {
            System.out.println("El dia es " + diaSemNombre);
        } else {
            System.out.println("Fecha invalida.");
        }
    }
}
