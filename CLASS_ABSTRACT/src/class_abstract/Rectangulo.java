/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_abstract;
 
public class Rectangulo extends Figura {
        //atributo propio
    private double lado;
    
    //CONSTRUCTOR VACIO
    public Rectangulo(){
    }

    //CONSTRUCTOR CON PARAMETROS
    
   //atributos heredados en su constructor de su madre figura
    
    public Rectangulo(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
    
    //metodo abstracto de su mama Figura
    @Override
    public double calcularArea() {
      double result = lado * lado;
      return result;
    }
    
}
