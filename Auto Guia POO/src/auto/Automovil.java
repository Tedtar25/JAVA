package auto;

/**
 * Clase que representa un automóvil.
 * Contiene métodos y atributos relacionados con un automóvil.
 * 
 * author Cesar Carrillo
 */
public class Automovil {
    private String color;
    private String marca;
    
    // Constructor de la clase Automovil
    public Automovil(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }
    
    // Método para acelerar
    public void acelerar(){
        System.out.println("El auto marca " + this.marca + " está acelerando.");
    }
    
    // Método para frenar
    public void frenar(){
        System.out.println("El auto está frenando.");
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método toString para mostrar la información del automóvil
    @Override
    public String toString() {
        return "Automovil{" + "color=" + color + ", marca=" + marca + '}';
    }
}
