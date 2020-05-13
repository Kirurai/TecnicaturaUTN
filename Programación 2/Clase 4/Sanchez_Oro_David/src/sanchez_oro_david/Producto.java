/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_oro_david;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Producto {

    private String descripcion;
    private float precio;

    public Producto(String descripcion, float precio) {
        this.descripcion = descripcion;
        setPrecio(precio);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public final void setPrecio(float precio) {

        this.precio = precio;

    }
}
