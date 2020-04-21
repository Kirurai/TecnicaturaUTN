/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml2;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
    
}
