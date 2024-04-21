/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cesar Carrillo
 */
public class Escuela {
    private Estudiante[] estudiantes;
    private int numEstudiantes;

    // Constructor
    public Escuela() {
        this.estudiantes = new Estudiante[10];
        this.numEstudiantes = 0;
    }

    // Método para aniadir un estudiante
    public void añadirEstudiante(Estudiante estudiante) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
        } else {
            System.out.println("No se puede añadir más estudiantes.");
        }
    }

    // Método para listar estudiantes
    public void listarEstudiantes() {
        if (numEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados en la escuela.");
        } else {
            System.out.println("Lista de estudiantes:");
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println(estudiantes[i].toString());
            }
        }
    }
}
