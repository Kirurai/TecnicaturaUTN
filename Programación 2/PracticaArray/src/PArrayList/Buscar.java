/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArrayList;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class Buscar {
    public int posicion(ArrayList<Integer> num, int buscar){ // devuelve el valor de la posición  del número buscado. un -1 significa que no existe
        int posicion = -1;
        
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i)==buscar) {
                
                posicion = i;
                break;
            }
        }    
        return posicion;
    }
    
    public int mayor(ArrayList<Integer> num) { // devuelve el mayor numero.
        int flag = num.get(0);
        for (int i = 1; i < num.size(); i++){
            if (num.get(i) > flag){
                flag = num.get(i);
            }
        }
        return flag;
    }
    
    public int primoMayor (ArrayList<Integer> num){   //busca el mayor numero primo en un array, regresa el valor del numero. si no hay primos devuelve -1 
        
        int mayorPrimo=-1;
                
        for (int i = 0; i < num.size(); i++) {
            
            if (num.get(i)>mayorPrimo && esPrimo(num.get(i))) {
                
                mayorPrimo = num.get(i);
            }            
        }        
        return mayorPrimo;
    }
    
    public boolean esPrimo(int num){
        boolean flag = true;
        for(int i = 2; i < num/2; i++){ //empieza con 2, 1 no es primo
            if (num%i == 0){
                flag = false;
                break;
            }
        }
        
        
        return flag;
    }
    public void ordenar(ArrayList<Integer> n) { //ordena el arraylist, devuelve el mayor numero.
        //ArrayList<Integer> lista = new ArrayList<>(n);
        Collections.sort(n);
    }
}
