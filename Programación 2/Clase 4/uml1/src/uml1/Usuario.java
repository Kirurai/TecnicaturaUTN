/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

import java.util.*;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Usuario extends Persona{
    private int idUsuario;
    private String usuario;
    private String password;
    private Vector <Contacto> contactos;
    
    public Usuario(int IdPersona, String nombre, String apellido, int idUsuario, String usuario, String password){
        super(IdPersona, apellido, nombre);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    
    public int getIdUsuario(){
        return this.idUsuario;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public String getPassword(){
        return this.password;
    }
    public Vector <Contacto> getContactos(){
        return this.contactos;
    }
    
    public void setIdUsuario(int id){
        this.idUsuario = id;
    }
    public void setUsuario(String user){
        this.usuario = user;
    }
    public void setPassword(String pw){
        this.password = pw;
    }
    public void setContactos(Vector <Contacto> contactos){
        this.contactos = contactos;
    }
    
    public void addContacto(Contacto contacto){
        this.contactos.add(contacto);
    }
    
}
