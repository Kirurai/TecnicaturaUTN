
package Sucursales;

import java.util.ArrayList;

/**
 *
 * @author juanc_000
 */
public class CentroDistribucion {
    // Atributos
    private OrdenPedido ordenPedido;
    private ArrayList<Sucursal> sucursales = new ArrayList();
    
    // Metodos
    public void revisar(){
        // En cada sucursal
        for(Sucursal sucursal : sucursales){
            // de cada producto
            for(Producto producto : sucursal.getStock()){
                // Si el precio es mayor a $200000 se saca
                if(producto.getPrecio() > 200000.0f){
                    sucursal.getStock().remove(producto);
                }
                // Si el stock es 1, llamar reponer
                if(producto.getCantidad() == 1){
                    producto.setCantidad(ordenPedido.reponer(producto));
                }
            }
        }
    }
    
    // Getters y Setters
    public OrdenPedido getOrdenPedido() {
        return ordenPedido;
    }

    public void setOrdenPedido(OrdenPedido ordenPedido) {
        this.ordenPedido = ordenPedido;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    
}
