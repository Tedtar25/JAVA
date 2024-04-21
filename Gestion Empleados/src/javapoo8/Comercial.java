/*
 * Clase Comercial que hereda de Empleado.
 */
package javapoo8;

/**
 * Clase que representa a un empleado de tipo Comercial.
 * Hereda de la clase Empleado y agrega un atributo específico (comision).
 * 
 * @author Cesar Carrillo
 */
public class Comercial extends Empleado{
    
    private double comision;

    // Constructor de la clase Comercial que invoca al constructor de la clase Empleado
    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    // Métodos getters y setters para el atributo comision
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // Método toString para mostrar la información del comercial, aprovechando el método toString de la clase padre
    @Override
    public String toString() {
        return super.toString() + " comision=" + comision;
    }
        
    // Método plus() que sobreescribe el método abstracto de la clase Empleado
    @Override
    public boolean plus() {
        // Si el empleado tiene más de 30 años y la comisión es mayor a 200, se le aplica un plus al salario
        if (super.getEdad() > 30 && this.comision > 200) {
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le ha añadido un Plus al empleado " + super.getNombre());
            return true;
        }
        return false;
    }
}
