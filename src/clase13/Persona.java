/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13;

/**
 *
 * @author hernán figueroa
 */
public class Persona {
    int dni;
    String nombre;

    public Persona() {
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }
}
