/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palanalucas;

/**
 *
 * @author Luxas
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private int Codigo;

    public Producto(String nombre, int cantidad, int Codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
}
