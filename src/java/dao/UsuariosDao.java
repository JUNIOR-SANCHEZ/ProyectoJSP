/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.*;
import model.Usuarios;

/**
 *
 * @author JUNIOR
 */
public class UsuariosDao {
    public static ArrayList<Usuarios> Consultar() {
        try {
            String sql = " ";
            Connection c = Conexion.conectar();
            PreparedStatement pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            ArrayList<Usuarios> usu = null;
            Usuarios u;
            while(rs.next()){
                u = new Usuarios();
                u.setCodigo(rs.getInt("codigo_usuario"));
                u.setNombre(rs.getString("nombre_usuario"));
                u.setApellido(rs.getString("apellido_usuario"));
                u.setEmail(rs.getString("email__usuario"));
                u.setUsername(rs.getString("username_usuario"));
                u.setPassword(rs.getString("password__usuario"));
                u.setImagen(rs.getString("imagen_usuario"));
                u.setEstado(rs.getInt("estado_usuario"));
                u.setFeha(rs.getString("creado_en_usuario"));
                usu.add(u);
            }
            return usu;
        } catch (SQLException e) {
            return null;
        }
    }

    public static boolean Insertar(Usuarios u) {
        try {
            String sql = "INSERT usuarios VALUES (NULL,?,?,?,?,?,?,?,NOW())";
            Connection c = Conexion.conectar();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, u.getNombre());
            pst.setString(2, u.getApellido());
            pst.setString(3, u.getEmail());
            pst.setString(4, u.getUsername());
            pst.setString(5, u.getPassword());
            pst.setString(6, u.getImagen());
            pst.setInt(7, u.getEstado());
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
