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
public class InterfazIngresoInformacion  {
        private String comentariosAbiertosEnLinea;
        private String formularioEnLinea;
        private int plataformaDeSoftware;
    public InterfazIngresoInformacion() {
    }
    public InterfazIngresoInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, int plataformaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formularioEnLinea = formularioEnLinea;
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }
    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormularioEnLinea() {
        return formularioEnLinea;
    }
    public void setFormularioEnLinea(String formularioEnLinea) {
        this.formularioEnLinea = formularioEnLinea;
    }

    public int getPlataformaDeSoftware() {
        return plataformaDeSoftware;
    }
    public void setPlataformaDeSoftware(byte plataformaDeSoftware) {
        this.plataformaDeSoftware = plataformaDeSoftware;
    }



    
    
    public String registroDeFormularioEnLinea(){
            return formularioEnLinea;
        }
}
