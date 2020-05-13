/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArray;

import java.util.Arrays;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class NumPrimos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean [] criba = new boolean [300]; //Vector de 300 partes. 
        Arrays.fill(criba, true);  //todos true por defecto. los true serán primos siguiendo el algoritmo de la criba de eratostenes
        int [] almacenador = new int[10];
        int cotaInferior = 100;
        int cotaSuperior = 300;
        int indice = 0;

        criba[0] = false;
        criba[1] = false;
        
        for(int i = 0; i < criba.length; i++){
            if (criba[i]){
                for( int j = i +1; j < criba.length; j++){
                    if (j%i == 0){
                        criba[j] = false;
                    }
                }    
            }            
        }
        //a esta altura, los true son primos, los false no
        
        
        for(int j = cotaInferior; j < cotaSuperior; j++){
            if (criba[j]){
                almacenador[indice] = j;
                indice++;
            }
            if (almacenador[9] != 0){
                break;
            }
        }
        
                
        for(int i = 0; i < almacenador.length; i++){
            System.out.println(almacenador[i]);
        }
        
    }
    
}