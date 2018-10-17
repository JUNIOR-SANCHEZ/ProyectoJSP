package modelado;

import java.util.*;
import java.sql.*;
import uml.Empleado;

public class DAOEmpleado implements Operaciones {

    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
        Empleado em = (Empleado) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "INSERT INTO empleados VALUES (NULL,?,?,?,?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setString(0, em.getN_identificacion_empleados());
            pst.setString(1, em.getNombres_empleados());
            pst.setString(2, em.getApellidos_empleados());
            pst.setInt(3, em.getEdad_empleados());
            pst.setString(4, em.getCargo_empleados());
            pst.setString(5, em.getCorreo_empleados());
            pst.setInt(6, em.getCodigo_almacen());
            int fila = pst.executeUpdate();
            respuesta = "Se registro " + fila + " fila";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(int id) {
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM empleados WHERE CODIGO_EMPLEADOS = ?";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setInt(0, id);
            int fila = pst.executeUpdate();
            respuesta = "Se elimino " + fila + " fila";
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Empleado em = new Empleado();
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE EMPLEADOS SET N_IDENTIFICACION_EMPLEADOS = ?, NOMBRES_EMPLEADOS = ?, APELLIDOS_EMPLEADOS = ?, EDAD_EMPLEADOS =?, CARGO_EMPLEADOS = ?, CORREO_EMPLEADOS = ?, CODIGO_ALMACEN = ? WHERE CODIGO_EMPLEADOS = ?;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setString(0, em.getN_identificacion_empleados());
            pst.setString(1, em.getNombres_empleados());
            pst.setString(2, em.getApellidos_empleados());
            pst.setInt(3, em.getEdad_empleados());
            pst.setString(4, em.getCargo_empleados());
            pst.setString(5, em.getCorreo_empleados());
            pst.setInt(6, em.getCodigo_almacen());
            pst.setInt(7, em.getCodigo_empleados());
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<?> consultar() {
        List<Empleado> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM EMPLEADOS;";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                x.add(new Empleado(rs.getInt("CODIGO_EMPLEADOS"), rs.getString("N_IDENTIFICACION_EMPLEADOS"), rs.getString("NOMBRES_EMPLEADOS"), rs.getString("APELLIDOS_EMPLEADOS"), rs.getInt("EDAD_EMPLEADOS"), rs.getString("CARGO_EMPLEADOS"), rs.getString("CORREO_EMPLEADOS"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (Exception e) {
        }

        return x;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        List<Empleado> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM EMPLEADOS " + criterio + ";";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                x.add(new Empleado(rs.getInt("CODIGO_EMPLEADOS"), rs.getString("N_IDENTIFICACION_EMPLEADOS"), rs.getString("NOMBRES_EMPLEADOS"), rs.getString("APELLIDOS_EMPLEADOS"), rs.getInt("EDAD_EMPLEADOS"), rs.getString("CARGO_EMPLEADOS"), rs.getString("CORREO_EMPLEADOS"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (Exception e) {
        }

        return x;
    }

}
