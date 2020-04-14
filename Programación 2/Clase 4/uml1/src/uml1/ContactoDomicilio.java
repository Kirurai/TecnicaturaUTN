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
public class ContactoDomicilio {    
    private int idContactoDomicilio;
    private String descripcion;
    
    public ContactoDomicilio(int idContactoDomicilio, String descripcion){
        setIdContactoDomicilio(idContactoDomicilio);
        setDescripcion(descripcion);
    }
    
    public int getIdContactoDomicilio(){
        return this.idContactoDomicilio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setIdContactoDomicilio(int idContactoDomicilio){
        this.idContactoDomicilio = idContactoDomicilio;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
