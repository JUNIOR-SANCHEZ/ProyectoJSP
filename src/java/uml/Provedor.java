package uml;

public class Provedor {

    private int codigo_provedor;
    private String n_identificacion_provedor;
    private String nombres_provedor;
    private String apellidos_provedor;
    private String celular_provedor;
    private String empresa_provedor;
    private String telefono_empresa_provedor;
    private String direccion_empresa_provedor;
    private String correo_provedor;
    private int codigo_almacen;

    public Provedor() {
    }

    public Provedor(int codigo_provedor, String n_identificacion_provedor, String nombres_provedor, String apellidos_provedor, String celular_provedor, String empresa_provedor, String telefono_empresa_provedor, String direccion_empresa_provedor, String correo_provedor, int codigo_almacen) {
        this.codigo_provedor = codigo_provedor;
        this.n_identificacion_provedor = n_identificacion_provedor;
        this.nombres_provedor = nombres_provedor;
        this.apellidos_provedor = apellidos_provedor;
        this.celular_provedor = celular_provedor;
        this.empresa_provedor = empresa_provedor;
        this.telefono_empresa_provedor = telefono_empresa_provedor;
        this.direccion_empresa_provedor = direccion_empresa_provedor;
        this.correo_provedor = correo_provedor;
        this.codigo_almacen = codigo_almacen;
    }

    public int getCodigo_provedor() {
        return codigo_provedor;
    }

    public void setCodigo_provedor(int codigo_provedor) {
        this.codigo_provedor = codigo_provedor;
    }

    public String getN_identificacion_provedor() {
        return n_identificacion_provedor;
    }

    public void setN_identificacion_provedor(String n_identificacion_provedor) {
        this.n_identificacion_provedor = n_identificacion_provedor;
    }

    public String getNombres_provedor() {
        return nombres_provedor;
    }

    public void setNombres_provedor(String nombres_provedor) {
        this.nombres_provedor = nombres_provedor;
    }

    public String getApellidos_provedor() {
        return apellidos_provedor;
    }

    public void setApellidos_provedor(String apellidos_provedor) {
        this.apellidos_provedor = apellidos_provedor;
    }

    public String getCelular_provedor() {
        return celular_provedor;
    }

    public void setCelular_provedor(String celular_provedor) {
        this.celular_provedor = celular_provedor;
    }

    public String getEmpresa_provedor() {
        return empresa_provedor;
    }

    public void setEmpresa_provedor(String empresa_provedor) {
        this.empresa_provedor = empresa_provedor;
    }

    public String getTelefono_empresa_provedor() {
        return telefono_empresa_provedor;
    }

    public void setTelefono_empresa_provedor(String telefono_empresa_provedor) {
        this.telefono_empresa_provedor = telefono_empresa_provedor;
    }

    public String getDireccion_empresa_provedor() {
        return direccion_empresa_provedor;
    }

    public void setDireccion_empresa_provedor(String direccion_empresa_provedor) {
        this.direccion_empresa_provedor = direccion_empresa_provedor;
    }

    public String getCorreo_provedor() {
        return correo_provedor;
    }

    public void setCorreo_provedor(String correo_provedor) {
        this.correo_provedor = correo_provedor;
    }

    public int getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(int codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }


}
