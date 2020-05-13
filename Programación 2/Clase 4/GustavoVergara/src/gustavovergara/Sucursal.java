//@author Gustavo
package gustavovergara;

import java.util.ArrayList;

public class Sucursal {

    private ArrayList<Producto> mProductos = new ArrayList<>();
    private int stock; //no debe superar los 100, no debe ser menor a 1
    private long valorTotal;
    private Sucursal sucursalB;
    private ArrayList<OrdenDePedido> mOrdenes = new ArrayList<>();

    public ArrayList<Producto> getmProductos() {
        return mProductos;
    }

    public void setmProductos(ArrayList<Producto> mProductos) {
        this.mProductos = mProductos;
    }

    public void agregarProducto(Producto producto) {
        this.mProductos.add(producto);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Sucursal getSucursal() {
        return sucursalB;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursalB = sucursal;
    }

    public ArrayList<OrdenDePedido> getmOrdenes() {
        return mOrdenes;
    }

    public void setmOrdenes(ArrayList<OrdenDePedido> mOrdenes) {
        this.mOrdenes = mOrdenes;
    }

    public void hacerOrden() {
        OrdenDePedido ord = new OrdenDePedido();
        sucursalB.recibirOrden(ord);

    }

    public void recibirOrden(OrdenDePedido ord) {

        if (mProductos.indexOf(ord.producto) != -1) { //Tiene stock
            sucursalB.recibirProducto(ord.producto);
            mOrdenes.remove(ord);
        }
    }

    public void recibirProducto(Producto p) {
        agregarProducto(p);
        setStock(getStock() + 1);
    }

    public void listarProductos() {
        System.out.printf("item\tDescripcion\t\tPrecio\n");
        for (int i = 0; i < mProductos.size(); i++) {
            System.out.printf("%s\t%s\t\t%6.2f \n",
                    i,
                    mProductos.get(i).nombre,
                    mProductos.get(i).precio);
        }
    }

}
