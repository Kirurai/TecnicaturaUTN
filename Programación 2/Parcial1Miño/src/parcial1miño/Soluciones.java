/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1miño;

import java.util.ArrayList;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class Soluciones {
    private String alternativas;
    private ArrayList<Estudiante> estudiante = new ArrayList <>();

    public Soluciones() {
    }
    public Soluciones(String alternativas) {
        this.alternativas = alternativas;
    }

    public String getAlternativas() {
        return alternativas;
    }
    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(ArrayList<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }
    
        
    
    public String escoger(){
        return "String genérico";
    }
}
