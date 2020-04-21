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
public class Auto extends Vehiculo implements Motor {
    private int puertas;
    
    public Auto(){
        
    }
    public Auto(int ruedas, int puertas, String duenio){
        super(ruedas, duenio);
        this.puertas = puertas;
    }
    
    public String tipoMovil(){
        return "auto";
    }
    @Override
    public String tipo(){
        return "Tiene un motor de auto";
    }
    @Override
    public double precio(){
        return 2.0;
    }
    @Override
    public double velocidadMaxima(){
        return 3.0;
    }
    @Override
    public int getRuedas(){
        return this.ruedas;
    }
    @Override
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
}
