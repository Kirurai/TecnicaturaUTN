/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_oro_david;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class InterfazDeUsuario {

    public InterfazDeUsuario() {
    }

    Sucursal[] aux1 = new Sucursal[1];

    public void ejecutar() {
        boolean aux0 = true;

        while (aux0) {
            System.out.println("Elija una opcion:\n1-  Crear Sucursal\n2- Realizar movimiento entre sucursales\n3- Consultar movimientos de una sucursal\n4-  Realizar pedido a proveedor\n5- Salir");
            int aux2 = new Scanner(System.in).nextInt();
            switch (aux2) {
                case 1:
                    System.out.println("Ingrese el nombre de la sucursal: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese pedido inicial");
                    Sucursal s1 = new Sucursal(nombre);
                    aux1[0] = s1;
                    break;
                case 2:
                    if (Validador()) {
                        System.out.println("Seleccione el numero de la sucursal de origen");
                        for (int i = 0; i < aux1[0].getSucursales().size(); i++) {
                            System.out.println(i+"-  "+Sucursal.getSucursales().get(i).getNombre());
                        }
                        aux2 = new Scanner(System.in).nextInt();
                        Sucursal.getSucursales().get(aux2).enviar();
                    }
                    break;
                case 3:
                    if (Validador()) {
                        System.out.println("Seleccione el numero de la sucursal para ver sus movimientos");
                        for (int i = 0; i < aux1[0].getSucursales().size(); i++) {
                            System.out.println(i+"-  "+Sucursal.getSucursales().get(i).getNombre());
                        }
                        aux2 = new Scanner(System.in).nextInt();
                        Sucursal.getSucursales().get(aux2).mostrarMovimientos();
                    }
                    break;
                case 4:
                    if (Validador()) {
                        System.out.println("Seleccione el numero de la sucursal para realizar pedido");
                        for (int i = 0; i < aux1[0].getSucursales().size(); i++) {
                            System.out.println(i+"-  "+Sucursal.getSucursales().get(i).getNombre());
                        }
                        aux2 = new Scanner(System.in).nextInt();
                        Sucursal.getSucursales().get(aux2).pedirAProveedor();
                    }
                    break;
                case 5:
                    aux0 = false;
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        }
    }

    private boolean Validador() {
        try {
            aux1[0].getNombre();
            return true;
        } catch (Exception e) {
            System.out.println("Opcion no valida, intente nuevamente.");
            return false;
        }
    }
}
