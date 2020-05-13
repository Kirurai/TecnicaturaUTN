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
public class Region {
    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList<Problemas> problemas = new ArrayList<>();
    private ArrayList<Necesidades> necesidades = new ArrayList<>();
    private ArrayList<Universidad> universidades = new ArrayList <>();

    public Region() {
    }
    public Region(String aspectosSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    
    public String getAspectosSocioCulturales() {
        return aspectosSocioCulturales;
    }
    public void setAspectosSocioCulturales(String aspectosSocioCulturales) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }
    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }
    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }
    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public ArrayList<Problemas> getProblemas() {
        return problemas;
    }
    public void setProblemas(ArrayList<Problemas> problemas) {
        this.problemas = problemas;
    }

    public ArrayList<Necesidades> getNecesidades() {
        return necesidades;
    }
    public void setNecesidades(ArrayList<Necesidades> necesidades) {
        this.necesidades = necesidades;
    }

    public ArrayList<Universidad> getUniversidades() {
        return universidades;
    }
    public void setUniversidades(ArrayList<Universidad> universidades) {
        this.universidades = universidades;
    }

    
    
    public String cotidianidad(){
        return "mucha cotidianidad";
    }
}
