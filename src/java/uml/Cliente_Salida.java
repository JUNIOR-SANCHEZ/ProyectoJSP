package uml;

public class Cliente_Salida {
    private String n_identificacion_cliente;
    private int codigo_salida;
    private int codigo_bodega;
    private int codigo_almacen;

    public Cliente_Salida() {
    }

    public Cliente_Salida(String n_identificacion_cliente, int codigo_salida, int codigo_bodega, int codigo_almacen) {
        this.n_identificacion_cliente = n_identificacion_cliente;
        this.codigo_salida = codigo_salida;
        this.codigo_bodega = codigo_bodega;
        this.codigo_almacen = codigo_almacen;
    }

    public String getN_identificacion_cliente() {
        return n_identificacion_cliente;
    }

    public void setN_identificacion_cliente(String n_identificacion_cliente) {
        this.n_identificacion_cliente = n_identificacion_cliente;
    }

    public int getCodigo_salida() {
        return codigo_salida;
    }

    public void setCodigo_salida(int codigo_salida) {
        this.codigo_salida = codigo_salida;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    public int getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(int codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }
    
}
