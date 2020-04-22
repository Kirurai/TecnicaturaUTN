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
public class HondaXR25 extends Moto{
    private String tipo = "Honda XR25";

    public HondaXR25() {
    }

    public HondaXR25(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void esquivarObstaculo(int metros){
        System.out.printf("Se pueden esquivar obstaculos desde los %d m ", metros);
    }
}
