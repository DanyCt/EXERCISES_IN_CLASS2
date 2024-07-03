/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
//AKI SE IMPLEMENTA MAS INTERFACES CREADAS Y ASI MISMO SE CREARAB METODOS
public class Rombo implements Figura, DIblujable, Rotable{

    private double radio;
    //CONSTRUCTOR VACIO
    public Rombo(){
    }
//CONSTRUCTOR CON PARAMETROS
    public Rombo(double radio) {
        this.radio = radio;
    }
    
    
    
   //METODO IMPLEMENTADO Y ADAPTADO DE FIGURA PARA HACE OPERACIONES 
    @Override
    public double calcularArea() {
        double pi=3.14;
        double result = pi * radio;
        return result;
    }
//INTERFACES CREADAS POR IMPLEMETS AL AGREGAR INTERFACES
    @Override
    public void DIblujable() {
        System.out.println("hola dibu");
    }
//INTERFACES CREADAS POR IMPLEMETS AL AGREGAR INTERFACES
    @Override
    public void Rotable() {
        System.out.println("hola dibu");
    }
    
}
