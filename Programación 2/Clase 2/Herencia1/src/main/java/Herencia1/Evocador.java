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
public class Evocador extends Mago{
    private String habilidad; //TODO: volverlo array para tener un vector de habilidades.
    private String arquetipo;
    private String elemento;
    

    public Evocador(String nombre, int nivel, int fuerza, int inteligencia, String elemento){
        super(nombre, nivel, fuerza, inteligencia);
        setHabilidad("Rayo");
        setArquetipo("Evocador");
        setElemento(elemento);
    }

    public String getHabilidad(){
        return this.habilidad;
    }    
    public String getArquetipo() {
        return this.arquetipo;
    }
    public String getElemento() {
        return this.elemento;
    }

    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }
    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }
    public void setElemento(String elemento){
        this.elemento = elemento;
    }

    public void presentacion(){
        System.out.printf("Buenos días! Soy %s y soy un %s de tipo %s! Te despeinaré!\n", super.getNombre(), this.getArquetipo(), this.getElemento());
    }
    public void lanzarHabilidad() {//TODO Modificar cuando se cree el array de habilidades
        System.out.printf("%s ha convocado un %s desde los cielos!\nHa dejado frito (y despeinado) al enemigo!\n", super.getNombre(), this.getHabilidad());
    }

}
