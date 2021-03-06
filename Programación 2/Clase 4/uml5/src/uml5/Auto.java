/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml5;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Auto extends Vehiculo {
    
    public Auto(){
        for (int i = 0; i < 4; i++){
            getRuedas().add(new Rueda("auto", 32));
        }
    }
    public Auto(double velocidadPromedio, int velocidadMaxima){
        super(velocidadPromedio, velocidadMaxima);
        
        for (int i = 0; i < 4; i++){
            getRuedas().add(new Rueda("auto", 32));
        }
        
    }
    
    @Override
    public void esquivarObstaculo(){
        
    }

    @Override
    public void romperInercia() {
        this.setVelocidadPromedio(0);
        System.out.println("La inercia del auto ha sido reducida a 0 respecto tierra!");
    }
}
