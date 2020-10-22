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
public class Ejercicio2 {

    /**
     * Realizar un programa que pida el nombre y apellido al usuario. El programa
debe eliminar cualquier vocal del nombre sean en minúsculas o mayúsculas. El
resto de caracteres no se modifican.
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String nombre, apellido, nombreAnterior, apellidoAnterior;
        String[] vocales = {"a", "e", "i", "o", "u"};
        System.out.println("Ingrese su nombre:");
        nombre = entradaUsuario.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = entradaUsuario.nextLine();

        nombreAnterior = nombre;
        apellidoAnterior = apellido;
        for (int i = 0; i < vocales.length; i++) {
            nombre = nombre.replace(vocales[i], "");
            nombre = nombre.replace(vocales[i].toUpperCase(), "");
            apellido = apellido.replace(vocales[i], "");
            apellido = apellido.replace(vocales[i].toUpperCase(), "");
        }
        System.out.println("El nombre era " + nombreAnterior + " " + apellidoAnterior +" y ahora es " + nombre + " " + apellido);
    }
}
