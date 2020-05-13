/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1miño;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class EjecucionDelProyecto {
    private String ProyectoDeGradoTerminado;
    private int recursosDisponibles;
    private Resultados resultado = new Resultados();
    private Estudiante estudiante;
    private PersonalDocente docente;

    public EjecucionDelProyecto() {
    }
    public EjecucionDelProyecto(String ProyectoDeGradoTerminado, int recursosDisponibles, Resultados resultado) {
        this.ProyectoDeGradoTerminado = ProyectoDeGradoTerminado;
        this.recursosDisponibles = recursosDisponibles;
        this.resultado = resultado;
    }

    public String getProyectoDeGradoTerminado() {
        return ProyectoDeGradoTerminado;
    }
    public void setProyectoDeGradoTerminado(String ProyectoDeGradoTerminado) {
        this.ProyectoDeGradoTerminado = ProyectoDeGradoTerminado;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }
    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public Resultados getResultado() {
        return resultado;
    }
    public void setResultado(Resultados resultado) {
        this.resultado = resultado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public PersonalDocente getDocente() {
        return docente;
    }
    public void setDocente(PersonalDocente docente) {
        this.docente = docente;
    }
        
    
       
    
    public String comenzarDesarrolloDelProyecto(){
        return "String genérico";
    }
    public String finalizarDesarrolloDelProyecto(){
        return "String genérico";
    }
}
