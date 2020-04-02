/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_modificada;

/**
 *
 * @author Maurizio Miño <kd.maurii@gmail.com>
 */
public class Alumno extends Persona{
   
    private int legajo;

    public Alumno(int legajo, String nombre, boolean sexo, int fechaNacimiento) {
        super(nombre, sexo, fechaNacimiento);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
}