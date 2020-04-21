/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml6;

import java.util.Date;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class TarjetaCredito {
    private Date fechaIngreso;
    private double limite;
    
    public TarjetaCredito(){
        
    }
    public TarjetaCredito(Date fechaIngreso, double limite) {
        this.fechaIngreso = fechaIngreso;
        this.limite = limite;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public double getLimite() {
        return limite;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    
    
}
