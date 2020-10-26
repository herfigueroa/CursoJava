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
public class Alumno extends Persona {
    float notaPrimerParcial, notaSegundoParcial;

    public Alumno() {
    }

    public float getNotaPrimerParcial() {
        return notaPrimerParcial;
    }

    public void setNotaPrimerParcial(float notaPrimerParcial) {
        this.notaPrimerParcial = notaPrimerParcial;
    }

    public float getNotaSegundoParcial() {
        return notaSegundoParcial;
    }

    public void setNotaSegundoParcial(float notaSegundoParcial) {
        this.notaSegundoParcial = notaSegundoParcial;
    }

    public Alumno(float notaPrimerParcial, float notaSegundoParcial) {
        this.notaPrimerParcial = notaPrimerParcial;
        this.notaSegundoParcial = notaSegundoParcial;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        
        if (promedio(notaPrimerParcial, notaSegundoParcial) >= 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");        
        }
    }
    
    public float promedio(float notaPrimerParcial, float notaSegundoParcial) {
        return (notaPrimerParcial + notaSegundoParcial) / 2;
    }
}
