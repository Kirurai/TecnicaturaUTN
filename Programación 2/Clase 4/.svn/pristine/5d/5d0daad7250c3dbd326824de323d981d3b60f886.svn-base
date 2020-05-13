/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kogan_andres;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CentroDistribucion {

   
    private ArrayList<Sucursal> sucursales = new ArrayList<>();
    
   

    public CentroDistribucion() {
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void setSucursales(Sucursal sucursales) {
        this.sucursales.add(sucursales);
    }

    public OrdenPedido revisar(ArrayList<Sucursal> sucursales) {
        for (int i = 0; i < sucursales.size(); i++) {
            for (int j = 0; j < sucursales.get(i).getProductos().size(); j++) {
                if (sucursales.get(i).getProductos().get(j).getCantidad() < 1) {
                    OrdenPedido orden = new OrdenPedido(i, j);
                    return orden;
                }
                if (sucursales.get(i).getProductos().get(j).getCantidad()>100){
                
                    OrdenPedido exedente = new OrdenPedido(i,j);
                    return exedente;
            }
                  
                  

                }
            }
        }

 