package modelado;
import java.util.*;
import java.sql.*;
import uml.provedor_entrada;
public class DAOProvedor_entrada implements Operaciones {
    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
         provedor_entrada Pr_e = (provedor_entrada) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into provedor_entrada values (?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, Pr_e.getCodigo_provedor());
            pst.setInt(2, Pr_e.getCodigo_entrada());
            pst.setInt(3,Pr_e.getCodigo_bodega());
            pst.setInt(4, Pr_e.getCodigo_almacen());
            
            int filas = pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(Object obj) {
         provedor_entrada Pr_e = (provedor_entrada) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM provedor_entrada WHERE CODIGO_PROVEDOR = ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, Pr_e.getCodigo_provedor());
            int filas = pst.executeUpdate();
            respuesta = "Se Elimino " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
         provedor_entrada Pr_e = (provedor_entrada) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE ALMACEN SET  CODIGO_ENTRADA = ?, CODIGO_BODEGA = ?, CODIGO_ALMACEN = ? WHERE CODIGO_PROVEDOR =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
   
            pst.setInt(1, Pr_e.getCodigo_entrada());
            pst.setInt(2,Pr_e.getCodigo_bodega());
            pst.setInt(3, Pr_e.getCodigo_almacen());
            pst.setInt(4, Pr_e.getCodigo_provedor());
            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<provedor_entrada> consultar() {
         List<provedor_entrada> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM provedor_entrada";
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
                datos.add(new provedor_entrada(rs.getInt("CODIGO_PROVEDOR"), rs.getInt("CODIGO_ENTRADA"), rs.getInt("CODIGO_BODEGA"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<provedor_entrada> filtrar(String campo, String criterio) {
             List<provedor_entrada> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM provedor_entrada WHERE " + criterio + ";";
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
                datos.add(new provedor_entrada(rs.getInt("CODIGO_PROVEDOR"), rs.getInt("CODIGO_ENTRADA"), rs.getInt("CODIGO_BODEGA"), rs.getInt("CODIGO_ALMACEN")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
}
