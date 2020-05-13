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
public class NumTerminados4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buscar buscar = new Buscar();
        ArrayList<Integer> almacenador = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        
        System.out.println("Ingrese 10 valores para agregarlos al array y ver cuantos terminan con 4");
        for(int i = 0; i < 10; i++){
            System.out.printf("Ingrese el %d° número: ", i+1);
            almacenador.add(sc.nextInt());
            //System.out.println();
        }
        System.out.println();
        for(int i = 0; i < almacenador.size(); i++){
            if(almacenador.get(i)%10 == 4){
                System.out.println("Se ha encontrado un numero que termina en 4 en la posición: " + i);
            }else{
                flag++;
            }
        }
        if (flag == almacenador.size()){
            System.out.println("No se encontraron numeros que terminen con 4 en el array dado.");
        }
    }
    
}

