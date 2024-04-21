/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
public class Ropa extends Producto {
    private String talla;
    private String color;

    public Ropa(String talla, String color, String nombre, String marca, String precio) {
        super(nombre, marca, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"Talla= " + talla + ", Color= " + color;
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
            case "talla":
                setTalla(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            case "color":
                setColor(valorNuevo);
                System.out.println("Cambio detectado");
                return true;
            default:
                System.out.println("No se han hecho cambios");
                return false;
        }
    }
}
