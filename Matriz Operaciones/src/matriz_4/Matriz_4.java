/*
 * Este programa permite realizar diferentes operaciones con una matriz de 4x5:
 * 1. Rellenar la matriz con valores ingresados por el usuario.
 * 2. Modificar un valor específico en la matriz.
 * 3. Sumar los valores de una fila específica.
 * 4. Sumar los valores de una columna específica.
 * 5. Calcular la suma de la diagonal principal.
 * 6. Calcular la suma de la diagonal inversa.
 * 7. Calcular la media de todos los elementos de la matriz.
 * 
 * El usuario elige la operación a realizar ingresando un número del 1 al 8.
 * 
 * Es necesario primero rellenar la matriz para poder continuar con las otras opciones del menú.
 * 
 * Al finalizar la ejecución del programa, se muestra "FIN".
 * 
 * @author Cesar Carrillo
 */
package matriz_4;

import java.util.Scanner;

public class Matriz_4 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int matriz[][] = new int[4][5];

        boolean salir = false;
        int opcion, fila, columna, nuevoValor;

        boolean rellenado = false;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1.-Rellenar Matriz");
            System.out.println("2.-Modificar una celda");
            System.out.println("3.-Sumar una fila");
            System.out.println("4.-Sumar una columna");
            System.out.println("5.-Sumar la diagonal principal");
            System.out.println("6.-Sumar la diagonal inversa");
            System.out.println("7.-Sacar la media de toda la matriz");
            System.out.println("8.-Salir");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        System.out.println("Introduce la fila:");
                        fila = sn.nextInt();
                        System.out.println("Introduce la columna:");
                        columna = sn.nextInt();
                        System.out.println("Introduce el nuevo valor:");
                        nuevoValor = sn.nextInt();
                        modificarCelda(matriz, fila, columna, nuevoValor);
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 3:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 4:
                    if (rellenado) {
                        do {
                            System.out.println("Elige una fila");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 5:
                    if (rellenado) {
                        System.out.println("La suma diagonal es: " + sumaDiagonalPrinc(matriz));
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 6:
                    if (rellenado) {
                        System.out.println("La suma diagonal es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 7:
                    if (rellenado) {
                        System.out.println("La media es: " + media(matriz));
                    } else {
                        System.out.println("Debes rellenar primero la matriz");
                    }
                    break;

                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que elegir una opcion valida");
            }

        } while (!salir);

        System.out.println("FIN");
    }

    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " , " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static int sumaDiagonalPrinc(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0, j = 3; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }
        return suma;
    }

    public static double media(int[][] matriz) {
        double suma = 0, media;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        media = suma / (matriz.length * matriz.length);
        return media;
    }

    public static void modificarCelda(int[][] matriz, int fila, int columna, int nuevoValor) {
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            matriz[fila][columna] = nuevoValor;
            System.out.println("Celda modificada exitosamente");
        } else {
            System.out.println("La fila y/o columna especificada no existen en la matriz");
        }
    }

}
