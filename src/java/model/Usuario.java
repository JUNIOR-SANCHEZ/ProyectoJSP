/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author jgtan
 */
public class Usuario implements Serializable{
    private int codigo;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String cargo;
    private String telefono;
    private String email;
    private String feha;

    public Usuario() {
    }

    public Usuario(int codigo, String identificacion, String nombre, String apellido, String cargo, String telefono, String email, String feha) {
        this.codigo = codigo;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.telefono = telefono;
        this.email = email;
        this.feha = feha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeha() {
        return feha;
    }

    public void setFeha(String feha) {
        this.feha = feha;
    }
    
}
