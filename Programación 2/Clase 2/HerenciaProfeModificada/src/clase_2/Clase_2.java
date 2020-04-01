/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase_2;

import static java.lang.System.out;

/**
 *
 * @author martin
 */
public class Clase_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int legajo, double estatura, double peso, boolean sexo, int edad, String nombre
        Alumno a = new Alumno(45, 1.76, 110.0, true, 41, "Martin");
        Profesor p = new Profesor("Matemática", 25.22, 85.56, true, 25, "Pepe");
                
        System.out.println("Alumno: " + a.getNombre() + " y Tiene "+a.getEdad() + " de edad "+"y es " + sexo(a));
        a.setEdad(14);
        a.setLegajo(7777);
        System.out.println("Alumno: "+a.getNombre()+" y Tiene "+a.getEdad()+" de edad");
        System.out.println("Sexo del alumno=>"+ sexo(a) );
        System.out.println("Sexo del profesor=>"+ sexo(p) );
    }
    
    public static String sexo(Persona p){
        if(p.isSexo() == true){
            return "Mujer";
        }else{
            return "Varon";
        }
    }
    
}
