/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml3;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Comprobante {
    private char tipo;
    private int numero;
    private Fecha fecha;
    
    public Comprobante(){
        this.fecha = new Fecha();
    }
    public Comprobante(char tipo, int numero, int dia, int mes, int anio){
        this.tipo = tipo;
        this.numero = numero;
        this.fecha = new Fecha(dia, mes, anio);
    }

    public char getTipo() {
        return tipo;
    }
    public int getNumero() {
        return numero;
    }
    public Fecha getFecha() {
        return fecha;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
    

