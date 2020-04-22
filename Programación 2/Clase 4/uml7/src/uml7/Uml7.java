/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml7;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class Uml7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Detective
        String numeroPlaca = "AB01";
        String nombreDet = "Jhon";
        String apellidoDet = "Smith";
        Foto fotoDet = new Foto("C:\\Fotos\\Detective.png", "Jhon Smith", 0.3f);
        MedioDeComunicacion comunicacion1 = new MedioDeComunicacion("Sirve para hacer llamadas y sacar fotos de sospechosos", "celular");
        ArrayList<MedioDeComunicacion> comunicacionesDet = new ArrayList<>();
        comunicacionesDet.add(comunicacion1);
        Perfil perfil1 = new Perfil (1, "Meticuloso");
        ArrayList<Perfil> perfilesDet = new ArrayList<>();
        perfilesDet.add(perfil1);
        
        Detective det = new Detective(numeroPlaca, nombreDet, apellidoDet, fotoDet, comunicacionesDet, perfilesDet);
        
        //Mafioso
        Lugar lugar = new Lugar("Parque de las pizzas", "Pizza", "123");
        ArrayList<Lugar> lugaresFrecuentes = new ArrayList();
        lugaresFrecuentes.add(lugar);
        String nombreMaf = "Alan";
        String apellidoMaf = "Smith";
        Foto fotoMaf = new Foto("C:\\Fotos\\Mafioso.png", "Alan Smith", 0.5f);
        MedioDeComunicacion comunicacion2 = new MedioDeComunicacion("Sirve para hacer llamadas y poder establecer lugar de reunion", "celular");
        ArrayList<MedioDeComunicacion> comunicacionesMaf = new ArrayList<>();
        comunicacionesMaf.add(comunicacion2);
        Perfil perfil2 = new Perfil (2, "Sin Escrupulos");
        ArrayList<Perfil> perfilesMaf = new ArrayList<>();
        perfilesMaf.add(perfil2);
        
        Mafioso maf = new Mafioso(lugaresFrecuentes, nombreMaf, apellidoMaf, fotoMaf, comunicacionesMaf, perfilesMaf);
        
        //Datos del detective
        System.out.printf("Detective %s\n", det.getApellido());
        System.out.printf("Placa N° %s\n", det.getNumeroPlaca());
        System.out.printf("\n");
        System.out.printf("Mafioso: %s &s\n", maf.getNombre(), maf.getApellido());
        det.getInvestigacion().add(maf);
        
        //Investigar
        det.investigarMafioso(maf);
        
        System.out.printf("Lugares que concurre: %s - %s %s\n", maf.getLugaresFrecuentes().get(0).getNombre(), maf.getLugaresFrecuentes().get(0).getDireccion().getCalle(), maf.getLugaresFrecuentes().get(0).getDireccion().getNumero());
        System.out.printf("Medio de comunicación: %s - %s\n",maf.getComunicaciones().get(0).getTipoMedio().getTipoMedio(), maf.getComunicaciones().get(0).getDescripcion());
        
    }
}
