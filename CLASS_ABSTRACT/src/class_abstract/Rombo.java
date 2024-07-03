/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_abstract;
 
public class Rombo extends Figura{
//atributo propio
    private double radio;
    
    
     //CONSTRUCTOR VACIO
    public Rombo(){
    }

      //CONSTRUCTOR CON PARAMETROS
    
   //atributos heredados en su constructor de su madre figura
    public Rombo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    
    //metodo abstracto de su mama Figura
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double result = pi*radio*radio;
        return result;
    }
    
}
