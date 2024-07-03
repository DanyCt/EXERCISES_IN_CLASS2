/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Condicional_1 {
    
     public static void main(String [ ] args){
     Scanner sn= new Scanner(System.in);
     
     System.out.println("Inserta un numero entero");
     int num;
     do{
         num=sn.nextInt();
         if(num<=1){
             System.out.println("Error");
         }
     }while(num<=1);
     int suma=0;
     for(int contador=1;contador<=num;contador++){
         suma+=contador;
       }
           System.out.println("La suma: "+suma);
     }
    
}
