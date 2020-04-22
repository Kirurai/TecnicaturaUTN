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
public abstract class Vehiculo implements Desplazable {
    private double velocidadPromedio;
    private int velocidadMaxima;
    private ArrayList<Rueda> ruedas = new ArrayList<>();
    
    public Vehiculo(){
        
    }
    public Vehiculo(double velocidadPromedio, int velocidadMaxima){
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public final ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
    @Override
    public  abstract void esquivarObstaculo();
    
    public abstract void romperInercia();
    
    
    
}
