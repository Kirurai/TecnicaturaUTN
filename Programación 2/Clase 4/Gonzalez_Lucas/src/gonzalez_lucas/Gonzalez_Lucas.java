package gonzalez_lucas;

public class Gonzalez_Lucas {

    public static void main(String[] args) {
        
        CentroDistribucion centro=new CentroDistribucion();
        
        Producto producto1=new Producto("Galletas", 20, 50);
        Producto producto2=new Producto("Lavandina", 50, 50);
        Producto producto3=new Producto("Coca Cola", 100, 50);
        
        Sucursal sucursal1=new Sucursal("Sucursal 1", 123456, producto1);
        Sucursal sucursal2=new Sucursal("Sucursal 2", 154657, producto2);
        
        sucursal1.addProductos(producto1, 20);
        sucursal1.addProductos(producto3, 20);
        
        sucursal2.addProductos(producto1, 20);
        sucursal2.addProductos(producto2, 30);
        sucursal2.addProductos(producto3, 20);
        
        sucursal1.vender(producto3, 20);
        
        centro.revisar();
        
    }
    
}
