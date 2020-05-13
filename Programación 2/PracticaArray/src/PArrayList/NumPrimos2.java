/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class NumPrimos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Boolean>  criba = new ArrayList<>(Arrays.asList(new Boolean[300])); //Vector de 300 partes. 
        Collections.fill(criba, true);  //todos true por defecto. los true serán primos siguiendo el algoritmo de la criba de eratostenes
        ArrayList<Integer> almacenador = new ArrayList<>();
        int cotaInferior = 100;
        int cotaSuperior = 300;
        int indice = 0;

        criba.set(0, false);
        criba.set(1, false);
        
        for(int i = 0; i < criba.size(); i++){
            if (criba.get(i)){
                for( int j = i +1; j < criba.size(); j++){
                    if (j%i == 0){
                        criba.set(j, false);
                    }
                }    
            }            
        }
        //a esta altura, los true son primos, los false no
        
        
        for(int j = cotaInferior; j < cotaSuperior; j++){
            if (criba.get(j)){
                almacenador.add(j);
                indice++;
            }
            if (almacenador.size() == 10){
                break;
            }
        }
        
                
        for(int i = 0; i < almacenador.size(); i++){
            System.out.println(almacenador.get(i));
        }
        
    }
    
}
