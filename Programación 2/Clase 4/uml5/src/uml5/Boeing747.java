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
public class Boeing747 extends Vehiculo{
    private int viajes;
    private String tipo = "Boeing 747";
    
    public Boeing747(){
        
    }
    public Boeing747(double velocidadPromedio, int velocidadMaxima, int viajes){
        super(velocidadPromedio, velocidadMaxima);
        this.viajes = viajes;
    }
    
    public int getViajes(){
        return this.viajes;
    }
    
    public void setViajes(int viajes){
        this.viajes = viajes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void despegar(){
        System.out.println("El Avión ha despegado");
    }
    public void aterrizar(){
        System.out.println("El Avión ha aterrizado");
    }
    public void agregarViaje(){
        this.viajes++;
    }

    @Override
    public void esquivarObstaculo() {
        
    }

    @Override
    public void romperInercia() {
        this.setVelocidadPromedio(0);
        System.out.println("La inercia del auto ha sido reducida a 0 respecto tierra!.. EL AVION ESTÁ EN CAIDA LIBRE");
    }
}
