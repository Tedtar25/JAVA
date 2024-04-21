/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
public class Electronico extends Producto {
    private String condicion;
    private String modelo;

    public Electronico(String condicion, String modelo, String nombre, String marca, String precio) {
        super(nombre, marca, precio);
        this.condicion = condicion;
        this.modelo = modelo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString()+"Condicion= " + condicion + ", Modelo= " + modelo;
    }
    
    @Override
    public boolean modificar(String atributo, String valorNuevo) {
        switch (atributo){
            case "nombre":
                setNombre(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "marca":
                setMarca(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "precio":
                setPrecio(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "condicion":
                setCondicion(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "modelo":
                setModelo(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            default:
                System.out.println("No se han hecho cambios");
                return false;
        }
    }
    
}
