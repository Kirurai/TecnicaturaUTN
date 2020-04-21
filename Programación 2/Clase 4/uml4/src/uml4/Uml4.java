/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml4;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto moto1 = new Moto(2, "Mordekainen");
        Auto auto1 = new Auto(4, 5, "Mei");
        Bicicleta bici = new Bicicleta(2, "Xanathar");
        ArrayList <Vehiculo> moviles = new ArrayList<>();
        
        moviles.add(moto1);
        moviles.add(auto1);
        moviles.add(bici);
        for (int i = 0; i < moviles.size(); i++){
            System.out.printf("El/La %s pertenece a %s\n", moviles.get(i).tipoMovil(), moviles.get(i).getDuenio());
            System.out.printf("Ruedas: %d\n", moviles.get(i).getRuedas());
            System.out.printf("Precio: %f\n",moviles.get(i).precio());
            System.out.printf("Velocidad maxima: %f\n", moviles.get(i).velocidadMaxima());
            try {
                System.out.printf("Tipo de motor: %s\n", moviles.get(i).tipo());
            }catch(Exception  e){
                
            }
            System.out.printf(" \n");
        }
        
    }
}
