package almacen.bebidas.poo.pkg10;

public class Almacen {

    private Bebida[][] estanteria;

    // Constructor que inicializa el almacén con una estantería de 5x5
    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    // Método para agregar una bebida al almacén
    public void agregarBebida(Bebida b) {
        boolean encontrado = false;
        // Recorrer la estantería para encontrar una posición vacía
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = b;
                    encontrado = true;
                }
            }
        }
        // Mostrar un mensaje si se agregó o no la bebida
        if (encontrado) {
            System.out.println("Bebida añadida");
        } else {
            System.out.println("No se ha podido agregar la bebida");
        }
    }

    // Método para eliminar una bebida del almacén por su ID
    public void eliminarBebida(int id) {
        boolean encontrado = false;
        // Recorrer la estantería para encontrar la bebida por su ID y eliminarla
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null;
                        encontrado = true;
                    }
                }
            }
        }
        // Mostrar un mensaje si se eliminó o no la bebida
        if (encontrado) {
            System.out.println("Bebida eliminada");
        } else {
            System.out.println("No existe la bebida");
        }
    }

    // Método para mostrar todas las bebidas en el almacén
    public void mostrarBebidas() {
        // Recorrer la estantería y mostrar las bebidas no nulas
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println("Fila: " + i + ", columna: " + j + ", Bebida: " + estanteria[i][j]);
                }
            }
        }
    }

    // Método para calcular el precio total de todas las bebidas en el almacén
    public double calcularPrecioBebidas() {
        double precioTotal = 0;
        // Recorrer la estantería y sumar los precios de las bebidas no nulas
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }

    // Método para calcular el precio total de todas las bebidas de una marca específica
    public double calcularPrecioBebidas(String marca) {
        double precioTotal = 0;
        // Recorrer la estantería y sumar los precios de las bebidas de la marca especificada
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal += estanteria[i][j].getPrecio();
                    }
                }
            }
        }
        return precioTotal;
    }

    // Método para calcular el precio total de todas las bebidas en una columna específica
    public double calcularPrecioBebidas(int columna) {
        double precioTotal = 0;
        // Verificar si la columna es válida y sumar los precios de las bebidas en esa columna
        if (columna >= 0 && columna < estanteria[0].length) {
            for (int i = 0; i < estanteria.length; i++) {
                if (estanteria[i][columna] != null) {
                    precioTotal += estanteria[i][columna].getPrecio();
                }
            }
        } else {
            System.out.println("La columna debe estar entre 0 y " + (estanteria[0].length - 1));
        }
        return precioTotal;
    }
}
