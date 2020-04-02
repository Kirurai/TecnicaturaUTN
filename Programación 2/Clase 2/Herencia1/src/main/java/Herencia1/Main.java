/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1;
import java.lang.Math;

/**
 *
 * @author Miño Maurizio <kd.maurii@gmail.com>
 */

public class Main {
    public static void main(String[] args) {

        final Evocador mago1 = new Evocador("Carla", 3, 14, 18, "eléctrico");
        final Invocador mago2 = new Invocador("Roberto", 3, 16, 14, "ángeles");


        mago1.presentacion();
        mago2.presentacion();
        combate(mago1, mago2);


    }

    public static void combate(final Evocador mago1, final Invocador mago2) {
        System.out.println("");
        int ganador = (int) Math.floor(Math.random()*50);
        if (ganador%2 == 0){
            iniciativa(mago1);
        }else{
            iniciativa(mago2);
        }
    }

/*
    private static void iniciativa(final Mago mago){
        System.out.printf("%s Ha mirado feo a su enemigo! y murmura más rápido el hechizo!", mago.getNombre());
        //mago.lanzarHabilidad();
        System.out.printf("%s se siente satisfecho con el resultado", mago.getNombre());
    }
    */
    private static void iniciativa(final Evocador mago){
        System.out.printf("%s ha mirado feo a su enemigo! y murmura más rápido el hechizo!\n", mago.getNombre());
        mago.lanzarHabilidad();
        System.out.printf("%s se siente satisfecha con el resultado\n", mago.getNombre());
    }
    private static void iniciativa(final Invocador mago){
        System.out.printf("%s ha mirado feo a su enemigo! y murmura más rápido el hechizo!\n", mago.getNombre());
        mago.lanzarHabilidad();
        System.out.printf("%s se siente satisfecho con el resultado\n", mago.getNombre());
    }

}