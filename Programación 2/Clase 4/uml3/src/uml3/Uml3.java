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
public class Uml3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recibo r1 = new Recibo ('B', 1, 32, 13, 1350, 2.50F, "Pidio Oreo y Nutella", 103, "Otoc");
        
        System.out.printf("RECIBO  N°%d\n", r1.getNumero());
        System.out.printf("Recibí de, %s  por un valor de $%d\n", r1.getProveedor().getRazonSocial(), r1.getTotal());
        System.out.printf("Por concepto de %s\n",r1.getDetalle());
        System.out.printf("El día: %d/%d/%d\n",r1.getFecha().getDia(), r1.getFecha().getMes(), r1.getFecha().getAnio());
        
    }
    
}
