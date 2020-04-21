/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;
import java.util.ArrayList;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Mafioso extends Persona implements Investigable{
    private ArrayList<Lugar> lugaresFrecuentes;

    public Mafioso() {
        
    }

    public Mafioso(ArrayList<Lugar> lugaresFrecuentes, String nombre, String apellido, Foto foto, ArrayList<MedioDeComunicacion> comunicaciones, ArrayList<Perfil> perfiles) {
        super(nombre, apellido, foto, comunicaciones, perfiles);
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    public ArrayList<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(ArrayList<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }
    @Override
    public boolean investigar(){
        return true;
    }
    
    public void agregarLugar(Lugar lugar){
        if (!(this.lugaresFrecuentes.contains(lugar))){
            this.lugaresFrecuentes.add(lugar);
        }
    }
    public boolean quitarLugar(Lugar lugar){
        if (this.lugaresFrecuentes.contains(lugar)) {
            this.lugaresFrecuentes.remove(this.lugaresFrecuentes.indexOf(lugar));
            return true;
        } else {
            return false;
        }
    }
}
