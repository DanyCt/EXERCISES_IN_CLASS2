/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;


//Una clase: es una plantilla que define la forma de un objeto. Especifica los datos y el código que operará en esos datos.
//private: El campo o método sólo es visible dentro de la clase donde se define
//public: El campo o método es visible en cualquier clase.
//void: es una palabra reservada que especifica que una función no retorna un valor. Función con tipo de retorno nulo (void). También se dice que es una función sin tipo de retorno.
//Static: es una variable que existe por la clase y cuyo valor asignado puede ser accedido sin necesidad de que exista un objeto de la clase.
//Atributos: son variables que pertenecen a una clase y representan las características o propiedades que describen el estado de un objeto.
//Constructores: sirve para inicializar el objeto y establecer sus propiedades y valores predeterminados
//this: indicamos que pertenece a la misma clase.
//Super: nos permite indicar que una variable o método pertenece a la clase padre
//Get: es para presentar el dato
//Set: es para introducir el dato.
//herencia: es una característica de este lenguaje de programación que permite que una clase padre transfiera sus funciones y sus atributos a clases hijas.
//clase abstracta: es una clase de la cual no se pueden definir (o construir) instancias (u objetos)
//interfaz: solo declara métodos relacionados con cuerpos vacios, pero no proporciona implementaciones para ellos


public class Apple extends Fruit{
    
    //Atributos propios
    int coding_Apple1;
    String Color1;
    String Texture1;
    Double num_Apples1;

    
    //Constructor vacio    
    public Apple(){
    }
    
    
     //Constructores con parametros

    public Apple(int coding_Apple1, String Color1, String Texture1, Double num_Apples1, String Name, String Color, String Texture, String Shape, String Flavor) {
        super(Name, Color, Texture, Shape, Flavor); //Super nos permite indicar que una variable o método pertenece a la clase padre
        this.coding_Apple1 = coding_Apple1;
        this.Color1 = Color1;                  //con this indicamos que pertenece a la misma clase.
        this.Texture1 = Texture1;
        this.num_Apples1 = num_Apples1;
    }

    
    /*
    Get y set son prácticos para el acceso a propiedades de los objetos que resultan de computar otras propiedades que ya existen
    */
    
    public int getCoding_Apple1() {   //Get es para presentar el dato
        return coding_Apple1;
    }

    public void setCoding_Apple1(int coding_Apple1) {  //Set, es para introducir el dato.
        this.coding_Apple1 = coding_Apple1;
    }

    public String getColor1() {
        return Color1;
    }

    public void setColor1(String Color1) {
        this.Color1 = Color1;
    }

    public String getTexture1() {
        return Texture1;
    }

    public void setTexture1(String Texture1) {
        this.Texture1 = Texture1;
    }

    public Double getNum_Apples1() {
        return num_Apples1;
    }

    public void setNum_Apples1(Double num_Apples1) {
        this.num_Apples1 = num_Apples1;
    }

   
     
    
}
