/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Direccion {
    private String calle;
    private String numero;

    public Direccion(){
    
    }
    public Direccion(String calle, String numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }
    public String getNumero() {
        return numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
