/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml2;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Cliente {
    private int codigo;
    private String razonSocial;
    
    public Cliente(){
        
    }
    public Cliente(int codigo, String razonSocial){
        this.codigo = codigo;
        this.razonSocial = razonSocial;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

}
