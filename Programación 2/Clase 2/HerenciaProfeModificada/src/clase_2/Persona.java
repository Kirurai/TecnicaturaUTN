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
class Persona {
    protected double estatura;
    protected double peso;
    protected boolean sexo;
    protected int edad;
    protected String nombre;

    public Persona() {
        this.estatura = 0.0;
        this.peso = 0.0;
        this.sexo = true;
        this.edad = 0;
        this.nombre = "";
    }


    public Persona(double estatura, double peso, boolean sexo, int edad, String nombre) {
        this.estatura = estatura;
        this.peso = peso;
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    
}
