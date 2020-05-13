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
public class Universidad {
    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    private ArrayList<RecoleccionDeInformacion> recoleccionDeInformaciones = new ArrayList<>();
    private ArrayList<Region> regiones = new ArrayList<>();
    private ArrayList<PersonalDocente> docentes = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Universidad() {
    }
    public Universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica, RecoleccionDeInformacion informacion, PersonalDocente docente) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
        this.recoleccionDeInformaciones.add(informacion);
        this.docentes .add(docente);
    }

    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }
    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }
    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }
    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }
    public void setPublica(String publica) {
        this.publica = publica;
    }

    public ArrayList<RecoleccionDeInformacion> getRecoleccionDeInformaciones() {
        return recoleccionDeInformaciones;
    }
    public void setRecoleccionDeInformaciones(ArrayList<RecoleccionDeInformacion> recoleccionDeInformaciones) {
        this.recoleccionDeInformaciones = recoleccionDeInformaciones;
    }

    public ArrayList<Region> getRegiones() {
        return regiones;
    }
    public void setRegiones(ArrayList<Region> regiones) {
        this.regiones = regiones;
    }

    public ArrayList<PersonalDocente> getDocentes() {
        return docentes;
    }
    public void setDocentes(ArrayList<PersonalDocente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
    
    
    public String ayudarSociedad(){
        return "String genérico";
    }
    public void capacitarEstudiantes(){
        
    }
    public String Desarrollo(){
        return "String genérico";
    }
    public String Investigación(){
        return "String genérico";
    }
}
