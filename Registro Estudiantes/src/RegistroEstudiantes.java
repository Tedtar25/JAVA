/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
public class RegistroEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        //Crear datos de los estudiantes
        Estudiante estudiante1 = new Estudiante("Maria", "Torres", "Ingeniería", 8.5);
        Estudiante estudiante2 = new Estudiante("Pablo", "Gonzalez", "Contaduria");

        //Agregar una escuela
        Escuela agendaEscolar = new Escuela();

        // Agrar los estudiantes
        agendaEscolar.añadirEstudiante(estudiante1);
        agendaEscolar.añadirEstudiante(estudiante2);

        //Imprimri el resultado
        agendaEscolar.listarEstudiantes();
    }
    
}
