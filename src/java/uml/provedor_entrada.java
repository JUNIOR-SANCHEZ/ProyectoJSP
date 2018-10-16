package uml;

public class provedor_entrada {
    private int codigo_provedor;
    private int codigo_entrada;
    private int codigo_bodega;
    private int codigo_almacen;

    public provedor_entrada() {
    }

    public provedor_entrada(int codigo_provedor, int codigo_entrada, int codigo_bodega, int codigo_almacen) {
        this.codigo_provedor = codigo_provedor;
        this.codigo_entrada = codigo_entrada;
        this.codigo_bodega = codigo_bodega;
        this.codigo_almacen = codigo_almacen;
    }

    public int getCodigo_provedor() {
        return codigo_provedor;
    }

    public void setCodigo_provedor(int codigo_provedor) {
        this.codigo_provedor = codigo_provedor;
    }

    public int getCodigo_entrada() {
        return codigo_entrada;
    }

    public void setCodigo_entrada(int codigo_entrada) {
        this.codigo_entrada = codigo_entrada;
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
