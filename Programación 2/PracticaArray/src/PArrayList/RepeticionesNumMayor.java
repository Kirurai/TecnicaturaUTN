/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class RepeticionesNumMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buscar buscar = new Buscar();
        ArrayList<Integer> almacenador = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        
        System.out.println("Ingrese 10 valores para agregarlos al array y encontrar cuantas veces se repite el mayor");
        for(int i = 0; i < 10; i++){
            System.out.printf("Ingrese el %d° número: ", i+1);
            almacenador.add(sc.nextInt());
            //System.out.println();
        }
        System.out.println();

        flag = buscar.mayor(almacenador); //Se ordeno el vector, el ultimo numero debería ser el mayor ergo, deberían estar todos juntos
        buscar.ordenar(almacenador);
        //System.out.println(almacenador.size() + " " + buscar.posicion(almacenador, flag));
        System.out.printf("El número que mayor veces aparece es %d y aparece %d veces", flag, almacenador.size() - buscar.posicion(almacenador, flag));
         
    }
   
}
