/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal;

import java.util.ArrayList;

/**
 *
 * @author gabit
 */
public class Sucursal {

    private String nombre;
    private char tipo;
    private ArrayList<Producto> producto = new ArrayList <>();

    public Sucursal(String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void addProducto(Producto productos) {
        this.producto.add(productos);
    }

}
