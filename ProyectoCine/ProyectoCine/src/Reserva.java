public class Reserva {
    public static void main(String[] args) {
        // Crear un cine con 4 salas y 3 funciones por sala
        Cine cine = new Cine(4, 3, 8, 8);

        // Mostrar las funciones disponibles
        System.out.println("Funciones disponibles:");
        System.out.println("1. 10:00 am");
        System.out.println("2. 2:00 pm");
        System.out.println("3. 7:00 pm");

        // Mostrar las películas en cada sala
        System.out.println("Las funciones de hoy son:");
        System.out.println("Sala 1: Titanic");
        System.out.println("Sala 2: Star Wars");
        System.out.println("Sala 3: John Wick");
        System.out.println("Sala 4: El Hobbit");

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Reservar asiento");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar estado de los asientos en una sala");
            System.out.println("4. Salir");
            opcion = Cine.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    int sala = Cine.leerEntero("Ingrese el número de sala: ");
                    int funcion = Cine.leerEntero("Ingrese la función a la que desea asistir: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }
                    int fila = Cine.leerEntero("Ingrese la fila del asiento: ");
                    int columna = Cine.leerEntero("Ingrese la columna del asiento: ");

                    cine.reservarAsiento(sala, funcion, fila, columna);

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 2:
                    sala = Cine.leerEntero("Ingrese el número de sala: ");
                    funcion = Cine.leerEntero("Ingrese la función: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }
                    fila = Cine.leerEntero("Ingrese la fila del asiento: ");
                    columna = Cine.leerEntero("Ingrese la columna del asiento: ");

                    cine.cancelarReservaAsiento(sala, funcion, fila, columna);

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 3:
                    sala = Cine.leerEntero("Ingrese el número de sala: ");
                    funcion = Cine.leerEntero("Ingrese la función: ");
                    if (sala < 1 || sala > 4 || funcion < 1 || funcion > 3) {
                        System.out.println("¡Sala o función no válida!");
                        break;
                    }

                    // Mostrar el estado de los asientos en la sala seleccionada
                    System.out.println("Estado de los asientos en la sala " + sala + ", función " + funcion + ":");
                    System.out.println(cine.mostrarEstadoAsientosSala(sala, funcion));
                    break;
                case 4:
                    System.out.println("¡Gracias por utilizar nuestro servicio!");
                    break;
                default:
                    System.out.println("¡Opción no válida!");
            }
        } while (opcion != 4);
        
        // Reservar un asiento mediante la función, la sala, la fila y la columna
        cine.reservarAsiento(1, 1, 2, 3);
        System.out.println("Estado de los asientos en la sala 1, función 1:");
        System.out.println(cine.mostrarEstadoAsientosSala(1, 1));

        // Cancelar la reservación de un asiento mediante la función, la sala, la fila y la columna
        cine.cancelarReservaAsiento(1, 1, 2, 3);
        System.out.println("Estado de los asientos en la sala 1, función 1:");
        System.out.println(cine.mostrarEstadoAsientosSala(1, 1));

        // Reservar un asiento que ya ha sido reservado con anterioridad
        cine.reservarAsiento(1, 1, 2, 3);
        cine.reservarAsiento(1, 1, 2, 3);
        System.out.println("Estado de los asientos en la sala 1, función 1:");
        System.out.println(cine.mostrarEstadoAsientosSala(1, 1));

        // Cancelar la reservación de un asiento que se encuentra disponible
        cine.cancelarReservaAsiento(1, 1, 2, 3);
        System.out.println("Estado de los asientos en la sala 1, función 1:");
        System.out.println(cine.mostrarEstadoAsientosSala(1, 1));
    }
}
