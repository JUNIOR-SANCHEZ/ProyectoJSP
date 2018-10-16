
package uml;

public class Bodega {
    private int codigo_bodega;
    private String nombre_producto_b;
    private String descripcion_producto;
    private int cantidad_producto_b;
    private double valor_unitario_b;

    public Bodega() {
    }

    public Bodega(int codigo_bodega, String nombre_producto_b, String descripcion_producto, int cantidad_producto_b, double valor_unitario_b) {
        this.codigo_bodega = codigo_bodega;
        this.nombre_producto_b = nombre_producto_b;
        this.descripcion_producto = descripcion_producto;
        this.cantidad_producto_b = cantidad_producto_b;
        this.valor_unitario_b = valor_unitario_b;
    }

    public int getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(int codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    public String getNombre_producto_b() {
        return nombre_producto_b;
    }

    public void setNombre_producto_b(String nombre_producto_b) {
        this.nombre_producto_b = nombre_producto_b;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getCantidad_producto_b() {
        return cantidad_producto_b;
    }

    public void setCantidad_producto_b(int cantidad_producto_b) {
        this.cantidad_producto_b = cantidad_producto_b;
    }

    public double getValor_unitario_b() {
        return valor_unitario_b;
    }

    public void setValor_unitario_b(double valor_unitario_b) {
        this.valor_unitario_b = valor_unitario_b;
    }
    
}
