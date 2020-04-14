/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int idPersona;
    
    public Persona(int idPersona, String apellido, String nombre){
        this.idPersona = idPersona;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    public Persona(){
    
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getIdPersona(){
        return this.idPersona;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
}

