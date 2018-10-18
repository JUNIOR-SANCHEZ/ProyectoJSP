package modelado;

import java.util.*;
import java.sql.*;
import uml.Almacen;

public class DAOAlmacen implements Operaciones {

    DataBase db = new DataBase();

    @Override
    public String insertar(Object obj) {
        Almacen a = (Almacen) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "INSERT INTO ALMACEN VALUES (?,?,?,?,?);";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, a.getCodigo_almacen());
            pst.setString(2, a.getNombre_almacen());
            pst.setString(3, a.getTelefono_almacen());
            pst.setString(4, a.getCorreo_almacen());
            pst.setString(5, a.getDireccion_almacen());
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
        String sql = "DELETE FROM ALMACEN WHERE CODIGO_ALMACEN = ? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            int filas = pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Almacen a = (Almacen) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "UPDATE ALMACEN SET NOMBRE_ALMACEN = ?, TELEFONO_ALMACEN = ?, CORREO_ALMACEN = ?, DIRECCION_ALMACEN = ? WHERE CODIGO_ALMACEN =? ;";
        String respuesta = "";
        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()
            );
            pst = con.prepareStatement(sql);
            pst.setString(1, a.getNombre_almacen());
            pst.setString(2, a.getTelefono_almacen());
            pst.setString(3, a.getCorreo_almacen());
            pst.setString(4, a.getDireccion_almacen());
            pst.setInt(5, a.getCodigo_almacen());
            int filas = pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;
    }

    @Override
    public List<Almacen> consultar() {
        List<Almacen> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM ALMACEN";
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
                x.add(new Almacen(rs.getInt("CODIGO_ALMACEN"), rs.getString("NOMBRE_ALMACEN"), rs.getString("TELEFONO_ALMACEN"), rs.getString("CORREO_ALMACEN"), rs.getString("DIRECCION_ALMACEN")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return x;
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        List<Almacen> x = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT " + campo + " FROM ALMACEN WHERE " + criterio + ";";
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
                x.add(new Almacen(rs.getInt("CODIGO_ALMACEN"), rs.getString("NOMBRE_ALMACEN"), rs.getString("TELEFONO_ALMACEN"), rs.getString("CORREO_ALMACEN"), rs.getString("DIRECCION_ALMACEN")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return x;
    }

}
