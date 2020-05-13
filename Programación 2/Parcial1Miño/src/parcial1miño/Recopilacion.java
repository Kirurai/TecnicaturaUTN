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
public class Recopilacion extends RecoleccionDeInformacion{
    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;

    public Recopilacion() {
    }

    public Recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosDirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware) {
        super(datosDeLosAfectados, datosDeLosDirectamenteInteresados, comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }
    
    
    
    public String filtrar(){
        return "Los filtrados son los favorables: " + datosMayorFavorabilidad;
    }
    public String priorizar(){
        return "Se Prioriza a los de más urgencia como " + datosMayorUrgencia;
    }
}
