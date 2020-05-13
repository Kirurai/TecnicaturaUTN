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
public class ProyectoDeGrado {
    private String alcance;
    private int costo;
    private String objetivo;
    private String planDeProyecto;
    private int tiempoDeRealizacion;
    private String titulo;
    private int viabilidad;
    private EjecucionDelProyecto ejecucionDelProyecto = new EjecucionDelProyecto();
    private Soluciones solucion;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public ProyectoDeGrado() {
    }
    public ProyectoDeGrado(String alcance, int costo, String objetivo, String planDeProyecto, int tiempoDeRealizacion, String titulo, int viabilidad, EjecucionDelProyecto ejecucionDelProyecto, Soluciones solucion) {
        this.alcance = alcance;
        this.costo = costo;
        this.objetivo = objetivo;
        this.planDeProyecto = planDeProyecto;
        this.tiempoDeRealizacion = tiempoDeRealizacion;
        this.titulo = titulo;
        this.viabilidad = viabilidad;
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public String getAlcance() {
        return alcance;
    }
    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPlanDeProyecto() {
        return planDeProyecto;
    }
    public void setPlanDeProyecto(String planDeProyecto) {
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() {
        return tiempoDeRealizacion;
    }
    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViabilidad() {
        return viabilidad;
    }
    public void setViabilidad(int viabilidad) {
        this.viabilidad = viabilidad;
    }

    public EjecucionDelProyecto getEjecucionDelProyecto() {
        return ejecucionDelProyecto;
    }
    public void setEjecucionDelProyecto(EjecucionDelProyecto ejecucionDelProyecto) {
        this.ejecucionDelProyecto = ejecucionDelProyecto;
    }

    public Soluciones getSolucion() {
        return solucion;
    }
    public void setSolucion(Soluciones solucion) {
        this.solucion = solucion;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
        
    
    public String efectoPositivoEnRegion(){
        return "String genérico";
    }
    
    public String obetenerTituloProfesional(){
        return "String genérico";
    }
}
