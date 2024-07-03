/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.*;
public class prueba1 {
   public static void main(String[] args) {
        //Daniel Caizatoa
        for (int i=1 ; i <= 100 ; i++ ){
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
   }
