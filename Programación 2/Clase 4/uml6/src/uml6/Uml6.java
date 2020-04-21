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
        
        Proveedor prov = new Proveedor("El olimpo", 10101010, "seres", "humanos", 20101010108l);
        Factura factura = new Factura(0123, "Zeus", "Todopoderoso", 201238, fechaIngresoEmp, nroLegajoEmp, dniClie, nombreClie, apellidoClie, cuitClie, nroFactura, fecha, monto);
    
        TarjetaCredito visa1 = new TarjetaCredito(new Date(2323223232L), 5000);
        
        
        System.out.printf("Factura N°%d\n",factura.getNroFactura());
        System.out.println("Fecha: "+factura.getFecha());
        System.out.printf("Importe: $"+factura.getMonto());
        System.out.printf("Empleado: "+factura.getEmp().getNombre()+" "+factura.getEmp().getApellido());
        System.out.printf("Legajo N°"+factura.getEmp().getNroLegajo());
        System.out.printf("Cliente: "+factura.getClie().getNombre()+" "+factura.getClie().getApellido());
        System.out.printf("CUIT: "+factura.getClie().getCuit());
        System.out.printf("Limite tarjeta: "+factura.getClie().getCreditCard().get(0).getLimite());
        System.out.printf("Veraz: "+factura.getClie().problemaVerazCodeme());
        System.out.printf("");
        System.out.printf("Proveedor: %s de %s %s", prov.getNombreComercial(), prov.getNombre(), prov.getApellido());
        System.out.printf("CUIT: "+prov.getCuit());
    }
    
}
