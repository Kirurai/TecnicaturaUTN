/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml4;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public abstract class Vehiculo {
    protected int ruedas;
    protected String duenio;

    public Vehiculo(){
        
    }
    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }
    
    public abstract double precio();
    public abstract double velocidadMaxima();
    public abstract int getRuedas();
    public abstract void setRuedas(int ruedas);
    
    public String getDuenio(){
        return this.duenio;
    }
    public void setDuenio(String duenio){
        this.duenio = duenio;
    }
    
}
