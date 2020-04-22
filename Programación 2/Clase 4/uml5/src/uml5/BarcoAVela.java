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
public class BarcoAVela extends Barco {
    private float tamanioMastil;
    private String tipo = "Barco a vela";

    public BarcoAVela() {
    }

    public BarcoAVela(double velocidadPromedio, int velocidadMaxima, float tamanioMastil) {
        super(velocidadPromedio, velocidadMaxima);
        this.tamanioMastil = tamanioMastil;
    }

    public float getTamanioMastil() {
        return tamanioMastil;
    }

    public void setTamanioMastil(float tamanioMastil) {
        this.tamanioMastil = tamanioMastil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
