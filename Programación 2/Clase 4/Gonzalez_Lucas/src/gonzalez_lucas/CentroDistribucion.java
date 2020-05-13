package gonzalez_lucas;

import java.util.ArrayList;

public class CentroDistribucion {
    
    Sucursal sucursalDestino;
    Sucursal sucursalFuente;
    ArrayList<OrdenDePedido> ordenes=new ArrayList<>();

    public CentroDistribucion() {
        
    }
    
    public void revisar(){
        System.out.print("Cantidad de productos de la sucursal destino: ");
        System.out.println(sucursalDestino.getProductos().size());
        System.out.print("Cantidad de productos de la sucursal fuente: ");
        System.out.println(sucursalFuente.getProductos().size());
        
        System.out.print("Precio de stock total sucursal destino: ");
        System.out.println(sucursalDestino.precioStock());
        System.out.print("Precio de stock total sucursal fuente: ");
        System.out.println(sucursalFuente.precioStock());
    }
    
    public void reponerProductos(Sucursal sucursalFuente, Sucursal sucursalDestino, Producto producto, int cant){
        OrdenDePedido orden=new OrdenDePedido("Factura A");
        while (sucursalFuente.getProductos().contains(producto) && sucursalFuente.getProductos().size()>1) {
            if (cant < producto.getStock()) {
                sucursalDestino.addProductos(producto, cant);
                sucursalFuente.getProductos().remove(producto);
            }else {
                producto=new Producto(producto.getNombre(), producto.getPrecio(), cant);
                sucursalDestino.addProductos(producto, cant);
            }
        }
                
    }
}
