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
public class Barco extends Vehiculo {
    
    public Barco(){
        
    }
    public Barco(double velocidadPromedio, int velocidadMaxima){
        super(velocidadPromedio, velocidadMaxima);
    }
    
    @Override
    public void esquivarObstaculo() {
        
    }

    @Override
    public void romperInercia() {
        this.setVelocidadPromedio(0);
        System.out.println("La inercia del barco ha sido reducida a 0 respecto tierra.. o bueno.. mar");
    }
    
}
