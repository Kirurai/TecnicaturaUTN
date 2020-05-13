package gonzalez_lucas;

public class OrdenDePedido {

    private static int codigo=0;
    
    private String tipoFactura;

    public OrdenDePedido(String tipoFactura) {
        this.tipoFactura = tipoFactura;
        codigo++;
    }

    public static int getCodigo() {
        return codigo;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String val) {
        this.tipoFactura = val;
    }
}
