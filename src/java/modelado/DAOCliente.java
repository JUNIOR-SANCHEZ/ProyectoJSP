package modelado;
import java.util.*;
import java.sql.*;
import uml.Cliente;
public class DAOCliente implements Operaciones{
 DataBase db = new DataBase();
    @Override
    public String insertar(Object obj) {
          Cliente C=(Cliente) obj;
       Connection con;
        PreparedStatement pst;
        String sql="insert into cliente values (?,?,?,?,?,?);";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()         
            );
            pst=con.prepareStatement(sql);
            pst.setString(1,C.getN_identificacion_cliente());
            pst.setString(2,C.getNombres_cliente());
            pst.setString(3,C.getApellidos_cliente());
            pst.setString(4, C.getTelefono_cliente());
            pst.setString(5,C.getCorreo_cliente());
            pst.setInt(6,C.getCodigo_almacen());
            int filas= pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta; 
    }

    @Override
    public String eliminar(Object obj) {
    Cliente C = (Cliente) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM cliente WHERE N_IDENTIFICACION_CLIENTE= ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, C.getN_identificacion_cliente());
            int filas = pst.executeUpdate();
            respuesta = "Se Elimino" + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
         Cliente C= (Cliente) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE cliente SET NOMBRE_CLIENTE = ?, APELLIDO_CLIENTE = ?, TELEFONO_CLIENTE = ?, CORREO_CLIENTE= ?,CODIGO_ALMACEN=? WHERE N_IDENTIFICACION_CLIENTE =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, C.getNombres_cliente());
            pst.setString(2, C.getApellidos_cliente());
            pst.setString(3, C.getTelefono_cliente());
            pst.setString(4, C.getCorreo_cliente());
            pst.setInt(5, C.getCodigo_almacen());
            pst.setString(6, C.getN_identificacion_cliente());
            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<Cliente> consultar() {
      List<Cliente> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM cliente";
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
                datos.add(new Cliente(rs.getString("N_IDENTIFICACION_CLIENTE"), rs.getString("NOMBRE_CLIENTE"), rs.getString("APELLIDO_CLIENTE"), rs.getString("TELEFONO_CLIENTE"), rs.getString("CORREO_CLIENTE"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<Cliente> filtrar(String campo, String criterio) {
       List<Cliente> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM cliente WHERE " + criterio + ";";
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
                datos.add(new Cliente(rs.getString("N_IDENTIFICACION_CLIENTE"), rs.getString("NOMBRE_CLIENTE"), rs.getString("APELLIDO_CLIENTE"), rs.getString("TELEFONO_CLIENTE"), rs.getString("CORREO_CLIENTE"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
    
}
