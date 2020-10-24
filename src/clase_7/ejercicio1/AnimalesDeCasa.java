/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_7.ejercicio1;

/**
 *
 * @author AKLoan
 */
public class AnimalesDeCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] frasesLoroBonito = {"Lorito bonito", "Pretty polly", "Viva mi dueño"};
        Animal[] animalesCasa = {
            new Animal("Moby Dick", "La ballena"),
            new Animal("Caín", "El perro fiero", "Grr"),
            new Animal("Abel", "El perro manso" ,"Guaú"),
            new Animal("Adela", "El pinguino"),
            new Animal("El loro bonito", frasesLoroBonito)       
        };
        for (int i = 0;i < animalesCasa.length; i++) {
            animalesCasa[i].hablar();
        }
    }
    
}
