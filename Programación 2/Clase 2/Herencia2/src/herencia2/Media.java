/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Maurizio miño <kd.maurii@gmail.com>
 */
public abstract class Media {
    private String titulo;
    private String tipo;
    
    public Media(String titulo, String tipo){
        setTitulo(titulo);
        setTipo(tipo);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public abstract void introduccion();
}
