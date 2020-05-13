
package Sucursales;

/**
 *
 * @author juanc_000
 */
public class Producto {
    // Atributos
    private String nombreProducto;
    private float precio;
    private int cantidad;

    // Constructores
    public Producto(){ }
    public Producto(String nombreProducto, float precio, int cantidad){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Métodos
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
