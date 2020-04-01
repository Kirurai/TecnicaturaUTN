/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_2;

/**
 *
 * @author martin
 */
public class Alumno extends Persona {
    private int legajo;

    public Alumno(int legajo, double estatura, double peso, boolean sexo, int edad, String nombre) {
        super(estatura, peso, sexo, edad, nombre);
        this.legajo = legajo;
    }
    
//    public Alumno(int legajo) {
//        this.legajo = legajo;
//    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
    
}
