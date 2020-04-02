/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_modificada;

/**
 *
 * @author Maurizio Miño <kd.maurii@gmail.com>
 */
public class Clase2_Modificada {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {

        final int añoActual = 2020;

        final Alumno a1 = new Alumno(250, "Carlos Gomez", true, 1995);
        final Profesor p1 = new Profesor("Matematicas", "Roberta Martinez", false, 1982);

        imprimirAlumno(a1, añoActual);
        imprimirProfesor(p1, añoActual);

        a1.setFechaNacimiento(1992);
        a1.setLegajo(123);
        p1.setNombre("Martín Martinez");
        p1.setSexo(true);

        imprimirAlumno(a1, añoActual);
        imprimirProfesor(p1, añoActual);
    }

    public static void imprimirAlumno(final Alumno humano, final int añoA) {
        System.out.println("");
        System.out.println("Nombre del alumno: " + humano.getNombre());
        System.out.println("Edad: " + humano.calcularEdad(añoA));
        System.out.println("Sexo: " + sexo(humano));
        System.out.println("Legajo: " + humano.getLegajo());
    }

    public static void imprimirProfesor(final Profesor humano, final int añoA) {
        System.out.println("");
        System.out.println("Nombre del profesor: " + humano.getNombre());
        if (humano.getFechaNacimiento() != 0){
            System.out.println("Edad: " + humano.calcularEdad(añoA));
        }else{
            System.out.println("Edad no registrada");
        }
        System.out.println("Sexo: " + sexo(humano));
        System.out.println("Cátedra: " + humano.getCatedra());
    }

    public static String sexo(final Persona p) {
        if(p.isSexo() == false){
            return "Mujer";
        }else{
            return "Hombre";
        }
    }
    
}

