/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.*;
public class prueba2 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number for the ladder: ");
        int ladder = number.nextInt();
        if (ladder < 0){
            ladder = ladder * -1;
            for (int i=0; i<= ladder; i++){
                System.out.println("|_");
                for (int j=0; j<=i; j++){
                    System.out.print("  ");
              }
            }
        }else if(ladder > 0){
            for(int i=ladder; i>=0; i--){
                for(int j=0; j<=i; j++){
                System.out.print("  ");
                }
               System.out.println("_|");
            }
            System.out.println("_|");
        }else {
             System.out.println("__");
        }  
    } 
}