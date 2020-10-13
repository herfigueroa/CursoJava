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
public class Ejercicio10 {

    /**
     * En un colegio existe la posibilidad de elegir, en la materia "lengua
extranjera", entre las siguientes opciones: [I]nglés, [F]rancés,
[P]ortugués y [A]lemán. Se ingresa, para cada alumno, la lengua
elegida. La computadora muestra el porcentaje de alumnos que eligió
cada lengua, en forma de número
     */
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int cantidadAlumnos, contadorIn = 0, contadorFr = 0, contadorPo = 0, contadorAl = 0;
        long porcentajeIn, porcentajeFr, porcentajePo, porcentajeAl;
        char ingresoUsuario;
        
        System.out.println("Ingrese la cantidad de alumnos:");
        cantidadAlumnos = entradaUsuario.nextInt();
        
        for (int i = 1; i <= cantidadAlumnos; i++) {
            do {
                System.out.println("Ingrese la lengua extranjera del alumno " + i + ". Puede elegir entre [I]nglés, [F]rancés y [P]ortugués y [A]lemán");
                ingresoUsuario = entradaUsuario.next().charAt(0);
                if ((ingresoUsuario != 'I' && ingresoUsuario != 'i') && (ingresoUsuario != 'f' && ingresoUsuario != 'F') && (ingresoUsuario != 'p' && ingresoUsuario != 'P') && (ingresoUsuario != 'a' && ingresoUsuario != 'A')) {
                    System.out.println("Respuesta invalida");
                } else {
                    switch (ingresoUsuario) {
                        case 'i':
                        case 'I':
                            contadorIn++;
                            break;
                        case 'f':
                        case 'F':
                            contadorFr++;
                            break;
                        case 'p':
                        case 'P':
                            contadorPo++;
                            break;
                        case 'a':
                        case 'A':
                            contadorAl++;
                            break;
                    }
                }
            } while ((ingresoUsuario != 'I' && ingresoUsuario != 'i') && (ingresoUsuario != 'f' && ingresoUsuario != 'F') && (ingresoUsuario != 'p' && ingresoUsuario != 'P') && (ingresoUsuario != 'a' && ingresoUsuario != 'A'));
        }
        porcentajeIn = contadorIn * 100 / cantidadAlumnos;
        porcentajeFr = contadorFr * 100 / cantidadAlumnos;
        porcentajePo = contadorPo * 100 / cantidadAlumnos;
        porcentajeAl = contadorAl * 100 / cantidadAlumnos;
        System.out.println("De cada " + cantidadAlumnos + " alumnos, un " + porcentajeIn + "% de alumnos prefieren inglés, un " + porcentajeFr + "% de alumnos prefieren francés, un " + porcentajePo + "% de alumnos prefieren portugués y un " + porcentajeAl + "% prefieren alemán.");
    }
    
}
