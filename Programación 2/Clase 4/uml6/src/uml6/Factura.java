/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml6;

import java.util.Date;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Factura {
    private Empleado emp;
    private Cliente clie;
    private int nroFactura;
    private Date fecha;
    private double monto;

    public Factura() {
        this.emp = new Empleado();
        this.clie = new Cliente();
        this.nroFactura = 0;
        this.fecha = new Date();
        this.monto = 0;
    }

    public Factura(int dniEmp, String nombreEmp, String apellidoEmp, long cuitEmp, Date fechaIngresoEmp, int nroLegajoEmp, int dniClie, String nombreClie, String apellidoClie, long cuitClie, int nroFactura, Date fecha, double monto) {
        this.emp = new Empleado (dniEmp, nombreEmp, apellidoEmp, cuitEmp, fechaIngresoEmp, nroLegajoEmp) ;
        this.clie = new Cliente (dniClie, nombreClie, apellidoClie, cuitClie);
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Empleado getEmp() {
        return emp;
    }
    public Cliente getClie() {
        return clie;
    }
    public int getNroFactura() {
        return nroFactura;
    }
    public Date getFecha() {
        return fecha;
    }
    public double getMonto() {
        return monto;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    public void setClie(Cliente clie) {
        this.clie = clie;
    }
    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
