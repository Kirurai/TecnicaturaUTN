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
public class Libro extends Media {
    private String autor;
    private int hojas;
    private String review;
    
    public Libro(String titulo, String autor, int hojas){
        super(titulo, "Libro");
        this.setAutor(autor);
        this.setHojas(hojas); 
        //this.setReview(review);  
    }
    
    public String getAutor(){
        return this.autor;
    }
    public int getHojas(){
        return this.hojas;
    }
    public String getReview(){
        return this.review;
    }

    public void setAutor( String autor){
        this.autor = autor;
    }
    public void setHojas(int hojas){
        this.hojas = hojas;
    }
    public void setReview(String review){
        this.review = review;
    }

    
    
    public void introduccion(){ //Override
        System.out.printf("%s trata sobre %s.\n Fantástica obra de %s en tan solo %s hojas", super.getTitulo(), this.getReview(), this.getAutor(), this.getHojas());
    }
}
