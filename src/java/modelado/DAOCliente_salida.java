package modelado;

import java.util.*;
import java.sql.*;
import uml.Cliente_Salida;
public class DAOCliente_salida  implements Operaciones {
    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
       Cliente_Salida Cs = (Cliente_Salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "INSERT INTO cliente_salida VALUES (?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, Cs.getN_identificacion_cliente());
            pst.setInt(2, Cs.getCodigo_salida());
            pst.setInt(3, Cs.getCodigo_bodega());
            pst.setInt(4, Cs.getCodigo_almacen());
            int filas = pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(Object obj) {
         Cliente_Salida Cs = (Cliente_Salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM cliente_salida WHERE N_IDENTIFICACION_CLIENTE = ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, Cs.getN_identificacion_cliente());
            int filas = pst.executeUpdate();
            respuesta = "Se Elimino " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Cliente_Salida Cs = (Cliente_Salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE ALMACEN SET CODIGO_SALIDA = ?, CODIGO_BODEGA = ?, CODIGO_ALMACEN = ? WHERE N_IDENTIFICACION_CLIENTE =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, Cs.getCodigo_salida());
            pst.setInt(2, Cs.getCodigo_bodega());
            pst.setInt(3, Cs.getCodigo_almacen());
            pst.setString(4, Cs.getN_identificacion_cliente());
            
            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<Cliente_Salida> consultar() {
        List<Cliente_Salida> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM cliente_salida";
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
                datos.add(new Cliente_Salida(rs.getString("N_IDENTIFICACION_CLIENTE"), rs.getInt("CODIGO_SALIDA"), rs.getInt("CODIGO_BODEGA"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<Cliente_Salida> filtrar(String campo, String criterio) {
          List<Cliente_Salida> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM cliente_salida WHERE " + criterio + ";";
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
                datos.add(new Cliente_Salida(rs.getString("N_IDENTIFICACION_CLIENTE"), rs.getInt("CODIGO_SALIDA"), rs.getInt("CODIGO_BODEGA"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
}
