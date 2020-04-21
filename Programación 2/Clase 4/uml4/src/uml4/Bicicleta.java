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
public class Bicicleta extends Vehiculo {
    public Bicicleta(){
        
    }
    public Bicicleta(int ruedas, String duenio){
        super(ruedas, duenio);
    }
    
    public String tipoMovil(){
        return "bicicleta";
    }
    public double precio(){
        return 2.0;
    }
    public double velocidadMaxima(){
        return 3.0;
    }
    public int getRuedas(){
        return this.ruedas;
    }
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
    
}
