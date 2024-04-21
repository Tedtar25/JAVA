package agenda.poo.pkg11;

public class Contacto {

    private String nombre;
    private int telefono;

    // Constructor que toma nombre y teléfono
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Constructor que toma solo el nombre (el teléfono se inicializa en 0)
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Método equals que compara si dos contactos tienen el mismo nombre
    public boolean equals(Contacto c) {
        if (this.nombre.equalsIgnoreCase(c.getNombre())) {
            return true;
        }
        return false;
    }

    // Método toString para mostrar el nombre y el teléfono del contacto
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }

}