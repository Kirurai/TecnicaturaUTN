/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urzúa_marcos;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class CentroDistribucion  implements Consultas{
    private ArrayList<Producto> deposito = new ArrayList();

    public CentroDistribucion() {
    }

    public ArrayList<Producto> getDeposito() {
        return deposito;
    }
    public void setDeposito(ArrayList<Producto> deposito) {
        this.deposito = deposito;
    }

    @Override
    public void transferirProducto(Sucursal sucursal, String nombre, int stock) {
        
    }
    @Override
    public void generarPedido(Sucursal sucursal, String nombre, int stock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean comprobarStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean comprobarValores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override///Agrega stock a un producto existente o agrega un nuevo producto
    public void agregarProducto(Producto producto,String nombre, int agregar){
        for (int i = 0; i < deposito.size(); i++) {
            if(getDeposito().get(i).getNombre().equals(nombre)){
                getDeposito().get(i).setStock(getDeposito().get(i).getStock()+agregar);
            } else if(i==(deposito.size()-1) && !(getDeposito().get(i).getNombre().equals(nombre))){
                deposito.add(producto);
                getDeposito().get(i).setNombre(nombre);
                getDeposito().get(i).setStock(agregar);
            }
        }
    }
    @Override
    public void agregarProducto(Sucursal sucursal, Producto producto, String nombre, int stock, int agregar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void quitarProducto(String nombre, int quitar){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void quitarProducto(Sucursal sucursal, String nombre, int stock, int quitar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void comprobarPedidoPendiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
