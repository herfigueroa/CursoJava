/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author hernán figueroa
 */
public class Laboratorio {
    private String nombre, domicilio, telefono;

    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + nombre + "\nDomicilio: " + domicilio + "\nTelefono: "+ telefono);
    }
}
