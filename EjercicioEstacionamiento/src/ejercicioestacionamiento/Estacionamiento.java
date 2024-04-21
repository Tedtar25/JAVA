package ejercicioestacionamiento;

/**
 * Clase que representa un estacionamiento.
 */
public class Estacionamiento {
    private Vehiculo[][] espacios;
    private double precioPorHora;

    public Estacionamiento(int filas, int columnas) {
        espacios = new Vehiculo[filas][columnas];
        this.precioPorHora = 10.0; // Tarifa de 10 pesos, no somos careros
    }

    public void ingresarAuto(char fila, int columna, int horaIngreso) {
        int indiceFila = fila - 'A'; // Convertir letra a índice de fila
        if (indiceFila >= 0 && indiceFila < espacios.length && columna >= 1 && columna <= espacios[0].length) {
            if (espacios[indiceFila][columna - 1] == null) {
                espacios[indiceFila][columna - 1] = new Vehiculo(horaIngreso);
                System.out.println(
                        "Auto estacionado en la fila " + fila + " y columna " + columna + " a las " + horaIngreso + " horas.");
            } else {
                System.out.println("El espacio ya está ocupado.");
            }
        } else {
            System.out.println("Ubicación fuera de rango.");
        }
    }

    public double sacarAuto(char fila, int columna, int horaSalida) {
        int indiceFila = fila - 'A';
        if (indiceFila >= 0 && indiceFila < espacios.length && columna >= 1 && columna <= espacios[0].length) {
            if (espacios[indiceFila][columna - 1] != null) {
                int horaIngreso = espacios[indiceFila][columna - 1].getHoraIngreso();
                int horasEstacionado = horaSalida - horaIngreso;
                double costoTotal = calcularCosto(horasEstacionado);
                System.out.println("Auto sacado de la fila " + fila + " y columna " + columna + ". Estuvo estacionado por "
                        + horasEstacionado + " horas.");
                espacios[indiceFila][columna - 1] = null;
                return costoTotal;
            } else {
                System.out.println("No hay auto estacionado en ese espacio.");
            }
        } else {
            System.out.println("Ubicación fuera de rango.");
        }
        return 0;
    }

    private double calcularCosto(int horasEstacionado) {
        // Se cobra $10 pesos por hora de estacionamiento, sin importar los minutos para no meter fracciones ni nada de eso
        return horasEstacionado * precioPorHora;
    }

    public int contarEspaciosDisponibles() {
        int count = 0;
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[i].length; j++) {
                if (espacios[i][j] == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public void mostrarEstacionamiento() {
        System.out.println("Estado del estacionamiento:");
        for (int i = 0; i < espacios.length; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < espacios[i].length; j++) {
                if (espacios[i][j] != null) {
                    System.out.print("[X]"); // X Es un espacio ocupado
                } else {
                    System.out.print("[ ]"); // Espacio vacío
                }
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 1; i <= espacios[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
