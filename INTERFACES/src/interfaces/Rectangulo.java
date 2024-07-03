/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;
 //AKI SE IMPLEMENTA MAS INTERFACES CREADAS Y ASI MISMO SE CREARAB METODOS
public class Rectangulo implements Figura, DIblujable{

    
    //Atributo
    private double lado;
    
    //CONSTRUCTOR VACIO
    public Rectangulo(){
    }
    
    //CONSTRUCTOR CON PARAMETROS
    public Rectangulo(double lado){
        this.lado = lado;
    }
    
    //METODO IMPLEMENTADO Y ADAPTADO DE FIGURA PARA HACE OPERACIONES 
    @Override
    public double calcularArea() {
        double rault = lado*lado;
        return rault;
    }

    //INTERFACES CREADAS POR IMPLEMETS AL AGREGAR INTERFACES
    @Override
    public void DIblujable() {
       System.out.println("hola dibu rectangulo");
    }
    
}
