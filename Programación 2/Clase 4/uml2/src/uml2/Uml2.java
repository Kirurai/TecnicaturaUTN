/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml2;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializando lo necesario
        Fecha fecha = new Fecha (31, 2, 2020);
        Producto prod1 = new Producto(101, "Oreo super chocolate", (float) 2.34);
        Producto prod2 = new Producto(102, "Oreo mix chocolate - avellana", (float) 2.59);
        Cliente clie = new Cliente(3141592, "Es pi");
        Factura factura = new Factura( 'B', 1, fecha, clie, prod1);
        
        factura.addProducto(prod2);
        
        System.out.printf("Factura Tipo %s\n", factura.getTipo());
        System.out.printf("N°     %d\n", factura.getNumero());
        System.out.printf("Fecha: %d/%d/%d\n", factura.getFecha().getDia(), factura.getFecha().getMes(), factura.getFecha().getAnio());
        System.out.printf("Razon Social: %s\n", factura.getCliente().getRazonSocial());
        System.out.printf("-------------------------------------------------\n");
        for (int i = 0;   i< factura.getProductos().size(); i++){
            System.out.printf("Codigo Producto: %d\n", factura.getProductos().get(0).getCodigo());
            System.out.printf("Descripcion: %s\n", factura.getProductos().get(0).getDescripcion());
            System.out.printf("Precio: $%.2f\n", factura.getProductos().get(0).getPrecio());
        }
        System.out.printf("-------------------------------------------------\n");
        System.out.printf("Total: $%.2f\n", factura.getTotal());
        
    }
    
}
