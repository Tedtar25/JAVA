/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
public class Proveedor extends Usuario {
    private String nombreEmpresa;

    public Proveedor(String nombreEmpresa, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return super.toString()+"Nombre de Empresa=" + nombreEmpresa;
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
            case "nombreEmpresa":
                setNombreEmpresa(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            default:
                System.out.println("No se han hecho cambios");
                return false;
        }
    }  
}
