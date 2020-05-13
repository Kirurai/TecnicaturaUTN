
package Sucursales;

import java.util.ArrayList;

/**
 *
 * @author juanc_000
 */
public class Sucursal {
    // Atributos
    private ArrayList<Producto> prod = new ArrayList<>();    
    private String nombreSucursal;
    private String tipo;
    
    // Constructores
    public Sucursal(){ }
    public Sucursal(String nombreSucursal){ 
        this.nombreSucursal = nombreSucursal;
    }
    public Sucursal(String nombreSucursal, String tipo){ 
        this.nombreSucursal = nombreSucursal;
        this.tipo = tipo;
    }
    
    // Getters y Setters
    public ArrayList<Producto> getStock() {
        return prod;
    }

    public void setStock(ArrayList<Producto> prod) {
        this.prod = prod;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
