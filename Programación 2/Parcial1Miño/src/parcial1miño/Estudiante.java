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
public class Estudiante {
    private String nombre;
    private int aspiranteAGrado;
    private ProyectoDeGrado proyectoDeGrado;
    private EjecucionDelProyecto ejecucionDelProyecto;
    private ArrayList<Soluciones> soluciones = new ArrayList<>();
    private ArrayList<Universidad> universidades = new ArrayList<>();
    private ArrayList<PersonalDocente> docentes = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(String nombre, int aspiranteAGrado, ProyectoDeGrado proyectoDeGrado, EjecucionDelProyecto ejecucionDelProyecto, Soluciones solucion, PersonalDocente docente) {
        this.nombre = nombre;
        this.aspiranteAGrado = aspiranteAGrado;
        this.proyectoDeGrado = proyectoDeGrado;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
        this.soluciones.add(solucion);
        this.docentes.add(docente);
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAspiranteAGrado() {
        return aspiranteAGrado;
    }
    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

    public ProyectoDeGrado getProyectoDeGrado() {
        return proyectoDeGrado;
    }
    public void setProyectoDeGrado(ProyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }
    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public ArrayList<Soluciones> getSoluciones() {
        return soluciones;
    }
    public void setSoluciones(ArrayList<Soluciones> soluciones) {
        this.soluciones = soluciones;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }
    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }

    public ArrayList<PersonalDocente> getDocentes() {
        return docentes;
    }
    public void setDocentes(ArrayList<PersonalDocente> docentes) {
        this.docentes = docentes;
    }
    
    
    
    
    
    public String estudiar(){
        return "String genérico";
    }
    public String formarse(){
        return "String genérico";
    }
    public String irALaUniversidad(){
        return "String genérico";
    }
}
