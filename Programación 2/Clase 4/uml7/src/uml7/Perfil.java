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
public class Perfil {
    private int tipoPerfil;
    private String descripcion;
    
    public Perfil(){
        
    }
    public Perfil(int tipoPerfil, String descripcion){
        this.tipoPerfil = tipoPerfil;
        this.descripcion = descripcion;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
