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
public class Producto {
    private String descripcion, rubro;
    private int codigo, stock;
    private double precioCosto;
    private Laboratorio laboratorio;

    public Producto(String p_rubro, String p_desc, double p_costo, Laboratorio p_lab) {
        this.descripcion = p_rubro;
        this.rubro = p_desc;
        this.precioCosto = p_costo;
        this.laboratorio = p_lab;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Laboratorio getLab() {
        return this.laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    public void mostrar() {
        System.out.println("Rubro: " + this.rubro);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio costo: " + this.precioCosto);
    }
    
    public double stockValorizado(double precio, int stock) {
        return (precio * stock) * 1.12;
    }
}
