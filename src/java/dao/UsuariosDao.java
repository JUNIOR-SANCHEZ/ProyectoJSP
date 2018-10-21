/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.*;
import model.Usuario;

/**
 *
 * @author JUNIOR
 */
public class UsuariosDao {
    public static ArrayList<Usuario> Consultar() {
        try {
            String sql = " ";
            Connection c = Conexion.conectar();
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ArrayList<Usuario> usu = null;
            Usuario u;
            while(rs.next()){
                u = new Usuario();
                u.setCodigo(rs.getInt("codigo_usuario"));
                u.setNombre(rs.getString("identificacion_usuario"));
                u.setNombre(rs.getString("nombre_usuario"));
                u.setApellido(rs.getString("apellido_usuario"));
                u.setEmail(rs.getString("email__usuario"));
                u.setFeha(rs.getString("creado_en_usuario"));
                usu.add(u);
            }
            return usu;
        } catch (SQLException e) {
            return null;
        }
    }

    public static boolean Insertar(Usuario u) {
        try {
            String sql = "INSERT usuarios VALUES (NULL,?,?,?,?,?,?,?,NOW())";
            Connection c = Conexion.conectar();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, u.getNombre());
            pst.setString(2, u.getApellido());
            pst.setString(3, u.getEmail());
            if (pst.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

}
