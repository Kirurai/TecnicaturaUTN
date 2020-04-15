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
public class Contacto extends Persona {
    private int idContacto;
    private ContactoTipo tipo;
    private final Vector <ContactoTelefono> telefonos = new Vector<>();
    private final Vector <ContactoDomicilio> domicilios = new Vector<>();
    
    public Contacto(int idPersona, String nombre, String apellido, int idContacto, ContactoTipo tipo){
        super(idPersona, apellido, nombre);
        this.idContacto = idContacto;
        this.tipo = tipo;
    }
    public Contacto(){
        
    }
    
    public int getIdContacto(){
        return this.idContacto;
    }
    public ContactoTipo getTipo(){
        return this.tipo;
    }
    public Vector <ContactoDomicilio> getDomicilios(){
        return this.domicilios;
    }
    public Vector <ContactoTelefono> getTelefonos(){
        return this.telefonos;
    }
    
    public void setIdContacto(int id){
        this.idContacto = id;
    }
    public void setTipo(ContactoTipo tipo){
        this.tipo = tipo;
    }
    
    public void addDomicilio(ContactoDomicilio domicilio){
        domicilios.add(domicilio);
    }
    public void addTelefono(ContactoTelefono telefono){
        telefonos.add(telefono);
    }
}
