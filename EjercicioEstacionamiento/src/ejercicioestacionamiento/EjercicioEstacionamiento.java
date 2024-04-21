package ejercicioestacionamiento;

import java.util.Scanner;

/**
 * Clase principal que contiene el método main.
 */
public class EjercicioEstacionamiento {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento(5, 5);

        int opcion;
        boolean salir = false;

        do {
            System.out.println("Menu:");
            System.out.println("1.-Ingresar auto");
            System.out.println("2.-Sacar auto");
            System.out.println("3.-Mostrar disponibilidad de espacios");
            System.out.println("4.-Mostrar estacionamiento");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fila (letra) donde desea estacionar el auto: ");
                    char filaIngreso = sn.next().charAt(0);
                    System.out.print("Ingrese la columna (número) donde desea estacionar el auto: ");
                    int columnaIngreso = sn.nextInt();
                    System.out.print("Ingrese la hora de ingreso del auto: ");
                    int horaIngreso = sn.nextInt();
                    estacionamiento.ingresarAuto(filaIngreso, columnaIngreso, horaIngreso);
                    break;
                case 2:
                    System.out.print("Ingrese la fila (letra) donde está estacionado el auto a sacar: ");
                    char filaSalida = sn.next().charAt(0);
                    System.out.print("Ingrese la columna (número) donde está estacionado el auto a sacar: ");
                    int columnaSalida = sn.nextInt();
                    System.out.print("Ingrese la hora de salida del auto: ");
                    int horaSalida = sn.nextInt();
                    double costoTotal = estacionamiento.sacarAuto(filaSalida, columnaSalida, horaSalida);
                    System.out.println("Costo por usar el estacionamiento: $" + costoTotal);
                    break;
                case 3:
                    System.out.println("Espacios disponibles: " + estacionamiento.contarEspaciosDisponibles());
                    break;
                case 4:
                    estacionamiento.mostrarEstacionamiento();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que elegir una opción válida");
            }
        } while (!salir);
        System.out.println("Gracias por usar el programa");
    }
}
