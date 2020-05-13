/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kogan_andres;

/**
 *
 * @author Usuario
 */
public class OrdenPedido {
    private int sucursal;
    private int producto;

    public OrdenPedido() {
    }

    public OrdenPedido(int sucursal, int producto) {
        this.sucursal = sucursal;
        this.producto = producto;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }
            
    
    
    
    
}
