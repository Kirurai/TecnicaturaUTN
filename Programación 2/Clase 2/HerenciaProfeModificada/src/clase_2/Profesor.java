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
public class Profesor extends Persona{
    private String titulo;
    
    public Profesor(String titulo, double estatura, double peso, boolean sexo, int edad, String nombre) {
        super(estatura, peso, sexo, edad, nombre);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
