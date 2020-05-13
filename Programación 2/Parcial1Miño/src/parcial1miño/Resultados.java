/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1miño;

/**
 *
 * @author Maurizio <kd.maurii@gmail.com> aka Kirurai
 */
public class Resultados {
    private String implementacionFinalizada;

    public Resultados() {
    }
    public Resultados(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

    
    public String getImplementacionFinalizada() {
        return implementacionFinalizada;
    }

    public void setImplementacionFinalizada(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }
    
    
    
    public int efectosPositivosyNegativos(){
        return 0;
    }
    public int medidasDeSatisfaccionDeDiferentesAspectos(){
        return 3;
    }
}
