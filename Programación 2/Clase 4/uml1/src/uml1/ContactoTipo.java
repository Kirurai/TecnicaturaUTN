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
public class ContactoTipo {
    private int idContactoTipo;
    private String descripcion;
    
    public ContactoTipo(int idContactoTipo, String descripcion){
        this.descripcion = descripcion;
    }
    
    public int getIdContactoTipo(){
        return this.idContactoTipo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
}
