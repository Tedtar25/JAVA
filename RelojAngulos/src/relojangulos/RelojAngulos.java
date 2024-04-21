/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relojangulos;

import java.util.Scanner;

/**
 *
 * @author Cesar Carrillo
 */
public class RelojAngulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn=new Scanner(System.in);
        boolean salir=false;
        boolean lectura=false;
        double resultado;
        
        
        do{
            System.out.println("Selecciona en base a las siguientes opciones.");
            System.out.println("Opcion 1: Ver el tutorial.");
            System.out.println("Opcion 2: Determinar un angulo.");
            System.out.println("Opcion 3: Salir del programa.");
        
             int opcion1=sn.nextInt();
      
        
            
             switch(opcion1){
                case 1:
                    tutorial();
                    lectura=true;
                break;
                
                case 2:
                    if (lectura) {
                        
                        instrucciones1();
                        int opcion2=sn.nextInt();
                        System.out.println("Escribe la hora y luego los minutos.");
                        int hora=sn.nextInt();
                        double minutos=sn.nextDouble();
                        if(opcion2==1){
                            if(horasMinutos(hora,minutos)<180){
                               System.out.println("El angulo es "+horasMinutos(hora, minutos)+"°"); 
                            }else{
                                resultado=(360-horasMinutos(hora, minutos));
                                System.out.println("El angulo es "+resultado+"°");
                            }
                            
                        }else if(minutosHoras(hora, minutos)<180){
                            System.out.println("El angulo es "+minutosHoras(hora, minutos)+"°");   
                        }else{
                           resultado=(360-minutosHoras(hora, minutos));
                           System.out.println("El angulo es "+resultado+"°"); 
                        }
                        
                    } else {
                        System.out.println("Debes leer primero el tutorial.");
                        System.out.println();
                    }
                break;
                
                case 3:
                    salir=true;
                break;
                default:
                System.out.println("Selecciona una opcion valida utilizando el numero.");
                System.out.println("");
            }
                
        }while (!salir);
        
    }
    
    public static void tutorial(){
        System.out.println("");
        System.out.println("Que tal usuario, vamos a sacar el angulo formado por las manecillas de un reloj.");
        System.out.println("Estas instrucciones son para que pueda escoger la ecuacion correcta.");
        System.out.println("");
        System.out.println("El reloj tiene dos manecillas, el minutero y el horario. Tambien ten en cuenta que la manecilla del horario se mueve y no es fija.");
        System.out.println("Ahora divide el circulo del reloj en 2, es decir, el lado derecho de 0 min/12hrs a 30min/6hrs.");
        System.out.println("Y el lado izquierdo de 31 min/6hrs a 59 min/12 hrs.");
        System.out.println("");
        System.out.println("Bien, ahora fijate en los siguientes ejemplos de horas.");
        System.out.println("15:00/3:00 - Aqui el horario se encuentra delante del minutero.");
        System.out.println("18:30/6:30 - Aqui el horario se encuentra delante del minutero.");
        System.out.println("En el ejemplo anterior recuerda que al dar las 18:00/6:00 las manecilla del minutero se encuentra arriba y la del horario se encuentra abajo.");
        System.out.println("Pero al avanzar el minutero tambien lo hara la del horario.");
        System.out.println("");
        System.out.println("Bien, ahora fijate en estos otros ejemplos de horas.");
        System.out.println("16:45/4:45 - Aqui el minutero se encuentra delante del horario.");
        System.out.println("20:59/8:59 - Aqui el minutero se encuentra delante del horario.");
        System.out.println("");
        System.out.println("Ahora, hay casos como que el reloj marque 13:45/1:45 - Aqui se toma como que el horario se encuentra detras del minutero.");
        System.out.println("");
        System.out.println("Ese es todo el tutorial, ahora ya sabras como seleccionar la opcion correcta para determinar el angulo entre las manecillas del reloj.");
        System.out.println("Tambien ten en cuenta que si el angulo te da 270° es quivalente a tener 360°-270°=90°.");
        System.out.println("");
    }
    
    public static void instrucciones1(){
        System.out.println("Basado en el tutorial, selecciona la opcion.");
        System.out.println("Opcion 1: La manecilla del horario esta adelnate del minutero.");
        System.out.println("Opcion 2: La manecilla del minutero esta adelante del horario.");
    }
    
    public static double minutosHoras(int hora, double minutos){
        double resultado;
        resultado=((5.5*minutos)-(30*hora));
        return resultado;
    }
    
    public static double horasMinutos(int hora, double minutos){
        double resultado;
        resultado=((30*hora)-(5.5*minutos));
        return resultado;
    }
    
}
