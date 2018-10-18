package modelado;

import java.util.*;
import java.sql.*;
import uml.Bodega;

public class DAOBodega implements Operaciones {

    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
        Bodega b = (Bodega) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "INSERT INTO bodega VALUES (NULL,?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setString(0, b.getNombre_producto_b());
            pst.setString(1, b.getDescripcion_producto());
            pst.setInt(2, b.getCantidad_producto_b());
            pst.setDouble(3, b.getValor_unitario_b());
            int fila = pst.executeUpdate();
            respuesta = "Se ingreso " + fila + " fila";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String eliminar(int id) {
        Connection con;
        PreparedStatement pst;
        String sql = "DELETE FROM bodega WHERE CODIGO_BODEGA = ?;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setInt(0, id);
            int fila = pst.executeUpdate();
            respuesta = "Se ingreso " + fila + " fila";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Bodega b = (Bodega) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "";
        String respuesta = "UPDATE bodega SET NOMBRE_PRODUCTO_B = ?, DESCRIPCION_PRODUCTO_B = ?, CANTIDAD_PRODUCTO_B = ?, VALOR_UNITATIO_B = ? WHERE CODIGO_BODEGA = ?;";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getClave());
            pst = con.prepareStatement(sql);
            pst.setString(0, b.getNombre_producto_b());
            pst.setString(1, b.getDescripcion_producto());
            pst.setInt(2, b.getCantidad_producto_b());
            pst.setDouble(3, b.getValor_unitario_b());
            pst.setInt(4, b.getCodigo_bodega());
            int fila = pst.executeUpdate();
            respuesta = "Se modifico " + fila + " fila";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<Bodega> consultar() {
        List<Bodega> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM BODEGA";
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
                x.add(new Bodega(rs.getInt("CODIGO_BODEGA"), rs.getString("NOMBRE_PRODUCTO_B"), rs.getString("DESCRIPCION_PRODUCTO_B"), rs.getInt("CANTIDAD_PRODUCTO_B"), rs.getDouble("VALOR_UNITATIO_B")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return x;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        List<Bodega> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM BODEGA WHERE " + criterio +";";
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
                x.add(new Bodega(rs.getInt("CODIGO_BODEGA"), rs.getString("NOMBRE_PRODUCTO_B"), rs.getString("DESCRIPCION_PRODUCTO_B"), rs.getInt("CANTIDAD_PRODUCTO_B"), rs.getDouble("VALOR_UNITATIO_B")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return x;
    }

}
