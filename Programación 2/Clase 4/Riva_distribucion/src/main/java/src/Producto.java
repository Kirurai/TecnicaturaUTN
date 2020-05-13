package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ianr
 */
public class Producto {
    private int idPproducto;
    private String nombreProducto;
    private int cantidadProducto;
    private float precio;
    /**
     * @return the idPproducto
     */
    public int getIdPproducto() {
        return idPproducto;
    }

    /**
     * @param idPproducto the idPproducto to set
     */
    public void setIdPproducto(int idPproducto) {
        this.idPproducto = idPproducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //constructores
    public Producto (int id, String nombre, int cantidad, float precio){
        this.idPproducto = id;
        this.nombreProducto = nombre;
        this.cantidadProducto = cantidad;
        this.precio = precio;
    }
}
