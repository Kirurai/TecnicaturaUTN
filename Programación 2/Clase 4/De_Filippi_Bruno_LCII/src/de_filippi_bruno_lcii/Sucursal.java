/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_filippi_bruno_lcii;

import java.util.ArrayList;

/**
 *
 * @author Bruno De Filippi <brunodefilippi@hotmail.com>
 */
public class Sucursal {
    
    private String nombre;
    private String tipo;
    private ArrayList <Producto> prod = new ArrayList<>();

    public Sucursal(String nombre) {
        this.nombre = nombre;
        Producto producto = new Producto();
        this.prod.add(producto);
    }

    public Sucursal(String nombre, String tipo, double precio, String nombreProd, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        Producto producto = new Producto(precio, nombreProd,cantidad);
        this.prod.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Producto> getProd() {
        return prod;
    }

    public void setProductos(ArrayList<Producto> prod) {
        this.prod = prod;
    }
    
}
