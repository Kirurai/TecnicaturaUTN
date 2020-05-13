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
public class CentroDistribucion {
    private int cantProductos;
    private int valorTotalProctos;
    private ArrayList<Producto> productoFuente=new ArrayList<>();

    public CentroDistribucion(int cantProductos, int valorTotalProd) {
        this.cantProductos = cantProductos;
        this.valorTotalProctos = valorTotalProd;
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

    public ArrayList<Producto> getProductoFuente() {
        return productoFuente;
    }

    public void setProductoFuente(ArrayList<Producto> productoFuente) {
        this.productoFuente = productoFuente;
    }
    public void addsetProductoFuente(Producto productoFuente) {
        this.productoFuente.add(productoFuente);
    }
    
}
