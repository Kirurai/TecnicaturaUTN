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
public class PersonalDocente {
    private String nombre;
    private String conocimiento;
    private String experiencia;
    private int trayectoria;
    private ArrayList<Recopilacion> recopilaciones = new ArrayList<>();
    private ArrayList<Universidad> universidades = new ArrayList<>();
    private ArrayList<EjecucionDelProyecto> EjecucionesProyectos = new ArrayList<>();
    private Estudiante estudiante;

    public PersonalDocente() {
    }
    public PersonalDocente(String nombre, String conocimiento, String experiencia, int trayectoria) {
        this.nombre = nombre;
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
    }

    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConocimiento() {
        return conocimiento;
    }
    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }
    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
    }

    public ArrayList<Recopilacion> getRecopilaciones() {
        return recopilaciones;
    }
    public void setRecopilaciones(ArrayList<Recopilacion> recopilaciones) {
        this.recopilaciones = recopilaciones;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }
    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }

    public ArrayList<EjecucionDelProyecto> getEjecucionesProyectos() {
        return EjecucionesProyectos;
    }
    public void setEjecucionesProyectos(ArrayList<EjecucionDelProyecto> EjecucionesProyectos) {
        this.EjecucionesProyectos = EjecucionesProyectos;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    
    public String Evaluar(){
        return "Aprobado de Personal Docente evaluar()";
    }
    public String funcionDeSeguimiento(){
        return "Inserte String genérico ";
    }
    public String gestion(){
        return "String genérico";
    }
    public String orientar(){
        return "String genérico";
    }
}
