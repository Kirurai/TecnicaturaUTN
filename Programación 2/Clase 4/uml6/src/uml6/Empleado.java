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
public class Empleado extends Persona implements EstadoCuenta{
    private Date fechaIngreso;
    private int nroLegajo;
    
    public Empleado(){
        
    }
    public Empleado(int dni, String nombre, String apellido, long cuit, Date fechaIngreso, int nroLegajo){
        super(dni, nombre, apellido, cuit);
        this.fechaIngreso = fechaIngreso;
        this.nroLegajo = nroLegajo;
    }
    
    public Date getFechaIngreso(){
        return this.fechaIngreso;
    }
    public int getNroLegajo(){
        return this.nroLegajo;
    }    
    
    public void setFechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public void setNroLegajo(int nroLegajo){
        this.nroLegajo = nroLegajo;
    }
    
    @Override
    public long getCuit() {
        return this.cuit;
    }
    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    @Override
    public boolean problemaVerazCodeme() {
        return true;
    }
}
