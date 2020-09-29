/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_4;

/**
 *
 * @author hernan figueroa
 */
public class Ejercicio5 {

    /**
     * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y
     * 3. Utiliza el bucle que desees.
     */
    public static void main(String[] args) {
        System.out.println("Numeros divisibles por 2 o 3: ");
        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 2 == 0){
                System.out.println(contador + " (Divisible por 2)");
            } else if (contador % 3 == 0){
                System.out.println(contador + " (Divisible por 3)");
            }
        }
    }
}
