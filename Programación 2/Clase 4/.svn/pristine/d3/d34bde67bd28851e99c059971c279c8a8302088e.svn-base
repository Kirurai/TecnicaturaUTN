/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchez_oro_david;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Sucursal {

    private String nombre;
    private ArrayList<Producto> stock = new ArrayList();
    private static ArrayList<Sucursal> sucursales = new ArrayList();
    private ArrayList<String> movimientos = new ArrayList();

    public Sucursal(String nombre) {
        this.nombre = nombre;
        pedirAProveedor();
        sucursales.add(this);
    }

    public Sucursal(String nombre, Producto producto) {
        this.nombre = nombre;
        stock.add(producto);
        sucursales.add(this);
    }

    public static ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getStock() {
        return stock;
    }

    public void addStockConComprovacion(Producto e) {
        if (stock.size() >= 100) {
            System.out.println("El stock de la sucursal está lleno por favor enviar el producto\na alguna de las siguientes:(Ingrese el numero de la deseada)");
            for (int i = 0; i < sucursales.size(); i++) {
                if (!sucursales.get(i).getNombre().equals(this.nombre)) {
                    System.out.println(i + "-  " + sucursales.get(i).getNombre());
                }
            }
            int aux = new Scanner(System.in).nextInt();
            sucursales.get(aux).addStockConComprovacion(e);
        } else {
            stock.add(e);
        }
    }

    public void enviar() {
        System.out.println("Ingrese el numero de la sucursal a la cual se realizara el envio.");
        for (int i = 0; i < sucursales.size(); i++) {
            if (!sucursales.get(i).getNombre().equals(this.nombre)) {
                System.out.println(i + "-  " + sucursales.get(i).getNombre());
            }
        }
        int aux = new Scanner(System.in).nextInt();
        System.out.println("Ingrese el numero correspondiente al priducto que desea enviar.");
        for (int i = 0; i < stock.size(); i++) {
            System.out.println(i + "-  " + stock.get(i).getDescripcion() + "  $" + stock.get(i).getPrecio());
        }
        int aux2 = new Scanner(System.in).nextInt();
        sucursales.get(aux).addStockConComprovacion(stock.get(aux2));
        stock.remove(aux2);
    }

    private void pedirASucursal() {
        System.out.println("Ingrese el numero de la sucursal a la cual se realizara el pedido.");
        for (int i = 0; i < sucursales.size(); i++) {
            if (!sucursales.get(i).getNombre().equals(this.nombre)) {
                System.out.println(i + "-  " + sucursales.get(i).getNombre());
            }
        }
        int aux = new Scanner(System.in).nextInt();
        System.out.println("Ingrese el numero correspondiente al priducto que desea encargar.");
        for (int i = 0; i < stock.size(); i++) {
            System.out.println(i + "-  " + sucursales.get(aux).getStock().get(i).getDescripcion() + "  $" + sucursales.get(aux).getStock().get(i).getPrecio());
        }
        int aux2 = new Scanner(System.in).nextInt();
        addStockConComprovacion(sucursales.get(aux).getStock().get(aux2));
    }

    public final void pedirAProveedor() {
        System.out.println("Que producto desea encargar?");
        String descripcion = new Scanner(System.in).nextLine();
        int aux1 = new Random(20000).nextInt();
        Producto p1 = new Producto(descripcion, aux1);
        System.out.println("Cuantos desea encargar?");
        aux1 = new Scanner(System.in).nextInt();
        Sucursal proveedor = new Sucursal("Proveedor", p1);
        if (stock.size() + aux1 > 100) {
            System.out.println("Solo podrá resivir " + (100 - stock.size()) + " unidades");
            for (int i = 0; i < 100 - stock.size(); i++) {
                stock.add(p1);
            }
            addMovimiento(proveedor, p1, 100 - stock.size());
        } else {
            for (int i = 0; i < aux1; i++) {
                stock.add(p1);
            }
            addMovimiento(proveedor, p1, aux1);
        }
        try {
            proveedor.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Sucursal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addMovimiento(Sucursal s1, Producto p1, int i) {
        movimientos.add(s1.getNombre() + "\t" + p1.getDescripcion() + "\t" + i);
    }

    public void mostrarMovimientos() {
        System.out.println("Origen\tProducto\tCantidad");
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println(movimientos.get(i));
        }
    }
}
