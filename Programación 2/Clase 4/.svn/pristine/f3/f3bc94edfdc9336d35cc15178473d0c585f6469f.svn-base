
/**
 *
 * @author SkylakeFrost
 */
public class CentroDistribucion {

    private OrdenPedido orden;

    public void revisar(Sucursal sucursal) {

        for (Producto prod : sucursal.getListaProductos()) {
            if (prod.getPrecio() > 200000) {
                System.out.println("El Producto " + prod.getNombre() + " En La Sucursal " + sucursal.getNombreSucursal() + " No Puede Valer Mas De 200.000");
                System.out.println("PorFavor Corregir");

            }
            if (prod.getStock() == 0) {
                System.out.println("Sin Stock -----");
                System.out.println("El Producto : " + prod.getNombre());
                System.out.println("De La Sucursal : " + sucursal.getNombreSucursal());
                System.out.println("De Tipo : " + sucursal.getTipo());
                
                System.out.println("---------------");

            }
            if (stockDisponibleTotal(sucursal) > 100) {

                System.out.println("La Sucursal : " + sucursal.getNombreSucursal() + " No Puede Tener Mas De 100 Productos");

            }

        }

    }

    public int stockDisponibleTotal(Sucursal sucursal) {
        int totalStock = 0;
        for (Producto p : sucursal.getListaProductos()) {
            totalStock += p.getStock();
        }

        return totalStock;

    }

    

    public void generarOrden(Sucursal s1, Sucursal s2) {

        revisar(s1);
        
        
        
    }

}
