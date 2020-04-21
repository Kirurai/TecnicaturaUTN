/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml2;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Factura extends Comprobante {
    private float total;
    private Cliente cliente;
    private ArrayList <Producto> productos = new ArrayList <>();
    
    public Factura(){
        this.total = 0;
    }
    public Factura(char tipo, int numero, Fecha fecha, Cliente cliente, Producto producto){
        super(tipo, numero, fecha);
        this.cliente = cliente;
        this.productos.add(producto);
    }

    public float getTotal() {
        return total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList <Producto> getProductos() {
        return productos;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setProductos(ArrayList <Producto> productos) {
        this.productos= productos;
        this.total = 0;
        for (int i = 0; i < productos.size(); i++){
            this.total += productos.get(i).getPrecio();
        }
    }

    public void addProducto(Producto elemento){
        this.productos.add(elemento);
        this.total += elemento.getPrecio();
    }
    
    
}
