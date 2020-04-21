/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml6;
import java.util.ArrayList;
/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Cliente extends Persona implements EstadoCuenta {
    public ArrayList <TarjetaCredito> creditCard;
    
    public Cliente(){
        
    }
    public Cliente(int dni, String nombre, String apellido, long cuit){
        super(dni, nombre, apellido, cuit);
    }
    
    public ArrayList<TarjetaCredito> getCreditCard(){
        return this.creditCard;
    }
    public void setCreditCard(ArrayList<TarjetaCredito> creditCards){
        this.creditCard = creditCards;
    }
    
    //Overrides
    public boolean problemaVerazCodeme(){
        return true;
    }
    public long getCuit(){
        return this.cuit;
    }
    public void setCuit(long cuit){
        this.cuit = cuit;
    }
    //Fin Overrides
    
    
    
    
}
