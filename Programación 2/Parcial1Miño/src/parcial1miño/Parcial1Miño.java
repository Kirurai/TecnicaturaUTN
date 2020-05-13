/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1miño;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class Parcial1Miño {

    /**         REQUERIMIENTOS QUE DEBE MOSTRAR POR PANTALLA DE SALIDA DESDE EL METODO MAIN:
     * 
     * 
     *  -[Listo]Universidad en la que estudia el estudiante
     *  -[Listo]Necesidades Insatisfechas del estudiante
     *  -[Listo]Proyecto de grado que realiza el estudiante
     *  -[Listo]Resultados del proyecto de grado que realiza el estudiante
     *  -[Listo]Conocer los datos recolectados de los afectados y de los interesados
     *  -[Listo]Mencione 2 docentes asignados al estudiantes y muestre sus conocimientos
     * 
     * 
     */
    public static void main(String[] args) {
        /*Estudiante={  String nombre, 
                        int aspiranteAGrado, 
                        ProyectoDeGrado proyectoDeGrado, 
                        EjecucionDelProyecto ejecucionDelProyecto, 
                        Soluciones solucion, 
                        PersonalDocente docente)}
        */
        Resultados resultado = new Resultados("Está casi finalizada");
        EjecucionDelProyecto ejecucionDelProyecto = new EjecucionDelProyecto("Flexibilizacion de la cuarentena mediante drones", 100000, resultado);
        Soluciones solucion = new Soluciones("Sectorizar la ciudad");
        ProyectoDeGrado proyectoDeGrado = new ProyectoDeGrado("Provincial", 10000, "Mendoza", "Flexibilizar Cuarentena", 125, "Flexibilizacion de la cuarentena", 30, ejecucionDelProyecto, solucion);
        
        PersonalDocente docente1 = new PersonalDocente("Merlin", "Magia arcana", "300 puntos de experiencia", 300);
        PersonalDocente docente2 = new PersonalDocente("Elon Musk", "Robótica", "invaluable", 0);
        
        Estudiante alumno = new Estudiante("Maurizio", 3, proyectoDeGrado, ejecucionDelProyecto, solucion, docente1);
        alumno.getDocentes().add(docente2);
        
        
        
        Universidad uni = new Universidad();
        uni.setDiferentesCarreras("Universidad Tecnologica Nacional [UTN]");
        
        Region region = new Region();
        Necesidades necesidad = new Necesidades();
        region.getNecesidades().add(necesidad);
        uni.getRegiones().add(region);
        
        RecoleccionDeInformacion info = new RecoleccionDeInformacion("Mendocinos", "Pymes", "Se necesita tomar aire", "http://FormularioEnLinea.com", 0);
        uni.getRecoleccionDeInformaciones().add(info);
        alumno.getUniversidades().add(uni);
        
        
        alumno.getEjecucionDelProyecto().getResultado().setImplementacionFinalizada("Aprobado en un 90%");
        
        
        System.out.printf("El alumno %s tiene los siguientes datos:\n", alumno.getNombre());
        System.out.printf("Universidad en la que cursa: %s \n", alumno.getUniversidades().get(0).getDiferentesCarreras());
        System.out.printf("Docentes: \n -%s\n -%s\n", alumno.getDocentes().get(0).getNombre(), alumno.getDocentes().get(1).getNombre());
        System.out.printf("Resultado del Proyecto: %s\n", alumno.getEjecucionDelProyecto().getResultado().getImplementacionFinalizada());
        System.out.println("\n");
        System.out.printf("Necesidades insatisfechas: %s\n", alumno.getUniversidades().get(0).getRegiones().get(0).getNecesidades().get(0).insatisfaccion());
        System.out.printf("Proyecto de Grado: %s\n", alumno.getProyectoDeGrado().getPlanDeProyecto());
        System.out.printf("Afectados: %s\n", alumno.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getDatosDeLosAfectados());
        System.out.printf("Directamente involucrados: %s\n\n", alumno.getUniversidades().get(0).getRecoleccionDeInformaciones().get(0).getDatosDeLosDirectamenteInteresados());
        
    }
    
    
}
