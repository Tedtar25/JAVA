/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
public class GestionTienda {

    public static void main(String[] args) {
        // Crear objetos de Cliente
        Cliente cliente1 = new Cliente("123 Calle Principal", "Juan", "Perez", "juan@example.com");
        Cliente cliente2 = new Cliente("456 Avenida Central", "María", "López", "maria@example.com");
        Cliente cliente3 = new Cliente("789 Plaza Mayor", "Pedro", "González", "pedro@example.com");

        // Crear objetos de Proveedor
        Proveedor proveedor1 = new Proveedor("Samsung", "Pedro", "Gomez", "pedro@example.com");
        Proveedor proveedor2 = new Proveedor("Zara", "Laura", "Rodríguez", "laura@example.com");
        Proveedor proveedor3 = new Proveedor("Xiaomi", "Carlos", "Martínez", "carlos@example.com");

        // Crear objetos de Electronico
        Electronico electronico1 = new Electronico("Nuevo", "Modelo 123", "Smartphone", "Samsung", "500");
        Electronico electronico2 = new Electronico("Reacondicionado", "Modelo 456", "Tablet", "Xiaomi", "300");
        Electronico electronico3 = new Electronico("Nuevo", "Modelo 789", "Refrigerador", "Samsung", "800");

        // Crear objetos de Ropa
        Ropa ropa1 = new Ropa("XL", "Azul", "Camisa", "Nike", "30");
        Ropa ropa2 = new Ropa("M", "Negro", "Pantalón", "Adidas", "40");
        Ropa ropa3 = new Ropa("S", "Blanco", "Camiseta", "Puma", "25");

        // Cambiar algo de un producto, en este caso la condicion
        System.out.println(electronico1);
        electronico1.modificar("condicion", "Inservible");
        System.out.println(electronico1);
        System.out.println("");

        // Desactivar un producto
        System.out.println(electronico2);
        electronico2.desactivar();
        System.out.println(electronico2);
        System.out.println("");

        // Cambiar algo del usuario, en este caso el apellido
        System.out.println(cliente1);
        cliente1.modificar("apellido", "García");
        System.out.println(cliente1);
        System.out.println("");

        // Desactivar un usuario
        System.out.println(cliente2);
        cliente2.desactivar();
        System.out.println(cliente2);
        System.out.println("");

        // Crear objetos desde Operacion y realizar cambios
        Operacion<Proveedor, Producto> operacion1 = new Operacion<>("Compra de producto electrónico");
        operacion1.setUsuario(proveedor1);
        operacion1.setProducto(electronico1);
        System.out.println(operacion1.getNombreOperacion());
        System.out.println("Usuario: " + operacion1.getUsuario());
        System.out.println("Producto: " + operacion1.getProducto());
        System.out.println("");

        Operacion<Cliente, Producto> operacion2 = new Operacion<>("Compra de producto de ropa");
        operacion2.setUsuario(cliente1);
        operacion2.setProducto(ropa1);
        System.out.println(operacion2.getNombreOperacion());
        System.out.println("Usuario: " + operacion2.getUsuario());
        System.out.println("Producto: " + operacion2.getProducto());
        System.out.println("");

        Operacion<Proveedor, Producto> operacion3 = new Operacion<>("Proveedor de producto de ropa");
        operacion3.setUsuario(proveedor2);
        operacion3.setProducto(ropa2);
        System.out.println(operacion3.getNombreOperacion());
        System.out.println("Usuario: " + operacion3.getUsuario());
        System.out.println("Producto: " + operacion3.getProducto());
        System.out.println("");

        Operacion<Cliente, Producto> operacion4 = new Operacion<>("Proveedor de producto electrónico");
        operacion4.setUsuario(cliente3);
        operacion4.setProducto(electronico3);
        System.out.println(operacion4.getNombreOperacion());
        System.out.println("Usuario: " + operacion4.getUsuario());
        System.out.println("Producto: " + operacion4.getProducto());
    }
}
