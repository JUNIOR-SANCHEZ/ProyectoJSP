package uml;

public class productos_salida {
    private int codigo_salida;
    private String nombre_producto_s;
    private String descripcion_prpducto_s;
    private int cantidad_producto_s;
    private double valor_unitario_s;
    private int codigo_bodega;

    public productos_salida() {
    }

    public productos_salida(int codigo_salida, String nombre_producto_s, String descripcion_prpducto_s, int cantidad_producto_s, double valor_unitario_s, int codigo_bodega) {
        this.codigo_salida = codigo_salida;
        this.nombre_producto_s = nombre_producto_s;
        this.descripcion_prpducto_s = descripcion_prpducto_s;
        this.cantidad_producto_s = cantidad_producto_s;
        this.valor_unitario_s = valor_unitario_s;
        this.codigo_bodega = codigo_bodega;
    }

    public int getCodigo_salida() {
        return codigo_salida;
    }

    public void setCodigo_salida(int codigo_salida) {
        this.codigo_salida = codigo_salida;
    }

    public String getNombre_producto_s() {
        return nombre_producto_s;
    }

    public void setNombre_producto_s(String nombre_producto_s) {
        this.nombre_producto_s = nombre_producto_s;
    }

    public String getDescripcion_prpducto_s() {
        return descripcion_prpducto_s;
    }

    public void setDescripcion_prpducto_s(String descripcion_prpducto_s) {
        this.descripcion_prpducto_s = descripcion_prpducto_s;
    }

    public int getCantidad_producto_s() {
        return cantidad_producto_s;
    }

    public void setCantidad_producto_s(int cantidad_producto_s) {
        this.cantidad_producto_s = cantidad_producto_s;
    }

    public double getValor_unitario_s() {
        return valor_unitario_s;
    }

    public void setValor_unitario_s(double valor_unitario_s) {
        this.valor_unitario_s = valor_unitario_s;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }
    
}
