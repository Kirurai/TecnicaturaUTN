/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1;


/**
 *
* @author Miño Maurizio <kd.maurii@gmail.com>
*/

public class Invocador extends Mago{
    private String habilidad; //TODO: volverlo array para tener un vector de habilidades.
    private String arquetipo;
    private int cantidad;
    private String tipo;

public Invocador(String nombre, int nivel, int fuerza, int inteligencia, String tipo){
        super(nombre, nivel, fuerza, inteligencia);
        setHabilidad ("Invocar querubín");
        setArquetipo("Invocador");
        setTipo(tipo);
        setCantidad(super.getNivel()*3);
    }

    public String getHabilidad(){
        return this.habilidad;
    }
    public String getArquetipo() {
        return this.arquetipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }    
    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void presentacion(){
        System.out.printf("Buenos días! Soy %s y soy un %s de %s\n! Y mi sueño es algún día espero poder invocar valkyrias.\n", super.getNombre(), this.getArquetipo(), this.getTipo());
    }
    
    public void lanzarHabilidad() {//TODO Modificar cuando se cree el array de habilidades
        System.out.printf("%s ha invocado un %s desde los cielos!\nSu enemigo se siente bendecido y decidió dejar de atacarlo!\n", super.getNombre(), this.getHabilidad());
    }

}
