package Programación 2.Clase 4;

/**
 * La agregación se podría definir como el momento en que dos objetos se unen para 
 * trabajar juntos y así, alcanzar una meta.
 * 
 * Para validar la asociación, la frase “Usa un”, debe tener sentido
 * 
 * 
 * En caso contrario, la composición es un tipo de relación dependiente en dónde un objeto más complejo
 *  es conformado por objetos más pequeños. En esta situación, la frase “Tiene un”, debe tener sentido
 */

public class main {
    Persona yo = new Persona("Maurizio", "Miño", 41769024);
    CreditCard miTarjeta = new CreditCard(00001111222233334444, 0);
    
    Cliente cliente = new Cliente(007, yo);

    cliente.setTarjeta(miTarjeta);
    
}