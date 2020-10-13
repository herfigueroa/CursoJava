/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_5;

import java.util.Scanner;

/**
 *
 * @author AKLoan
 */
public class Ejercicio9 {

    /**
     * Desarrollar un programa que pida una cantidad de artículos comprados y
el precio unitario de ese artículo. Por cada carga debe preguntar si se
desea seguir ingresando de la forma “¿Desea ingresar otro artículo?
[S/N]”. La carga de datos finaliza cuando se detecta una n o N. La
computadora debe mostrar el monto de la factura.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        char letraPregunta;
        double precioTotal = 0, precioArticulo;
        int unidadArticulo;
        
        do {
            System.out.println("Ingrese la cantidad de unidades compradas del artículo:");
            unidadArticulo = entradaUsuario.nextInt();
            System.out.println("Ingrese el precio unitario de dicho artículo:");
            precioArticulo = entradaUsuario.nextDouble();
            precioTotal = precioTotal + precioArticulo;
            do {
                System.out.println("¿Desea ingresar otro articulo? [S/N]");
                letraPregunta = entradaUsuario.next().charAt(0);
                if ((letraPregunta != 's' && letraPregunta != 'S') && (letraPregunta != 'n' && letraPregunta != 'N')) {
                    System.out.println("Respuesta invalida");
                }
            } while ((letraPregunta != 's' && letraPregunta != 'S') && (letraPregunta != 'n' && letraPregunta != 'N'));
            
            System.out.println("-----------------------------");
        } while (letraPregunta != 'n' && letraPregunta != 'N');
        
        System.out.println("El monto de la factura es: $" + precioTotal);
    }
    
}
