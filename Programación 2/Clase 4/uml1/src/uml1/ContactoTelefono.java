/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml1;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class ContactoTelefono {
    private int idContactoTelefono;
    private String codigo;
    private String numero;
    
    public ContactoTelefono(int idContactoTelefono, String codigo, String numero){
        setIdContactoTelefono(idContactoTelefono);
        setCodigo(codigo);
        setNumero(numero);
    }
    
    public int getIdContactoTelefono(){
        return this.idContactoTelefono;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getNumero(){
        return this.numero;
    }
    
    public void setIdContactoTelefono(int idContactoTelefono){
        this.idContactoTelefono = idContactoTelefono;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
}
