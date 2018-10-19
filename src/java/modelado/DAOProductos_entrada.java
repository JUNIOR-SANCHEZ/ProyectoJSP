package modelado;


import java.util.*;
import java.sql.*;
import uml.productos_entrada;

public class DAOProductos_entrada implements Operaciones {
    DataBase db = new DataBase();
    @Override
    public String insertar(Object obj) {
       productos_entrada Pe=(productos_entrada) obj;
       Connection con;
        PreparedStatement pst;
        String sql="INSERT INTO productos_entrada VALUES (?,?,?,?,?,?,?);";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()         
            );
            pst=con.prepareStatement(sql);
            pst.setInt(1,Pe.getCodigo_entada());
            pst.setString(2,Pe.getNombre_producto_e());
            pst.setString(3,Pe.getDescripcion_producto_e());
            pst.setInt(4, Pe.getCatidad_producto_e());
            pst.setDouble(5,Pe.getValor_unitario_e());
            pst.setDouble(6,Pe.getValor_total_e());
            pst.setInt(7,Pe.getCodigo_bodega());
            int filas= pst.executeUpdate();
            respuesta = "Se regitro " + filas + " nuevo elemento";
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta; 
    }
    @Override
    public String eliminar(int id) {
       Connection conn;
        PreparedStatement pst;
        String sql="DELETE FROM productos_entrada WHERE CODIGO_ENTRADA = ?";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            conn=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()         
            );
            pst=conn.prepareStatement(sql);
            pst.setInt(0,id);
            int filas= pst.executeUpdate();
            respuesta = "Se elimino" + filas + " nuevo elemento";
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta; 
    }

    @Override
    public String modificar(Object obj) {
     productos_entrada Pe=(productos_entrada) obj;
       Connection conn;
        PreparedStatement pst;
        String sql="update productos_entrada set NOMBRE_PRODUCTO_E=?,DESCRIPCION_PRODUCTO_E=?,CANTIDAD_PRODUCTO_E =?,VALOR_UNITARIO_E =?,VOLOR_TOTAL_E =?,CODIGO_BODEGA =? where CODIGO_ENTRADA = ? ;";
        String respuesta="";
        try {
            Class.forName(db.getDriver());
            conn=DriverManager.getConnection(
                    db.getUrl(),
                    db.getUsuario(),
                    db.getClave()         
            );
            pst=conn.prepareStatement(sql);
            pst.setString(1,Pe.getNombre_producto_e());
            pst.setString(2,Pe.getDescripcion_producto_e());
            pst.setInt(3, Pe.getCatidad_producto_e());
            pst.setDouble(4,Pe.getValor_unitario_e());
            pst.setDouble(5,Pe.getValor_total_e());
            pst.setInt(6,Pe.getCodigo_bodega());
            pst.setInt(7,Pe.getCodigo_entada());
            int filas= pst.executeUpdate();
            respuesta = "Se modifico " + filas + " nuevo elemento";
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return respuesta;     
    }

    @Override
    public List<productos_entrada> consultar() {
     List<productos_entrada> datos = new ArrayList<>();
      Connection con;
      PreparedStatement pst;
       ResultSet rs;
        String sql = "SELECT * FROM productos_entrada";
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
                datos.add(new productos_entrada(rs.getInt("CODIGO_ENTRADA"), rs.getString("NOMBRE_PRODUCTO_E"), rs.getString("DESCRIPCION_PRODUCTO_E"), rs.getInt("CANTIDAD_PRODUCTO_E"),rs.getDouble("VALOR_UNITARIO_E"),rs.getDouble("VALOR_TOTAL_E"),rs.getInt("CODIGO_BODEGA")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }

    @Override
    public List<productos_entrada> filtrar(String campo, String criterio) {
       List<productos_entrada> datos = new ArrayList<>();
      Connection con;
      PreparedStatement pst;
       ResultSet rs;
        String sql = "SELECT" + campo + " FROM productos_entrada WHERE " + criterio + ";";
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
                datos.add(new productos_entrada(rs.getInt("CODIGO_ENTRADA"), rs.getString("NOMBRE_PRODUCTO_E"), rs.getString("DESCRIPCION_PRODUCTO_E"), rs.getInt("CANTIDAD_PRODUCTO_E"),rs.getDouble("VALOR_UNITARIO_E"),rs.getDouble("VALOR_TOTAL_E"),rs.getInt("CODIGO_BODEGA")));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
        }
        return datos;
    }
    
}
