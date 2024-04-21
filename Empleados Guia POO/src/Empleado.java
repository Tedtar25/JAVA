/**
 * Clase que representa a un empleado.
 * Contiene métodos y atributos relacionados con un empleado.
 * 
 * @author Cesar Carrillo
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private int sueldo;
    private int id;
    
    // Constructor de la clase Empleado
    public Empleado(String nombre, String puesto, int sueldo, int id) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.id = id;
    }
    
    // Método para imprimir los datos del empleado
    public void datosEmpleado(){
        System.out.println("El empleado " + this.id + " " + this.nombre + ", " + this.puesto + " gana: $" + this.sueldo);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
