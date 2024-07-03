/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

    import java.util.Scanner;
public class prueba3_1 {

     public static void main(String[] args) {
        // Definir las jugadas. Usaremos matrices para las jugadas
        char[][] jugadas = {
            {'R', 'S'},
            {'S', 'R'},
            {'P', 'S'}
        };

        int jugador1 = 0;
        int jugador2 = 0;

        // Iterar sobre las jugadas
        for (int i = 0; i < jugadas.length; i++) {
            char jugador1Jugada = jugadas[i][0];
            char jugador2Jugada = jugadas[i][1];

            if (jugador1Jugada == jugador2Jugada) {
                // Empate, no sumamos puntos
            } else if ((jugador1Jugada == 'R' && jugador2Jugada == 'S') ||
                       (jugador1Jugada == 'P' && jugador2Jugada == 'R') ||
                       (jugador1Jugada == 'S' && jugador2Jugada == 'P')) {
                jugador1++;
            } else {
                jugador2++;
            }
        }

        // Determinar el resultado
        if (jugador1 > jugador2) {
            System.out.println("Player 1");
        } else if (jugador2 > jugador1) {
            System.out.println("Player 2");
        } else {
            System.out.println("Tie");
        }
    }
}
