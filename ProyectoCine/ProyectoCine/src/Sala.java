import java.util.ArrayList;

class Sala {
    private ArrayList<ArrayList<Asiento>> asientos;

    public Sala(int filas, int columnas) {
        this.asientos = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            ArrayList<Asiento> filaAsientos = new ArrayList<>();
            for (int j = 0; j < columnas; j++) {
                filaAsientos.add(new Asiento());
            }
            this.asientos.add(filaAsientos);
        }
    }

    public void reservarAsiento(int fila, int columna) {
        this.asientos.get(fila).get(columna).reservar();
    }

    public void cancelarReservaAsiento(int fila, int columna) {
        this.asientos.get(fila).get(columna).cancelarReserva();
    }

    public String mostrarEstadoAsientos() {
        StringBuilder estado = new StringBuilder();
        for (ArrayList<Asiento> fila : this.asientos) {
            for (Asiento asiento : fila) {
                estado.append(asiento.toString());
            }
            estado.append("\n");
        }
        return estado.toString();
    }
}
