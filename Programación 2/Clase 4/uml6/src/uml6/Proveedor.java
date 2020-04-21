/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml6;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Proveedor extends Persona {
    private String nombreComercial;
    
    public Proveedor(){
        super();
    }
    public Proveedor(String nombreComercial, int dni, String nombre, String apellido, long cuit){
        super(dni, nombre, apellido, cuit);
        this.nombreComercial = nombreComercial;
    }
    
    public String getNombreComercial(){
        return this.nombreComercial;
    }
    public void setNombreComercial(String nombreComercial){
        this.nombreComercial = nombreComercial;
    }
    
    //Overrides
    public boolean problemaVerazCodeme(){
        return false;
    }
    public long getCuit(){
        return this.cuit;
    }
    public void setCuit(long cuit){
        this.cuit = cuit;
    }
    //Fin Overrides
}
