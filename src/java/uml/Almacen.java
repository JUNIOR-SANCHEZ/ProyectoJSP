package uml;

public class Almacen {
    
    private int codigo_almacen;
    private String nombre_almacen;
    private String telefono_almacen;
    private String correo_almacen;
    private String direccion_almacen;

    public Almacen() {
    }

    public Almacen(int codigo_almacen, String nombre_almacen, String telefono_almacen, String correo_almacen, String direccion_almacen) {
        this.codigo_almacen = codigo_almacen;
        this.nombre_almacen = nombre_almacen;
        this.telefono_almacen = telefono_almacen;
        this.correo_almacen = correo_almacen;
        this.direccion_almacen = direccion_almacen;
    }

    public String getDireccion_almacen() {
        return direccion_almacen;
    }

    public void setDireccion_almacen(String direccion_almacen) {
        this.direccion_almacen = direccion_almacen;
    }

    public int getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(int codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }

    public String getNombre_almacen() {
        return nombre_almacen;
    }

    public void setNombre_almacen(String nombre_almacen) {
        this.nombre_almacen = nombre_almacen;
    }

    public String getTelefono_almacen() {
        return telefono_almacen;
    }

    public void setTelefono_almacen(String telefono_almacen) {
        this.telefono_almacen = telefono_almacen;
    }

    public String getCorreo_almacen() {
        return correo_almacen;
    }

    public void setCorreo_almacen(String correo_almacen) {
        this.correo_almacen = correo_almacen;
    }
    
    
}
