/*
 * 
 */
package model;

import java.io.Serializable;

/**
 *
 * @author JULIO SÁNCHEZ, EDUARDO JOSÉ Y JORGE TANDAZO 
 */
public class Usuarios implements Serializable{
    private int codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String username;
    private String password;
    private String imagen;
    private int estado;
    private String feha;

    public Usuarios() {
    }

    public Usuarios(int codigo, String nombre, String apellido, String email, String username, String password, String imagen, int estado, String feha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.username = username;
        this.password = password;
        this.imagen = imagen;
        this.estado = estado;
        this.feha = feha;
    }

    public String getFeha() {
        return feha;
    }

    public void setFeha(String feha) {
        this.feha = feha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
