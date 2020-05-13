/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urzúa_marcos;

/**
 *
 * @author Marcos
 */
public interface Consultas {
    public void transferirProducto(Sucursal sucursal, String nombre, int stock);
    public void generarPedido(Sucursal sucursal, String nombre, int stock);
    public boolean comprobarStock();
    public boolean comprobarValores();
    public void agregarProducto(Producto producto, String nombre, int agregar);
    public void agregarProducto(Sucursal sucursal, Producto producto, String nombre, int stock, int agregar);
    public void quitarProducto(String nombre, int quitar);
    public void quitarProducto(Sucursal sucursal, String nombre, int stock, int quitar);
    public void comprobarPedidoPendiente();
}