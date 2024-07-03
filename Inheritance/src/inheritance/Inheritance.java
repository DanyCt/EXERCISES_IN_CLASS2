/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author User
 */
public class Inheritance {

    public static void main(String[] args) {
     //objeto
     Fruit oranje = new Fruit();
     // llamar a un metodo propio de Apple
      oranje.getClass();
      oranje.getFlavor();
      oranje.getShape();
      
      
      //objeto
      Apple black = new Apple();
      //llamamos a los metodos
      black.getTexture();
      black.getCoding_Apple1();
      
      
      //objeto
      Pear tables = new Pear();
      //llamamos a los metodos
      tables.getColor2();
    }
    
    
    
}
