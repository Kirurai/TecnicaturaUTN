/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import java.lang.Math;

/**
 *
 * @author Maurizio miño <kd.maurii@gmail.com>
 */
public class Herencia2 {

    public static void main(String[] args) {
       final Libro book = new Libro("Amanecer Rojo", "Pierce Brown", 544);
       final Pelicula peli = new Pelicula("Mente indomable", "Gus Van Sant", 2, 6, "Matt Damon");
               
       
       
       book.setReview("Marte lleva siglos colonizado por la humanidad, que ha establecido un estricto sistema de castas condicionadas genéticamente para garantizar la explotación de las riquezas minerales y la supremacía de la clase gobernante.\n Los Rojos son los mineros sometidos al poder de los Dorados, la clase superior de la sociedad, que dispone de todos los logros y adelantos de la civilización, mientras que la clase más baja sólo puede esperar una muerte lenta en los túneles de explotación o a manos de la policía. \nPero la rebelión se está incubando en el seno de esa sociedad. Darrow, un Rojo desesperado por el asesinato de su esposa, recibe una propuesta sorprendente: someterse a una serie de modificaciones para convertirse en un Dorado y participar en el brutal método de formación de la casta dirigente, que los convierte en máquinas de matar desalmadas, con el fin de dinamitar su poder desde dentro.\n El muchacho acepta y desde ese momento tendrá que luchas por sobrevivir en una sociedad sin moral y sin amigos.");
       peli.setSinopsis("Will es un joven rebelde con una inteligencia asombrosa, especialmente para las matemáticas.\n El descubrimiento de su talento por parte de los profesores le planteará un dilema: seguir con su vida de siempre -un trabajo fácil, buenos amigos con los que tomar unas cervezas- o aprovechar sus grandes cualidades intelectuales en alguna universidad.\n Sólo los consejos de un solitario y bohemio profesor le ayudarán a decidirse.");
       
       elegirRecomendacion(book, peli);
    }
    
    
    
    public static void elegirRecomendacion(Libro book, Pelicula peli){
        System.out.println("");
        int recomendar = (int) Math.floor(Math.random()*50);
        if (recomendar%2 == 0){
            recomendar(peli);
        }else{
            recomendar(book);
            System.out.println("\n\n De panita profe! se lo recomiendo mucho a este libro, lealo cuando tenga tiempo!");
        }
    }
    public static void recomendar(Media media){
        media.introduccion();
    }
}
