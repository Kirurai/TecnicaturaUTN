/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.ArrayList;

/**
 *
 * @author Miño Maurizio Nahuel <kd.maurii@gmail.com> A.K.A "Kirurai"
 */
public class CentroDistribución {
    private ArrayList<Sucursal> sucursales = new ArrayList();

    public CentroDistribución() {
    }
    
    public CentroDistribución(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }
    public CentroDistribución(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;        
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    
    
    
    public boolean revisar(Producto producto){
        for(int i = 0; i < this.getSucursales().size(); i++){
            if( this.getSucursales().get(i).getProd().contains(producto)){
                if(!this.getSucursales().get(i).limite1Producto()){ //Si contiene el producto. No debe ser el último
                    return true;
                }
            }
        }
        System.out.printf("Ninguna sucursal tiene %s o no pueden entregarlo", producto.getNombre());
        return false;
    }
    

}
