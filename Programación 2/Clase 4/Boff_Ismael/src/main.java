
/**
 *
 * @author SkylakeFrost
 */
public class main {

    public static void main(String[] args) {

        Sucursal suc = new Sucursal("Destino", "Tienda Electronica", "Mendoza");
        suc.setNuevoProductos(new Producto("TV", 2000000, 20));
        suc.setNuevoProductos(new Producto("Celulares", 10000, 30));
        suc.setNuevoProductos(new Producto("Radios", 2000, 0));

        Sucursal suc2 = new Sucursal("Fuente", "Musimundo", "Mendoza");
        suc2.setNuevoProductos(new Producto("TV", 20000, 50));
        suc2.setNuevoProductos(new Producto("Celulares", 10000, 30));
        suc2.setNuevoProductos(new Producto("Radios", 2000, 20));

        CentroDistribucion centro = new CentroDistribucion();

        centro.stockDisponibleTotal(suc);
        centro.stockDisponibleTotal(suc2);
        centro.revisar(suc);
        centro.revisar(suc2);

//        suc.listaDeProductos();
//        suc2.getListaProductos();
    }
}
