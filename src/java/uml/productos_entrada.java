package uml;

public class productos_entrada {
    private int codigo_entada;
    private String nombre_producto_e;
    private String descripcion_producto_e;
    private int catidad_producto_e;
    private double valor_unitario_e;
    private double valor_total_e;
    private int codigo_bodega;

    public productos_entrada() {
    }

    public productos_entrada(int codigo_entada, String nombre_producto_e, String descripcion_producto_e, int catidad_producto_e, double valor_unitario_e, double valor_total_e, int codigo_bodega) {
        this.codigo_entada = codigo_entada;
        this.nombre_producto_e = nombre_producto_e;
        this.descripcion_producto_e = descripcion_producto_e;
        this.catidad_producto_e = catidad_producto_e;
        this.valor_unitario_e = valor_unitario_e;
        this.valor_total_e = valor_total_e;
        this.codigo_bodega = codigo_bodega;
    }

    public int getCodigo_entada() {
        return codigo_entada;
    }

    public void setCodigo_entada(int codigo_entada) {
        this.codigo_entada = codigo_entada;
    }

    public String getNombre_producto_e() {
        return nombre_producto_e;
    }

    public void setNombre_producto_e(String nombre_producto_e) {
        this.nombre_producto_e = nombre_producto_e;
    }

    public String getDescripcion_producto_e() {
        return descripcion_producto_e;
    }

    public void setDescripcion_producto_e(String descripcion_producto_e) {
        this.descripcion_producto_e = descripcion_producto_e;
    }

    public int getCatidad_producto_e() {
        return catidad_producto_e;
    }

    public void setCatidad_producto_e(int catidad_producto_e) {
        this.catidad_producto_e = catidad_producto_e;
    }

    public double getValor_unitario_e() {
        return valor_unitario_e;
    }

    public void setValor_unitario_e(double valor_unitario_e) {
        this.valor_unitario_e = valor_unitario_e;
    }

    public double getValor_total_e() {
        return valor_total_e;
    }

    public void setValor_total_e(double valor_total_e) {
        this.valor_total_e = valor_total_e;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }
    
}
