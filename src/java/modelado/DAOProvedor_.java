package modelado;
import java.util.*;
import java.sql.*;
import uml.Provedor;
public class DAOProvedor_ implements Operaciones{
 DataBase db = new DataBase();
    @Override
    public String insertar(Object obj) {
       Provedor p = (Provedor) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "INSERT INTO provedor_ VALUES (?,?,?,?,?,?,?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, p.getCodigo_provedor());
            pst.setString(2, p.getN_identificacion_provedor());
            pst.setString(3, p.getNombres_provedor());
            pst.setString(4, p.getApellidos_provedor());
            pst.setString(5, p.getCelular_provedor());
            pst.setString(6, p.getEmpresa_provedor());
            pst.setString(7, p.getTelefono_empresa_provedor());
            pst.setString(8, p.getDireccion_empresa_provedor());
            pst.setString(9, p.getCorreo_provedor());
            pst.setInt(10, p.getCodigo_almacen());
            int filas = pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(int id) {
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM provedor_ WHERE CODIGO_PROVEDOR = ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(0, id);
            int filas = pst.executeUpdate();
            respuesta = "Se Elimino " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Provedor p = (Provedor) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE ALMACEN SET N_IDENTIFICACION_PROVEDOR = ?, NOMBRE_PROVEDOR = ?, APELLIDO = ?, CELULAR_PROVEDOR = ?,EMPRESA_PROVEDOR=?,TELEFONO_EMPRESA_PROVEDOR=?,DIRECCION_EMPRESA_PROVEDOR=?,CORREO_PROVEDOR=?,CODIGO_ALMACEN WHERE CODIGO_PROVEDOR =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            
            pst.setString(1, p.getN_identificacion_provedor());
            pst.setString(2, p.getNombres_provedor());
            pst.setString(3, p.getApellidos_provedor());
            pst.setString(4, p.getCelular_provedor());
            pst.setString(5, p.getEmpresa_provedor());
            pst.setString(6, p.getTelefono_empresa_provedor());
            pst.setString(7, p.getDireccion_empresa_provedor());
            pst.setString(8, p.getCorreo_provedor());
            pst.setInt(9, p.getCodigo_almacen());
            pst.setInt(10, p.getCodigo_provedor());
            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<Provedor> consultar() {
        List<Provedor> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM provedor_";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos.add(new Provedor(rs.getInt("CODIGO_PROVEDOR"), rs.getString("N_IDENTIFICACION_PROVEDOR"), rs.getString("NOMBRE_PROVEDOR"), rs.getString("APELLIDO_PROVEDOR"), rs.getString("CELULAR_PROVEDOR"),rs.getString("EMPRESA_PROVEDOR"), rs.getString("TELEFONO_EMPRESA_PROVEDOR"), rs.getString("DIRECCION_EMPRESA_PROVEDOR"), rs.getString("CORREO_PROVEDOR"),rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        List<Provedor> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM provedor_ WHERE " + criterio + ";";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                datos.add(new Provedor(rs.getInt("CODIGO_PROVEDOR"), rs.getString("N_IDENTIFICACION_PROVEDOR"), rs.getString("NOMBRE_PROVEDOR"), rs.getString("APELLIDO_PROVEDOR"), rs.getString("CELULAR_PROVEDOR"),rs.getString("EMPRESA_PROVEDOR"), rs.getString("TELEFONO_EMPRESA_PROVEDOR"), rs.getString("DIRECCION_EMPRESA_PROVEDOR"), rs.getString("CORREO_PROVEDOR"),rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
    
}
