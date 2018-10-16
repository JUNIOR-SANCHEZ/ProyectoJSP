package uml;
public class Empleado {
  private int codigo_empleados;
  private String n_identificacion_empleados;
  private String nombres_empleados;
  private String apellidos_empleados;
  private int edad_empleados;
  private String cargo_empleados;
  private String correo_empleados;
    public Empleado() {
    }
    public Empleado(int codigo_empleados, String n_identificacion_empleados, String nombres_empleados, String apellidos_empleados, int edad_empleados, String cargo_empleados, String correo_empleados) {
        this.codigo_empleados = codigo_empleados;
        this.n_identificacion_empleados = n_identificacion_empleados;
        this.nombres_empleados = nombres_empleados;
        this.apellidos_empleados = apellidos_empleados;
        this.edad_empleados = edad_empleados;
        this.cargo_empleados = cargo_empleados;
        this.correo_empleados = correo_empleados;
    }

    public String getCorreo_empleados() {
        return correo_empleados;
    }

    public void setCorreo_empleados(String correo_empleados) {
        this.correo_empleados = correo_empleados;
    }

    public int getCodigo_empleados() {
        return codigo_empleados;
    }

    public void setCodigo_empleados(int codigo_empleados) {
        this.codigo_empleados = codigo_empleados;
    }

    public String getN_identificacion_empleados() {
        return n_identificacion_empleados;
    }

    public void setN_identificacion_empleados(String n_identificacion_empleados) {
        this.n_identificacion_empleados = n_identificacion_empleados;
    }

    public String getNombres_empleados() {
        return nombres_empleados;
    }

    public void setNombres_empleados(String nombres_empleados) {
        this.nombres_empleados = nombres_empleados;
    }

    public String getApellidos_empleados() {
        return apellidos_empleados;
    }

    public void setApellidos_empleados(String apellidos_empleados) {
        this.apellidos_empleados = apellidos_empleados;
    }

    public int getEdad_empleados() {
        return edad_empleados;
    }

    public void setEdad_empleados(int edad_empleados) {
        this.edad_empleados = edad_empleados;
    }

    public String getCargo_empleados() {
        return cargo_empleados;
    }

    public void setCargo_empleados(String cargo_empleados) {
        this.cargo_empleados = cargo_empleados;
    }
  
  
 
}
