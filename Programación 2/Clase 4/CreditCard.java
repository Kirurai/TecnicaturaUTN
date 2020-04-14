package Programación 2.Clase 4;

public class CreditCard {
    private int numeroTarjeta;
    private int balance;

    public void CreditCard(int numeroTarjeta, int balance){
        setNumeroTarjeta(numeroTarjeta)
        setBalance(balance);
    }

    public int getNumeroTarjeta(){
        return this.numeroTarjeta;
    }
    public int getBalance(){
        return this.balance;
    }

    public void setNumeroTarjeta(int numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

}