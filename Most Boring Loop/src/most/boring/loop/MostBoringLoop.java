package most.boring.loop;

import java.util.Scanner;

/**
 * Este programa contiene una serie de métodos que demuestran diferentes tipos de bucles.
 * Además, incluye un método para dibujar un triángulo rectángulo.
 *
 * @author Cesar Carrillo
 */
public class MostBoringLoop {

    /**
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Se pueden comentar o descomentar los métodos a ejecutar para probarlos individualmente
        //loop1();
        //loop2();
        //loop3();
        //experimento1(sn);
        //experimento2(sn);
        //trianguloRectangulo();
    }

    /**
     * Método que demuestra un bucle for simple.
     * Imprime el valor de la cuenta del 1 al 10.
     */
    public static void loop1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la cuenta es: " + (i + 1));
        }
        System.out.println("Hecho!");
    }

    /**
     * Método que demuestra un bucle for con múltiples variables de control.
     * Imprime la cuenta desde 1 hasta 12 y desde 12 hasta 1.
     */
    public static void loop2() {
        for (int i = 0, j = 12; i < j; i++, j--) {
            System.out.println("La cuenta es " + (i + 1) + " ," + (j));
        }
    }

    /**
     * Método que demuestra un bucle for y el uso de una variable acumuladora.
     * Suma los números del 0 al 9 e imprime el total.
     */
    public static void loop3() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println(total);
    }

    /**
     * Método que demuestra un bucle while con una condición de salida.
     * Solicita números al usuario y los imprime hasta que se ingrese un 0.
     *
     * @param sn Scanner para leer la entrada del usuario
     */
    public static void experimento1(Scanner sn) {
        while (true) {
            System.out.println("Introduce un numero");
            int i = sn.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Hecho");
    }

    /**
     * Método que demuestra un bucle while con una instrucción continue y una condición de salida.
     * Solicita números al usuario y los imprime hasta que se ingrese un 0 o un número mayor que 10.
     *
     * @param sn Scanner para leer la entrada del usuario
     */
    public static void experimento2(Scanner sn) {
        while (true) {
            System.out.println("Introduce un numero");
            int i = sn.nextInt();
            if (i > 10) {
                continue;
            }
            if (i == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Hecho");
    }

    /**
     * Método que dibuja un triángulo rectángulo con asteriscos.
     * La base y la altura del triángulo están definidas dentro del método.
     */
    public static void trianguloRectangulo() {
        int base, altura;
        base = 5;
        altura = 7;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
