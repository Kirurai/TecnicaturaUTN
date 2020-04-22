/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml5;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarcoAVela barco = new BarcoAVela();
        FordFalcon falcon = new FordFalcon();
        HondaXR600 XR600 = new HondaXR600();
        HondaXR25 XR25 = new HondaXR25();
        Boeing747 boeing = new Boeing747();
        
        ArrayList <Vehiculo> moviles= new ArrayList<>();
        moviles.add(barco);
        moviles.add(falcon);
        moviles.add(XR600);
        moviles.add(XR25);
        moviles.add(boeing);
        
        for (int i = 0; i < moviles.size(); i++){
            imprimirVehiculo(moviles.get(i));
        }
        
        
    }
    
    public static void imprimirVehiculo(Vehiculo movil){

        try{
            System.out.println("Es un/una " + movil.tipo);
        }catch(Exception e){
            
        }
        movil.setVelocidadMaxima(150 + (int)(Math.random() * ((300 - 150) + 1)));
        movil.setVelocidadPromedio(50 + (int)(Math.random() * ((130 - 50) + 1)));
        System.out.println("Velocidad máxima: " + movil.getVelocidadMaxima()+" km/h");
        System.out.println("Velocidad promedio: " + movil.getVelocidadPromedio()+" km/h");
        movil.romperInercia();
        System.out.println("-------------------------------------------------");
    }
}
