/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
abstract public class Producto implements Gestionable{
    
    private String nombre;
    private String marca;
    private String precio;
    private String estado;

    public Producto(String nombre, String marca, String precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.estado = "Activo";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto= " + nombre + ", Marca= " + marca + ", Precio= " + precio + ", Estado= " + estado +", ";
    }
    
    @Override
    public void desactivar(){
        if ( !estado.equalsIgnoreCase("Activo"))
            System.out.println("El producto ya habia sido desactivado.");
        else {
            this.estado = "Inactivo";
            System.out.println("\nEl producto ha sido desactivado.\n");
        }
    }
    
}

