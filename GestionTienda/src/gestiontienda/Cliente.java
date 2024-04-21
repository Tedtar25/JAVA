/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
public class Cliente extends Usuario{
    private String direccion;

    public Cliente(String direccion, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+"Direccion=" + direccion;
    }

    @Override
    public boolean modificar(String atributo, String valorNuevo) {
        switch (atributo){
            case "nombre":
                setNombre(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "apellido":
                setApellido(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "correo":
                setCorreo(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "direccion":
                setDireccion(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            default:
                System.out.println("No se han hecho cambios");
                return false;
        }
    }
}
