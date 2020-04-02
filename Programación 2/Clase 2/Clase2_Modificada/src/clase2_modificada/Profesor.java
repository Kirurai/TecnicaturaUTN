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
public class Profesor extends Persona {
    
    private String catedra;

    public Profesor(String catedra, String nombre, boolean sexo, int fechaNacimiento) {
        super(nombre, sexo, fechaNacimiento);
        this.catedra = catedra;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    
}