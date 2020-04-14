package Programación 2.Clase 4;

public class Cliente {
    private int id;
    private Persona persona;
    //private String name;
    //private String lastName;
    private CreditCard tarjetaCredito;

    public void Cliente(int id, Persona persona){
        setId(id);
        setPersona(persona);
    }

    public int getId(){
        return this.id;
    }
    public Cliente getCliente(){
        this.cliente;
    }
    /*public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.getLastName;
    }*/
    public CreditCard getTarjetaCredito(){
        return this.tajetaCredito;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setPersona(Persona persona){
        this.persona = persona;
    }
    /*public void setName(string name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }*/
    public void setTarjetaCredito(CreditCard datosTarjeta){
        this.tarjetaCredito = datosTarjeta;
    }
    
}