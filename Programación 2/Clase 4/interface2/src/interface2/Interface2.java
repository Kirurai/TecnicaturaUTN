/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Interface2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro tobi = new Perro();
        Mimic mimic = new Mimic();
        
        tobi.ruido();
        mimic.ruido();
    }
    
}
