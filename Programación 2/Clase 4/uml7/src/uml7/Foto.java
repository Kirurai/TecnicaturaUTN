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
public class Foto {
    private String pathToFile;
    private String nombre;
    private float tamaño;

    public Foto(String pathToFile, String nombre, float tamaño) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getPathToFile() {
        return pathToFile;
    }
    public String getNombre() {
        return nombre;
    }
    public float getTamaño() {
        return tamaño;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
