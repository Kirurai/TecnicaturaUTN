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
public class Persona {
    private String nombre;
    private boolean sexo;
    private int fechaNacimiento;

    public Persona(String nombre, boolean sexo, int fechaNacimiento) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Persona() {
        this.nombre = "Nombre no registrado";
        this.sexo = false;
        this.fechaNacimiento = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(int fechaActual){
        return fechaActual-this.fechaNacimiento;
    }
    
}