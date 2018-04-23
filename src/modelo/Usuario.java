/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author camil
 */
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    private String usuario;
    private String contrasena;
    private String tipo;

    public Usuario(String nombre, String apellido1, String apellido2,String correo, String usuario, String contrasena, String tipo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2=apellido2;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", correo=" + correo + ", usuario=" + usuario + ", contrasena=" + contrasena + ", tipo=" + tipo + '}';
    }

    
   

   

}
