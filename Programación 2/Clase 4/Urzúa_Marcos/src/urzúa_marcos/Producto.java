/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urzúa_marcos;

/**
 *
 * @author Marcos
 */
public class Producto {
    private String nombre;
    private String cantidad;
    private int stock;
    private double precioUnitario;
    
    Producto(String nombre, String cantidad, int Stock, double precioUnitario){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
            
}
