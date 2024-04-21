package agenda.poo.pkg11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendaPOO11 {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner (System.in);
        sn.useDelimiter("\n");
        boolean salir=false;
        int opcion; // Guardaremos la opción del usuario
        
        // Crear una instancia de la clase AgendaTelefonica
        AgendaTelefonica agenda1=new AgendaTelefonica(5);
        String nombre;
        int telefono;
        
        Contacto c;
        
        
        while(!salir){
            
            // Menú de opciones
            System.out.println("1.- Añadir contacto");
            System.out.println("2.- Listar contactos");
            System.out.println("3.- Buscar contacto");
            System.out.println("4.- Existe contacto");
            System.out.println("5.- Eliminar contacto");
            System.out.println("6.- Contactos disponibles");
            System.out.println("7.- Agenda llena");
            System.out.println("8.- Salir");
            try{
                
                System.out.println("Escribe una de las opciones");
                opcion=sn.nextInt();
                
                switch(opcion){
                    case 1:
                        
                        System.out.println("Añade un nombre");
                        nombre=sn.next();
                        System.out.println("Escribe un teléfono");
                        telefono=sn.nextInt();
                        
                        c = new Contacto(nombre, telefono);
                        agenda1.aniadirContaco(c);
                        
                        break;
                    case 2:
                        
                        agenda1.listarContactos();
                        
                        break;
                    case 3:
                        
                        System.out.println("Escribe un nombre");
                        nombre=sn.next();
                        
                        agenda1.buscarPorNombre(nombre);
                        
                        break;
                    case 4:
                        
                        System.out.println("Escribe un nombre");
                        nombre=sn.next();
                        
                        c=new Contacto(nombre, 0);
                        
                        if(agenda1.existeContacto(c)){
                            System.out.println("Existe contacto");
                        }else{
                            System.out.println("No existe contacto");
                        }
                        
                        break;
                    case 5:
                        
                        System.out.println("Escribe un nombre");
                        nombre=sn.next();
                        
                        c=new Contacto(nombre, 0);
                        
                        agenda1.eliminarContacto(c);
                        
                        break;
                    case 6:
                        
                        System.out.println("Hay " +agenda1.huecosLibre()+ " contactos libres");
                        
                        break;
                    case 7:
                        
                        if(agenda1.agendaLlena()){
                            System.out.println("La agenda está llena");
                        }else{
                            System.out.println("Aun se puede agregar contactos");
                        }
                        
                        break;
                    case 8:
                        salir=true;
                        break;
                    default:
                        System.out.println("Selecciona una opción listada");
                        
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            }
            
        }
        
    }
    
}