/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;

import java.util.ArrayList;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private ArrayList<MedioDeComunicacion> comunicaciones;
    private ArrayList<Perfil> perfiles;

    public Persona(){
        this.comunicaciones = new ArrayList<>();
        this.perfiles = new ArrayList<>();
    }
    public Persona(String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.comunicaciones = comunicaciones;
        this.perfiles = perfiles;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Foto getFoto() {
        return foto;
    }
    public ArrayList<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }
    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    public void setComunicaciones(ArrayList<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }
    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    
    public void agregarPerfil(){
        Perfil perfil = new Perfil();
        this.perfiles.add(perfil);
    }
    public void agregarPerfil(Perfil perfil){
        this.perfiles.add(perfil);
    }
    
    public boolean quitarPerfil(int index){
        if (this.perfiles.size() -1 > index){
            return false;
        }else {
            this.perfiles.remove(index);
            return true;
        }
    }
    
    
}