import java.util.ArrayList;
import java.util.Scanner;

class Cine {
    private ArrayList<Sala> salas;
    private static Scanner scanner = new Scanner(System.in);

    public Cine(int numSalas, int funcionesPorSala, int filasPorSala, int columnasPorSala) {
        this.salas = new ArrayList<>();
        for (int i = 0; i < numSalas; i++) {
            for (int j = 0; j < funcionesPorSala; j++) {
                this.salas.add(new Sala(filasPorSala, columnasPorSala));
            }
        }
    }

    public void reservarAsiento(int sala, int funcion, int fila, int columna) {
        if (sala < 1 || sala > this.salas.size() || funcion < 1 || funcion > 3) {
            System.out.println("¡Sala o función no válida!");
            return;
        }
        int index = (sala - 1) * 3 + funcion - 1;
        this.salas.get(index).reservarAsiento(fila, columna);
    }

    public void cancelarReservaAsiento(int sala, int funcion, int fila, int columna) {
        if (sala < 1 || sala > this.salas.size() || funcion < 1 || funcion > 3) {
            System.out.println("¡Sala o función no válida!");
            return;
        }
        int index = (sala - 1) * 3 + funcion - 1;
        this.salas.get(index).cancelarReservaAsiento(fila, columna);
    }

    public String mostrarEstadoAsientosSala(int sala, int funcion) {
        if (sala < 1 || sala > this.salas.size() || funcion < 1 || funcion > 3) {
            return "¡Sala o función no válida!";
        }
        int index = (sala - 1) * 3 + funcion - 1;
        return this.salas.get(index).mostrarEstadoAsientos();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
