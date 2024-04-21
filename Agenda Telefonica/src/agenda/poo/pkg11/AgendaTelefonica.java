package agenda.poo.pkg11;

public class AgendaTelefonica {

    private Contacto[] contactos;

    // Constructor sin parámetros
    public AgendaTelefonica() {
        this.contactos = new Contacto[10];
    }

    // Constructor con parámetro de tamaño
    public AgendaTelefonica(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public void aniadirContaco(Contacto c) {

        if (existeContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }

        }

    }

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;

    }

    public void listarContactos() {

        if (huecosLibre() == contactos.length) {
            System.out.println("No hay contactos que mostrar");
        } else {

            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println(contactos[i]);
                }
            }

        }

    }

    public void buscarPorNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Su teléfono es " + contactos[i].getTelefono());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }

    }

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }

        return true;
    }

    public void eliminarContacto(Contacto c) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
        }

    }

    public int huecosLibre() {
        int contadorLibres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorLibres++;
            }
        }
        return contadorLibres;
    }

}
