package maquina.expendedora.matrices.pkg5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaquinaExpendedoraMatrices5 {

    static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        // Definición de golosinas y precios
        String[][] nombresGolosinas = {
            {"CocaCola", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };

        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
        };

        // Matriz de cantidad de golosinas
        int cantidad[][] = new int[4][4];
 
        // Relleno la matriz con 5
        rellenarMatriz(cantidad, 5);
 
        // Indica si salimos o no
        boolean salir = false;
        int opcion, fila, columna, cantidadNueva;
        String pos, password;
        double ventaTotales = 0;
 
        // Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {
            // Opciones del menú
            System.out.println("1. Pedir golosina");
            System.out.println("2. Mostrar golosinas");
            System.out.println("3. Rellenar golosinas");
            System.out.println("4. Apagar maquina");
 
            try {
                // Pide una opción
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();
 
                // Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        // Pide la posición
                        pos = pedirCadena("Introduce la posición que quieras");
 
                        // Valida la posición
                        if (validarPos(nombresGolosinas, pos)) {
                            // Extrae la fila y columna
                            fila = extraerNumero(pos, 0);
                            columna = extraerNumero(pos, 1);
 
                            // Verifica si hay valores en la matriz
                            if (hayValorPosicion(cantidad, fila, columna)) {
                                // Muestra la golosina
                                System.out.println("Aquí tiene su golosina: " + nombresGolosinas[fila][columna] + ". Gracias por su compra");
 
                                // Reduce la cantidad en 1
                                reducirPosicion(cantidad, fila, columna, 1);
 
                                // Aumenta el total de ventas
                                ventaTotales += precio[fila][columna];
 
                            } else {
                                System.out.println("No hay más golosinas de este tipo, espere al técnico para que las rellene");
                            }
 
                        } else {
                            System.out.println("La posición introducida no es válida");
                        }
 
                        break;
                    case 2:
                        // Muestra las golosinas
                        mostrarGolosinas(nombresGolosinas, precio);
                        break;
                    case 3:
                        // Pide la contraseña
                        password = pedirCadena("Introduce la contraseña");
 
                        // Comprueba si la contraseña es correcta
                        if (cadenaIguales(password, "Toro2800")) {
                            // Pide la posición
                            pos = pedirCadena("Introduce la posición que quieras");
                             
                            // Extrae los números
                            fila = extraerNumero(pos, 0);
                            columna = extraerNumero(pos, 1);
 
                            // Valida la posición
                            if (validarPos(nombresGolosinas, pos)) {
                                // Introduce la cantidad
                                cantidadNueva = pedirInteger("Introduce la cantidad");
 
                                // Aumenta la cantidad en el valor dado
                                aumentarPosicion(cantidad, fila, columna, cantidadNueva);
 
                                System.out.println("Se ha incrementado la cantidad");
 
                            } else {
                                System.out.println("La posición introducida no es válida");
                            }
 
                        } else {
                            System.out.println("La contraseña es incorrecta");
                        }
 
                        break;
                    case 4:
                        // Muestra las ventas
                        System.out.println("Las ventas han sido de "+ventaTotales);
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 7");
                }
 
                // Controla la excepción en caso de que se introduzca un valor no correcto
            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un numero");
                sn.next();
            }
        }
 
        System.out.println("Fin del menú");
    }
 
    /**
     * Rellena la matriz con un número
     * @param matriz
     * @param num 
     */
    public static void rellenarMatriz(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = num;
            }
        }
    }
 
    /**
     * Pide una cadena
     * @param mensaje
     * @return 
     */
    public static String pedirCadena(String mensaje) {
        System.out.println(mensaje);
        String cadena = sn.next();
        return cadena;
    }
 
    /**
     * Pide un número entero
     * @param mensaje
     * @return 
     */
    public static int pedirInteger(String mensaje) {
        System.out.println(mensaje);
        int numero = sn.nextInt();
        return numero;
    }
 
    /**
     * Valida si una posición es correcta
     * @param matriz
     * @param pos
     * @return 
     */
    public static boolean validarPos(String[][] matriz, String pos) {
        if (pos.length() != 2) {
            return false;
        }
 
        if (!(esNumero(pos.substring(0, 1)) && esNumero(pos.substring(1, 2)))) {
            return false;
        }
 
        int fila = extraerNumero(pos, 0);
        int columna = extraerNumero(pos, 1);
 
        if (!((fila >= 0 && fila < matriz.length) && (columna >= 0 && columna < matriz[0].length))) {
            return false;
        }
 
        return true;
    }
 
    /**
     * Indica si un String es un número
     * @param num
     * @return 
     */
    public static boolean esNumero(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 
    /**
     * Extrae el número, devuelve -1 si hay un error
     * @param numero
     * @param pos
     * @return 
     */
    public static int extraerNumero(String numero, int pos) {
        int num = -1;
        if (esNumero(numero)) {
            num = Integer.parseInt(numero.substring(pos, pos + 1));
        }
        return num;
    }
 
    /**
     * Reduce la cantidad de una posición en concreto
     * @param matriz
     * @param fila
     * @param columna
     * @param cantidad 
     */
    public static void reducirPosicion(int[][] matriz, int fila, int columna, int cantidad) {
        matriz[fila][columna] -= cantidad;
    }
 
    /**
     * Indica si en una posición hay un valor mayor que 0
     * @param matriz
     * @param fila
     * @param columna
     * @return 
     */
    public static boolean hayValorPosicion(int[][] matriz, int fila, int columna) {
        return matriz[fila][columna] > 0;
    }
 
    /**
     * Muestra las golosinas y sus precios
     * @param nombres
     * @param precios 
     */
    public static void mostrarGolosinas(String[][] nombres, double[][] precios) {
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(i + "" + j + " " + nombres[i][j] + " " + precios[i][j]);
            }
        }
    }
 
    /**
     * Indica si dos cadenas son iguales
     * @param cadena1
     * @param cadena2
     * @return 
     */
    public static boolean cadenaIguales(String cadena1, String cadena2) {
        return cadena1.equals(cadena2);
    }
 
    /**
     * Aumenta la cantidad de una posición
     * @param matriz
     * @param fila
     * @param columna
     * @param cantidad 
     */
    public static void aumentarPosicion(int[][] matriz, int fila, int columna, int cantidad) {
        matriz[fila][columna] += cantidad;
    }
}