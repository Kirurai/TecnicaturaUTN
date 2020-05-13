/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PArray;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class Buscar {
    public int posicion(int num [], int buscar){ // devuelve el valor de la posición  del número buscado. un -1 significa que no existe
        int posicion = -1;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i]==buscar) {
                
                posicion = i;
                break;
            }
        }    
        return posicion;
    }
    
    public int mayorPorBurbuja(int[] n) { //Devuelve el mayor int dentro del array con ordenamiento de burbuja
        int flag;
        int tam = n.length;
        for (int i = 1; i < tam; i++) {
            for (int j = tam - 1; j >= i; j--) {
                if (n[j] < n[j - 1]) {
                    flag = n[j];
                    n[j] = n[j - 1];
                    n[j - 1] = flag;
                }
            }
        }
        return n[n.length-1];
    }
    
    public int primoMayor (int [] num){   //busca el mayor numero primo en un array, regresa el valor del numero. si no hay primos devuelve -1 
        
        int mayorPrimo=-1;
                
        for (int i = 0; i < num.length; i++) {
            
            if (num[i]>mayorPrimo && esPrimo(num[i])) {
                
                mayorPrimo = num[i];
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
}
