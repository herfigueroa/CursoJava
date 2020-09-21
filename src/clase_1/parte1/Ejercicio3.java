/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_1.parte1;

import java.util.Scanner;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio3 {

    /**
     * dadas 3 notas mostrar el promedio
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double nota1, nota2, nota3;
        
        System.out.println("Ingrese la primer nota:");
        nota1 = entradaUsuario.nextInt();
        
        System.out.println("Ingrese la segundo nota:");
        nota2 = entradaUsuario.nextInt();
        
        System.out.println("Ingrese la tercer nota:");
        nota3 = entradaUsuario.nextInt();
        
        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("-----------------------------");
        System.out.println("El promedio de las notas es de: " + promedio);
    }
    
}
