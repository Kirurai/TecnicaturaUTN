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
    private ArrayList <Producto> producto = new ArrayList <>();
    
    public Factura(){
        this.total = 0;
    }
    public Factura(char tipo, int numero, Fecha fecha, float total){
        super(tipo, numero, fecha);
        this.total = total;
    }

    public float getTotal() {
        return total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ArrayList <Producto> getProducto() {
        return producto;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setProducto(ArrayList <Producto> producto) {
        this.producto = producto;
    }

    public void addProducto(Producto elemento){
        this.producto.add(elemento);
    }
    
    
}
