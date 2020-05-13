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
public class NumMayorPrimo {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Buscar buscar = new Buscar();
        ArrayList <Integer> almacenador = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese 10 valores para agregarlos al array para encontrar el mayor numero primo entre esos");
        for(int i = 0; i < 10; i++){
            System.out.printf("Ingrese el %d° número: ", i+1);
            almacenador.add(sc.nextInt());
            //System.out.println();
        }
        System.out.println();
        
        
        if (buscar.primoMayor(almacenador) != -1){
            System.out.printf("El mayor primo leído es %d y está en la posición %d\n", buscar.primoMayor(almacenador), buscar.posicion(almacenador, buscar.primoMayor(almacenador)));
        }else{
            System.out.printf("Hubo un error en los datos. Vuelva a ejecutar el programa\n");
        }
    }
    
}
