/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado_simi;

/**
 *
 * @author Usuario
 */
public class Mercado_Simi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sucursal fuente = new Sucursal("Empresa", "calle falsa 123", "fuente", 4912454);
        Sucursal destino = new Sucursal("Empresa2", "Bandera de los andes 123", "Destino", 49124542);
        Producto computadoras = new Producto("Computadora", "Samsung", 15000);
        CentroDistribucion centro = new CentroDistribucion();
        
        centro.revisar(fuente, destino, computadoras);
        
        
    }
    
}
