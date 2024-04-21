/*
 * Clase abstracta Empleado que sirve como clase base para Comercial y Repartidor.
 */
package javapoo8;

/**
 * Clase abstracta que representa a un empleado genérico.
 * Contiene métodos y atributos comunes a todos los empleados.
 * 
 * @author Cesar Carrillo
 */
public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public final double PLUS = 300;

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos getters y setters para los atributos de la clase Empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto que debe ser implementado en las clases hijas
    public abstract boolean plus();
    
    // Método toString para mostrar la información del empleado
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", ";
    }
}
