/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.*;

public class prueba4 {
    public static void main(String[] args) {
        int [] Robot ={-10, -5, 2};
        int LocationX = 0;
        int LocationY = 0;
        boolean PositiveSymbolX = false;
        boolean PositiveSymbolY = true;
        
        for (int i=0 ; i<=Robot.length-1 ; i++){
                if (i % 2 == 0) {
                    if (PositiveSymbolY){
                        LocationY = (LocationY - Robot[i]);
                        PositiveSymbolY = false;
                    } else {
                        LocationY = (LocationY + Robot[i]);
                        PositiveSymbolY = true;
                    }
                } else {
                    if (PositiveSymbolX){
                        LocationX = (LocationX - Robot[i]);
                        PositiveSymbolX = false;
                    } else {
                        LocationX = (LocationX + Robot[i]);
                        PositiveSymbolX = true;
                    }
                }
        }
        System.out.println("( " + LocationX + ", " + LocationY + " )");
    }
}
