/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_abstract;
 //clase abstracta
public abstract class Figura {
    
    
    //protected: El campo o método es visible en la clase en donde se define y en cualquiera de sus subclases.
    //atributos propios
    protected double x;
    protected double y;
    
    //Las clases hijas puedes crear constructores y si se pueden instancear
    //Las clases abstractas no se pueden instancear
    //CONSTRUCTOR VACIO
    public Figura(){
    }
    
    //CONSTRUCTOR CON PARAMETROS
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    //metodo abstracto que van usar sus hijas
    
    public abstract double calcularArea();
    
     
}
