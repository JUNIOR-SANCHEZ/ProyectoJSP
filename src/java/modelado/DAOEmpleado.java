package modelado;

import java.util.*;
import java.sql.*;
import uml.Empleado;
public class DAOEmpleado implements Operaciones{

    @Override
    public String insertar(Object obj) {
        Empleado e = (Empleado) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "";
        String respuesta = "";
        return "";
        
    }

    @Override
    public String eliminar(Object obj) {
        return "";
    }

    @Override
    public String modificar(Object obj) {
        return "";
    }

    @Override
    public List<?> consultar() {
        List<Empleado> x = new ArrayList<>();
        return x;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        List<Empleado> x = new ArrayList<>();
        return x;
    }
    
}
