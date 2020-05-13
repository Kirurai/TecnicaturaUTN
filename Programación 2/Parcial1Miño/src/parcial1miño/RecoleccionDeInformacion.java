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
public class RecoleccionDeInformacion extends InterfazIngresoInformacion {
    private String datosDeLosAfectados;
    private String datosDeLosDirectamenteInteresados;

    public RecoleccionDeInformacion() {
    }
    public RecoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosDirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, int plataformaDeSoftware) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosDirectamenteInteresados = datosDeLosDirectamenteInteresados;
    }

    public String getDatosDeLosAfectados() {
        return datosDeLosAfectados;
    }

    public void setDatosDeLosAfectados(String datosDeLosAfectados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
    }

    public String getDatosDeLosDirectamenteInteresados() {
        return datosDeLosDirectamenteInteresados;
    }

    public void setDatosDeLosDirectamenteInteresados(String datosDeLosDirectamenteInteresados) {
        this.datosDeLosDirectamenteInteresados = datosDeLosDirectamenteInteresados;
    }
    
    
    
    
    
    public String conocer(){
        return "Las partes involucradas son " + datosDeLosAfectados + " y " + datosDeLosDirectamenteInteresados;
    }
}
