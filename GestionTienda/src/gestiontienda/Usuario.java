/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
abstract public class Usuario implements Gestionable {
    private String nombre;
    private String apellido;
    private String correo;
    private String estado;

    public Usuario(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.estado = "Activo";
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", Apellido= " + apellido + ", Correo= " + correo + ", Estado= " + estado +", ";
    }
       
    @Override
    public void desactivar(){
        if ( !estado.equalsIgnoreCase("Activo"))
            System.out.println("El usuario ya habia sido desactivado.");
        else {
            this.estado = "Inactivo";
            System.out.println("\nEl usuario ha sido desactivado.\n");
        }
    }
    
}
