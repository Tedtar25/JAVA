/**
 * Clase principal que contiene el método main.
 */
public class Main {

    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear objetos de tipo Empleado
        Empleado persona1 = new Empleado("Juan Perez", "Gerente", 50000, 1);
        persona1.datosEmpleado();
        
        Empleado persona2 = new Empleado("Ana Gomez", "Contadora", 45000, 2);
        persona2.datosEmpleado();
    }
}
