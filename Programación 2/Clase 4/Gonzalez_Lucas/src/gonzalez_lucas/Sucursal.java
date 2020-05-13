package gonzalez_lucas;

import java.util.ArrayList;

public class Sucursal {

    private String nombre;

    private long cuit;

    private ArrayList<Producto> productos=new ArrayList<>();

    private static int cantMovimientos;
    
    private static int cantVentas=0;

    public Sucursal(String nombre, long cuit, Producto producto) {
        this.nombre = nombre;
        this.cuit = cuit;
        productos.add(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public static int getCantMovimientos() {
        return cantMovimientos;
    }
    
    public static int getCantVentas() {
        return cantVentas;
    }

    public void addProductos(Producto producto, int cant) {
        if ((productos.size()+cant)<100){
            for (int i = 0; i < cant; i++) {
                productos.add(producto);
            }
        }else {
                System.out.println("Excede la cantidad de 100 productos");
        }
    }

    public void vender(Producto producto, int cant) {
        if (cant <= producto.getStock()) {
            for (int i = 0; i <= cant; i++) {
            productos.remove(productos.indexOf(producto));
            }
            cantVentas++;
        }else {
            System.out.println("No hay stock disponible");
        }
    }
    
    public double precioStock() {
        
        double total=0;
        
        for (int i = 0; i < productos.size(); i++) {
            total+=productos.get(i).getPrecio();
        }
        
        return total;
    }
}
