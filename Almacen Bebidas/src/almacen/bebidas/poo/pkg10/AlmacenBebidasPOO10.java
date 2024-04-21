package almacen.bebidas.poo.pkg10;

public class AlmacenBebidasPOO10 {

    public static void main(String[] args) {
        // Crear un almacén con la capacidad predeterminada
        Almacen a = new Almacen();

        Bebida b;

        // Un pequeño bucle para agregar varias bebidas
        for (int i = 0; i < 10; i++) {
            switch (i % 2) {
                case 0:
                    // Crear una instancia de AguaMinera y agregarla al almacén
                    b = new AguaMinera("Manantial 1", 1.5, 5, "Fiji");
                    a.agregarBebida(b);
                    break;
                case 1:
                    // Crear una instancia de BebidaAzucarada y agregarla al almacén
                    b = new BebidaAzucarada(0.2, true, 1.5, 10, "CocaCola");
                    a.agregarBebida(b);
                    break;
            }
        }
        
        // Mostrar todas las bebidas en el almacén
        a.mostrarBebidas();

        // Calcular el precio total de las bebidas en el almacén
        System.out.println(a.calcularPrecioBebidas());

        // Eliminar una bebida del almacén por su ID
        a.eliminarBebida(4);
        
        // Mostrar las bebidas en el almacén después de eliminar una
        a.mostrarBebidas();

        // Calcular el precio total de las bebidas en el almacén después de eliminar una
        System.out.println(a.calcularPrecioBebidas());
        
        // Calcular el precio total de las bebidas de una marca específica
        System.out.println(a.calcularPrecioBebidas("cocacola"));
        
        // Calcular el precio total de las bebidas en una columna específica
        System.out.println(a.calcularPrecioBebidas(0));
    }
}
