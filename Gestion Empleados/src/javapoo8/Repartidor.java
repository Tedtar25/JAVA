/*
 * Clase Repartidor que hereda de Empleado.
 */
package javapoo8;

/**
 * Clase que representa a un empleado de tipo Repartidor.
 * Hereda de la clase Empleado y agrega un atributo específico (zona).
 * 
 * @author Cesar Carrillo
 */
public class Repartidor extends Empleado {
    
    private String zona;

    // Constructor de la clase Repartidor que invoca al constructor de la clase Empleado
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // Métodos getters y setters para el atributo zona
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    // Método toString para mostrar la información del repartidor, aprovechando el método toString de la clase padre
    @Override
    public String toString() {
        return super.toString() + " zona=" + zona;
    }
    
    // Método plus() que sobreescribe el método abstracto de la clase
    @Override
    public boolean plus() {
        if(super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le ha añadido un Plus al empleado " + super.getNombre());
            return true;
        }
        return false;
    }
}
