/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class MedioDeComunicacion {
    private String descripcion;
    private TipoMedio tipoMedio;

    public MedioDeComunicacion(){
        
    }
    public MedioDeComunicacion(String descripcion, String tipoMedio) {
        this.descripcion = descripcion;
        this.tipoMedio = new TipoMedio(tipoMedio);
    }

    public String getDescripcion() {
        return descripcion;
    }
    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }
    
    
    
}
