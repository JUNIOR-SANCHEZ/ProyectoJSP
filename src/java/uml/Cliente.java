package uml;
public class Cliente {
    private String n_identificacion_cliente;
    private String nombres_cliente;
    private String apellidos_cliente;
    private String telefono_cliente;
    private String correo_cliente;
    private int codigo_almacen;

    public Cliente() {
    }

    public Cliente(String n_identificacion_cliente, String nombres_cliente, String apellidos_cliente, String telefono_cliente, String correo_cliente, int codigo_almacen) {
        this.n_identificacion_cliente = n_identificacion_cliente;
        this.nombres_cliente = nombres_cliente;
        this.apellidos_cliente = apellidos_cliente;
        this.telefono_cliente = telefono_cliente;
        this.correo_cliente = correo_cliente;
        this.codigo_almacen = codigo_almacen;
    }

    public String getN_identificacion_cliente() {
        return n_identificacion_cliente;
    }

    public void setN_identificacion_cliente(String n_identificacion_cliente) {
        this.n_identificacion_cliente = n_identificacion_cliente;
    }

    public String getNombres_cliente() {
        return nombres_cliente;
    }

    public void setNombres_cliente(String nombres_cliente) {
        this.nombres_cliente = nombres_cliente;
    }

    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public int getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(int codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }
    
}
