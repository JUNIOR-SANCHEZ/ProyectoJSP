package modelado;
import java.util.*;
import java.sql.*;
import uml.productos_salida;
public class DAOProductos_salida implements Operaciones {
    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
         productos_salida ps = (productos_salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into productos_salida values (?,?,?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, ps.getCodigo_salida());
            pst.setString(2, ps.getNombre_producto_s());
            pst.setString(3, ps.getDescripcion_prpducto_s());
            pst.setInt(4, ps.getCantidad_producto_s());
            pst.setDouble(5, ps.getValor_unitario_s());
            pst.setInt(6, ps.getCodigo_bodega());
            int filas = pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(Object obj) {
       productos_salida ps = (productos_salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM productos_salida WHERE codigo_salida = ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, ps.getCodigo_salida());
            int filas = pst.executeUpdate();
            respuesta = "Se Elimino " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        productos_salida ps = (productos_salida) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE productos_salida SET NOMBRE_PRODUCTO_S = ?, DESCRIPCION_PRODUCTO_S = ?, CANTIDAD_PRODUCTO_S = ?, VALOR_UNITARIO_S = ?,CODIGO_BODEGA=? WHERE CODIGO_SALIDA =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, ps.getNombre_producto_s());
            pst.setString(2, ps.getDescripcion_prpducto_s());
            pst.setInt(3, ps.getCantidad_producto_s());
            pst.setDouble(4, ps.getValor_unitario_s());
            pst.setInt(5, ps.getCodigo_bodega());
            pst.setInt(6, ps.getCodigo_salida());

            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<productos_salida> consultar() {
         List<productos_salida> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM productos_salida";
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
                datos.add(new productos_salida(rs.getInt("CODIGO_SALIDA"), rs.getString("NOMBRE_PRODUCTO_S"), rs.getString("DESCRIPCION_PRODUCTO_S"), rs.getInt("CANTIDAD_PRODUCTO_S"), rs.getDouble("VALOR_UNITARIO_S"),rs.getInt("CODIGO_BODEGA")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<productos_salida> filtrar(String campo, String criterio) {
        List<productos_salida> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM productos_salida WHERE " + criterio + ";";
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
                datos.add(new productos_salida(rs.getInt("CODIGO_SALIDA"), rs.getString("NOMBRE_PRODUCTO_S"), rs.getString("DESCRIPCION_PRODUCTO_S"), rs.getInt("CANTIDAD_PRODUCTO_S"), rs.getDouble("VALOR_UNITARIO_S"),rs.getInt("CODIGO_BODEGA")));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
}
