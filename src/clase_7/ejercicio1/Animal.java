package clase_7.ejercicio1;

public class Animal {

    private String nombre;
    private String soloDice;
    private String tipoAnimal;
    private String[] cosasQueDice = null;

    public Animal(String nombre, String tipoAnimal,  String soloDice) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.soloDice = soloDice;
    }

    public Animal(String nombre, String tipoAnimal) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
    }

    public Animal(String nombre, String tipoAnimal, String[] cosasQueDice) {
        this.nombre = nombre;
        this.cosasQueDice = cosasQueDice;
    }

    public Animal(String tipoAnimal, String[] cosasQueDice) {
        this.tipoAnimal = tipoAnimal;
        this.cosasQueDice = cosasQueDice;
    }

    public void hablar() {
        if (tipoAnimal != null) {
            System.out.print(tipoAnimal);
        }
        if (nombre != null) {
            System.out.print(" " + nombre);
        }
        if (cosasQueDice != null) {
            System.out.print(" dice: ");
            for (int i = 0; i < cosasQueDice.length; i++) {
                if (i == (cosasQueDice.length - 1)) {
                    System.out.print("y " + cosasQueDice[i] + ".");
                } else {
                    System.out.print(cosasQueDice[i] + ", ");
                }
            }
        } else if (soloDice != null) {
            System.out.print(" dice: ");
            System.out.print(soloDice + ". ");
        } else {
            System.out.print(" no dice nada.  ");
        }
        System.out.print("\n");
    }
}
