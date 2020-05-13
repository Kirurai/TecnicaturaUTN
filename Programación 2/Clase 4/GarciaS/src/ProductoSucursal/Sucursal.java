/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoSucursal;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Sucursal {
    private int cantProductos;
    private int valorTotalProctos;
    private ArrayList<Producto> productoDestino=new ArrayList<>();
    public Sucursal(int cantProductos, int valorTotalProD) {
        this.cantProductos = cantProductos;
        this.valorTotalProctos = valorTotalProD;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public int getValorTotalProctos() {
        return valorTotalProctos;
    }

    public void setValorTotalProctos(int valorTotalProctos) {
        this.valorTotalProctos = valorTotalProctos;
    }

    public ArrayList<Producto> getProductoDestino() {
        return productoDestino;
    }

    public void setProductoDestino(ArrayList<Producto> productoDestino) {
        this.productoDestino = productoDestino;
        
    }
    public void addsetProductoFuente(Producto productoDestino) {
        
        this.productoDestino.add(productoDestino);
    }
}
