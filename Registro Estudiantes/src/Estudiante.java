/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cesar Carrillo
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private double promedio;

    //Constructor sin especificar el promedio
    public Estudiante(String nombre, String apellido, String carrera) {
        this(nombre, apellido, carrera, 0.0);
    }

    //Constructor sobrecargado
    public Estudiante(String nombre, String apellido, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    //Getters y Setters
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante Registrado: " + nombre + " " + apellido + ", " + carrera + ", " + promedio;
    }   
}
