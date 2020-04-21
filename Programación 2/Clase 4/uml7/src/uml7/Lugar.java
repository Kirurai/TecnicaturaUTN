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
public class Lugar {
    private String nombre;
    private Direccion direccion;

    public Lugar(){
        
    }
    public Lugar(String nombre, String calle, String numero) {
        this.nombre = nombre;
        this.direccion = new Direccion(calle, numero);
    }

    public String getNombre() {
        return nombre;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
