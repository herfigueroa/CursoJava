/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase13;

/**
 *
 * @author hernan figueroa
 */
public class PruebaHerencia {

    /**
     * prueba de las clases alumno y persona
     */
    public static void main(String[] args) {
        Alumno alumnin = new Alumno(3F, 7.33F);
        alumnin.mostrar();
        
        Persona persAlumnin = new Persona(33313853, "Ricardo Alumnin");
        persAlumnin.mostrar();
        
        alumnin.mostrar();
        
        Alumno realLumno = new Alumno();
        realLumno.setNombre("Alumninio Robertez");
        realLumno.setDni(33123321);
        realLumno.setNotaPrimerParcial(6.66F);
        realLumno.setNotaSegundoParcial(9.33F);
        realLumno.mostrar();
                
        
    }
    
}
