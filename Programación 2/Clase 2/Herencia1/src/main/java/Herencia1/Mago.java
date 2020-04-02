/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1;

/**
 *
 * @author Kirurai
 */

public class Mago {
    private String nombre;
    private int nivel;
    private int fuerza;
    private int inteligencia;
    

    public Mago(String nombre, int nivel, int fuerza, int inteligencia){
        setNombre(nombre);
        setNivel(nivel);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getNivel() {
        return this.nivel;
    }
    public int getFuerza() {
        return this.fuerza;
    }
    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

}
