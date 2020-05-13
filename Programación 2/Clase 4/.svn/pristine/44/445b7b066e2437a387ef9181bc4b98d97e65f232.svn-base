/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoSucursal;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {

    public static void main(String[] args) {
        int i = 0, totalfuente = 0, totaldestino = 0;
        Sucursal Sdestino = new Sucursal(50, 100000);
        CentroDistribucion Sfuente = new CentroDistribucion(50, 100000);
        do {
            int aleatorio = (int) ((Math.random() * 5000) + 1);
            Sdestino.addsetProductoFuente(new Producto(aleatorio, "descripcion"));
            totalfuente = totalfuente + aleatorio;
            aleatorio = (int) ((Math.random() * 5000) + 1);
            Sfuente.addsetProductoFuente(new Producto((int) (Math.random() * 5000) + 1, "descripcion"));
            totaldestino = totaldestino + aleatorio; 
            i++; 
        } while (i < 50);

        Sdestino.setValorTotalProctos(totaldestino);
        Sfuente.setValorTotalProctos(totaldestino);
        System.out.println("Elija transferir productos: ");
        Scanner sn = new Scanner(System.in);
        int opcion = sn.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Envie productos desde Sucursal Fuente a sucursal Destino");
                
                break;
            case 2:
                System.out.println("Envie productos desde Sucursal Destino a sucursal Fuente");

        }
    }
}
