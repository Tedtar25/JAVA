/*
 * Clase principal que contiene el método main.
 */
package javapoo8;

/**
 * Clase principal para probar la jerarquía de clases Empleado, Comercial y Repartidor.
 * Instancia objetos de tipo Comercial y Repartidor, les aplica el método plus() y muestra la información de cada empleado.
 * 
 * @author Cesar Carrillo
 */
public class JavaPOO8 {

    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear un objeto Comercial
        Comercial c1 = new Comercial(100, "Jose", 27, 1000);
        // Crear un objeto Repartidor
        Repartidor r1 = new Repartidor("zona 3", "Pedro", 20, 900);
        
        // Aplicar el método plus() a cada empleado
        c1.plus();
        r1.plus();
        
        // Mostrar la información de cada empleado
        System.out.println(c1);
        System.out.println(r1);
        
    }
    
}
