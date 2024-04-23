import java.util.ArrayList;

class Asiento {
    private boolean reservado;

    public Asiento() {
        this.reservado = false;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        if (!reservado) {
            this.reservado = true;
            System.out.println("¡Asiento reservado con éxito!");
        } else {
            System.out.println("¡Lo sentimos, ese asiento ya se encuentra reservado!");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            this.reservado = false;
            System.out.println("¡Reserva cancelada con éxito!");
        } else {
            System.out.println("¡El asiento seleccionado no tiene reserva, cancelación inválida!");
        }
    }

    @Override
    public String toString() {
        return "[" + (reservado ? "X" : " ") + "]";
    }
}
