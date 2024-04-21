package auto;

/**
 * Clase principal que contiene el método main.
 */
public class Main {

    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear un objeto de tipo Automovil usando el constructor
        Automovil miAuto = new Automovil("rojo", "Toyota");
        miAuto.acelerar();
    }
}
