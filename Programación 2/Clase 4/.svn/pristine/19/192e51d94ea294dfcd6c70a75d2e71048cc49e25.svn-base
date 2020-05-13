
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SkylakeFrost
 */
public class Sucursal {

    private String tipo;
    private String nombreSucursal;
    private String direccion;
    private List<Producto> listaProductos = new ArrayList<>();

    public Sucursal(String tipo, String nombreSucursal, String direccion) {
        this.tipo = tipo;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
    }

    public Sucursal() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setNuevoProductos(Producto producto) {
        listaProductos.add(producto);
    }

    public void listaDeProductos() {
        System.out.println("Listado De Productos");
        System.out.println("Sucursal : " + nombreSucursal);
        for (Producto p : listaProductos) {
            System.out.println("--------------------------------");
            System.out.println("Nombre : " + p.getNombre());
            System.out.println("Precio : " + p.getPrecio());
            System.out.println("Stock Disponible : " + p.getStock());
            System.out.println("--------------------------------");
        }

    }
}
