/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml6;

import java.util.Date;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //atributos para el constructor;
        Date fechaIngresoEmp = new Date(2323223232L);
        int nroLegajoEmp = 2589;
        int dniClie = 456789;
        String nombreClie = "Hades";
        String apellidoClie = "Dios del inframundo";
        long cuitClie = 204567898;
        int nroFactura = 1;
        Date fecha = new Date(2323223565L);
        double monto = 20.4;
        
        Proveedor prov = new Proveedor("El Olimpo", 10101010, "seres", "humanos", 20101010108l);
        Factura factura = new Factura(0123, "Zeus", "Todopoderoso", 201238, fechaIngresoEmp, nroLegajoEmp, dniClie, nombreClie, apellidoClie, cuitClie, nroFactura, fecha, monto);
    
        TarjetaCredito visa = new TarjetaCredito(new Date(2323223232L), (double)5000);
        factura.getClie().getCreditCard().add(visa);
        
        
        System.out.printf("Factura N°%d\n",factura.getNroFactura());
        //System.out.println("Fecha: " + factura.getFecha());
        System.out.printf("Fecha: %tT\n", factura.getFecha());
        System.out.printf("Importe: $%.2f\n", factura.getMonto());
        System.out.printf("Empleado: %s %s\n", factura.getEmp().getNombre(), factura.getEmp().getApellido());
        System.out.printf("Legajo N°%d\n",factura.getEmp().getNroLegajo());
        System.out.printf("Cliente: %s %s\n", factura.getClie().getNombre(), factura.getClie().getApellido());
        System.out.printf("CUIT: %d\n", factura.getClie().getCuit());
        System.out.printf("Limite tarjeta: %f\n", factura.getClie().getCreditCard().get(0).getLimite());
        System.out.printf("Veraz: %b \n", factura.getClie().problemaVerazCodeme());
        System.out.printf("\n");
        System.out.printf("Proveedor: %s de %s %s\n", prov.getNombreComercial(), prov.getNombre(), prov.getApellido());
        System.out.printf("CUIT: %d\n",prov.getCuit());
    }
    
}
