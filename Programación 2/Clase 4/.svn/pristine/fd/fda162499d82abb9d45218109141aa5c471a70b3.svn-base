/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado_simi;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CentroDistribucion {

    public void revisar(Sucursal fuente, Sucursal destino, Producto computadoras) {

        Scanner s = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println("Ingrese la operación que desea realizar: \n"
                    + "1) Agregar producto a sucursal fuente\n"
                    + "2) Agregar producto a sucursal destino\n"
                    + "3) consultar stock de sucursal fuente\n"
                    + "4) consultar stock de sucursal destino\n"
                    + "5) salir");
            eleccion = s.nextInt();
            if (eleccion == 1) {
                agregarFuente(fuente, destino, computadoras);
//                break;
            } else if (eleccion == 2) {
                agregarDestino(fuente, destino, computadoras);
            }
        } while (true);

    }

    public void agregarFuente(Sucursal fuente, Sucursal destino, Producto computadoras) {

        if (fuente.getStock().size() <= 99) {
            fuente.getStock().add(computadoras);
            System.out.println("Se ha agregado un producto a la lista del stock de Sucursal fuente");
        } else if (fuente.getStock().size() >= 100) {
            System.out.println("La cantidad de productos en stock ha llegado a su límite");
        }
    }

    public void agregarDestino(Sucursal fuente, Sucursal destino, Producto computadoras) {

        if (destino.getStock().size() <= 99) {
            destino.getStock().add(computadoras);
            System.out.println("Se ha agregado un producto a la lista del stock de Sucursal destino");
        } else if (destino.getStock().size() >= 100) {
            System.out.println("La cantidad de productos en stock ha llegado a su límite");
        }

    }
}
