/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Maurizio miño <kd.maurii@gmail.com>
 */
public class Pelicula extends Media{
    private String director;
    private int horas;
    private int minutos;
    private String duracion;
    private String protagonista;
    private String sinopsis;
    
    public Pelicula(String titulo, String director,  int horas, int minutos, String protagonista){
        super(titulo, "Pelicula");
        this.setDirector(director);
        this.setHoras(horas); 
        this.setMinutos(minutos);  
        this.setDuracion("" + this.getHoras() + ":" + this.getMinutos() + "Hs.");
        this.setProtagonista(protagonista);
    }
    
    public String getDirector(){
        return this.director;
    }
    public int getHoras(){
        return this.horas;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public String getDuracion(){
        return this.duracion;
    }
    public String getProtagonista(){
        return this.protagonista;
    }
    public String getSinopsis(){
        return this.sinopsis;
    }
    
    public void setDirector( String director){
        this.director = director;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    public void setProtagonista(String protagonista){
        this.protagonista = protagonista;
    }
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    public void introduccion(){ //Override
        System.out.printf("%s trata sobre %s.\nProtagonizada por: %s\nDirector: %s\nDuracion:", super.getTitulo(), this.getSinopsis(), this.getProtagonista(), this.getDirector(), this.getDuracion());
    }
}
