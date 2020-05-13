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
public class Necesidades {
    private String definir;
    private ArrayList<InterfazIngresoInformacion> interfazIngresoInformaciones = new ArrayList<>();

    public Necesidades() {
    }
    public Necesidades(String definir, InterfazIngresoInformacion iii) {
        this.definir = definir;
        this.interfazIngresoInformaciones.add(iii);
    }

    public String getDefinir() {
        return definir;
    }
    public void setDefinir(String definir) {
        this.definir = definir;
    }

    public ArrayList<InterfazIngresoInformacion> getInterfazIngresoInformaciones() {
        return interfazIngresoInformaciones;
    }
    public void setInterfazIngresoInformaciones(ArrayList<InterfazIngresoInformacion> interfazIngresoInformaciones) {
        this.interfazIngresoInformaciones = interfazIngresoInformaciones;
    }
    
    
    
    public String insatisfaccion(){
        return "Causada por la cuarentena";
    }
}
