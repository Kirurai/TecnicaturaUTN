/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArray;

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
        int [] almacenador = new int [10];
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        
        System.out.println("Ingrese 10 valores para agregarlos al array y encontrar cuantas veces se repite el mayor");
        for(int i = 0; i < 10; i++){
            System.out.printf("Ingrese el %d° número: ", i+1);
            almacenador[i] = sc.nextInt();
            //System.out.println();
        }
        System.out.println();

        flag = buscar.mayorPorBurbuja(almacenador); //Se ordeno el vector, el ultimo numero debería ser el mayor ergo, deberían estar todos juntos
        System.out.printf("El número que mayor veces aparece es %d y aparece %d veces", flag, almacenador.length - buscar.posicion(almacenador, flag));
         
    }
   
}
