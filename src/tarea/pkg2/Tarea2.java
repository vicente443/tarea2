/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2;

import java.util.Scanner;

/**
 *
 * @author chent
 */

public class Tarea2 {
public static int num=0;
    /**
     * @param args the command line arguments
     */
 public static void leeernum(){
      Scanner ingresa= new Scanner(System.in);
      System.out.println("ingrese un numero ");
     num=ingresa.nextInt();
    
} 
 public static void validar(){
 
  if (num>=1 && num <=7) {
  switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("lunes ");
                break;
            case 3:
                System.out.println("martes ");
                break;
            case 4:
                System.out.println("miercoles");
                break; 
            case 5:
                System.out.println("jueves ");
                break; 
          case 6:
                System.out.println("viernes ");
                break;   
               case 7:
                System.out.println("sabado");
                break;   
        }             
 }else {
 System.out.println("es incorrecto");    
    
    }
     
    
} 
 
    public static void main(String[] args) {
 
//         TODO code application logic here
        System.out.println("1.- Crear un menú del 1 al 5 con opciones de acciones  se lea un valor de tipo int y se proceso algún mensaje.");
        int menu=0;
        System.out.println("menú de inicio ");
        Scanner ingresa= new Scanner(System.in);
  
         System.out.println("ingrese el numero seleccionado");
        menu=ingresa.nextInt();
                
        switch (menu){
            case 1:
                System.out.println("Nuevo documento");
                break;
            case 2:
                System.out.println("Abrir documento ");
                break;
            case 3:
                System.out.println("Guardar ");
                break;
            case 4:
                System.out.println("guardar como");
                break; 
            case 5:
                System.out.println("salir ");
                break;    
        }
 System.out.println("2.-Crear un menú del 1 al 5 con opciones de acciones  se lea un valor de tipo string " );
 String acciones="";
 System.out.println("Escriba una de las acciones: correr, saltar, dormir, comer, estudiar " );
  acciones=ingresa.next();
 switch (acciones){
            case "correr":
                System.out.println("Debes de correr 1km al dia");
                break;
            case "saltar":
                System.out.println("Saltar durante 3hrs");
                break;
            case "dormir":
                System.out.println("Dormir 8 hrs diarias ");
                break;
            case "comer":
                System.out.println("Comer 3 veces al dia ");
                break; 
            case "estudiar":
                System.out.println("Estudiar para tus examenes");
                break;    
        } 
  System.out.println("3.-leer un valor de 1  al 24 validar e imprimir la acción que realiza en su horario." );
  int hora = 0;
  System.out.println("ingrese un valor del 1 al 24");
  hora=ingresa.nextInt();
 
  switch (hora){
            case 7:
                System.out.println("Clase de administracion ");
                break;
            case 8:
                System.out.println("Clase de herrmientas");
                break;              
            case 9,10:
                System.out.println("Clase de algebra lineal");
                 break;
            case 11,12:
                System.out.println("Clase de organizacion");   
                break;
            case 13,14:
               System.out.println("Clase de fisica"); 
                break;
            case 15,16:
               System.out.println("almorzar y bañarse"); 
               break;
            case 17,18,19:
             System.out.println("realizar tareas y deberes");   
             break;
            case 20,21:
             System.out.println("terminar tareas y cenar");
             break;
            case 22,23,24,1,2,3,4,5:
                 System.out.println("dormir");   
                break;
        }  
  
System.out.println("Tarea 4"); 
         leeernum();
         validar();
    }
    
}
