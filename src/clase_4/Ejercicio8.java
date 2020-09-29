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
public class Ejercicio8 {

    /**
     * Escribir todos los números múltiplos de 7 menores que 100
     */
    public static void main(String[] args) {
        System.out.println("Numeros divisibles por 7 menores que 100: ");
        for (int contador = 1; contador <= 100; contador++) {
            if (contador % 7 == 0){
                System.out.println(contador);
            }
        }
    }

}
