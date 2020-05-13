/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Sucursal {
    private String nombre;
    private String tipo;
    private ArrayList <Producto> prod = new ArrayList();
    private final int[] movimientos = {0, 0}; 

    public Sucursal(){

    }
    public Sucursal(String nombre, String tipo, String nombreProd, int precio, int cantidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.prod.add(new Producto(nombreProd, precio, cantidad));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Producto> getProd() {
        return prod;
    }

    public void setProd(ArrayList<Producto> prod) {
        this.prod = prod;
    }

    public int[] getMovimientos() {
        return movimientos;
    }
    public void setMovimientos(int entraron, int salieron){
        this.movimientos[0] = entraron;
        this.movimientos[1] = salieron;        
    }
    public void agregarMovimientoEntrada(){
        this.movimientos[0] += 1;
    }
    public void agregarMovimientoSalida(){
        this.movimientos[1] += 1;
    }
    
    
    public boolean intercambiarProducto(Producto productoCambiar, Sucursal suc){
        if (!suc.checkProducto(productoCambiar) || suc.limite100Producto() || this.limite1Producto() || this.limiteDinero(productoCambiar)){
            return false;
        }
        this.getProd().add(productoCambiar);
        suc.getProd().remove(productoCambiar);

        this.agregarMovimientoEntrada();
        suc.agregarMovimientoSalida();
        return true;
    }
    public boolean checkProducto(Producto producto){
        if (!(this.getProd().contains(producto))){
            System.out.printf("La sucursal %s no cuenta con %s\n", this.getNombre(), producto.getNombre());
            return false;
        }
        return true;
    }
    
    public boolean limite100Producto(){
        if (this.getProd().size() == 100){
         System.out.printf("La sucursal %s tiene el limite de 100 productos. No puede aceptar más productos\n", this.getNombre());
         return true;
        }
        return false;
    }
        
    public boolean limite1Producto(){
        if (this.getProd().size() == 1){
            System.out.printf("La sucursal %s no puede entregar productos, ya que solo tiene 1.\n", this.getNombre());
            return true;
        }
        return false;
    }
    
    public boolean limiteDinero(Producto producto){
        float  dineroStock = producto.getPrecio();
        for(int i = 0; i < this.getProd().size(); i++){
            dineroStock += this.getProd().get(i).getPrecio();
        }
        if (dineroStock >= 200000.00){
            System.out.printf("Agregando el producto %s superaría el valor de 200,000.00\n", producto.getNombre());
            return true;
        }
        return false;
    }
    
}
