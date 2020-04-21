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
public class Recibo extends Comprobante{
    private Proveedor proveedor;
    private float total;
    private String detalle;
    
    public Recibo() {
        this.proveedor = new Proveedor();
    }
    public Recibo(char tipo, int numero, int dia, int mes, int anio, float total, String detalle, int codigo, String razonSocial) {
        super(tipo, numero, dia, mes, anio);
        this.proveedor = new Proveedor(codigo, razonSocial);
        this.total = total;
        this.detalle = detalle;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    public float getTotal() {
        return total;
    }
    public String getDetalle() {
        return detalle;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    
}
