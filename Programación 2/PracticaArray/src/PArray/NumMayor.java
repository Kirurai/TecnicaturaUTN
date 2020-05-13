/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package PArray;

import java.util.Scanner;

/**
 *  Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor número leído.
 * 
 *  @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class NumMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buscar buscar = new Buscar();
        int [] almacenador = new int [10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese 10 valores para agregarlos al array y encontrar el mayor");
        for(int i = 0; i < 10; i++){
            System.out.printf("Ingrese el %d° número: ", i+1);
            almacenador[i] = sc.nextInt();
            //System.out.println();
        }
        System.out.println();
        if (buscar.mayorPorBurbuja(almacenador.clone()) != -1){
            System.out.printf("El mayor número leído es %d y está en la posición %d\n", buscar.mayorPorBurbuja(almacenador.clone()), buscar.posicion(almacenador, buscar.mayorPorBurbuja(almacenador.clone())));
        }else{
            System.out.printf("Hubo un error en los datos. Vuelva a ejecutar el programa\n");
        }
    }
    
}
