/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class Pear extends Fruit{
    //atributos propios
    int coding_Pear2;
    String Color2;
    String Texture2;
    Double num_Pear2;
    
     //Constructor vacio
    public Pear(){
    }
    
    
     //Constructores con parametros

    public Pear(int coding_Pear2, String Color2, String Texture2, Double num_Pear2, String Name, String Color, String Texture, String Shape, String Flavor) {
        super(Name, Color, Texture, Shape, Flavor);
        this.coding_Pear2 = coding_Pear2;
        this.Color2 = Color2;
        this.Texture2 = Texture2;
        this.num_Pear2 = num_Pear2;
    }

    public int getCoding_Pear2() {
        return coding_Pear2;
    }

    public void setCoding_Pear2(int coding_Pear2) {
        this.coding_Pear2 = coding_Pear2;
    }

    public String getColor2() {
        return Color2;
    }

    public void setColor2(String Color2) {
        this.Color2 = Color2;
    }

    public String getTexture2() {
        return Texture2;
    }

    public void setTexture2(String Texture2) {
        this.Texture2 = Texture2;
    }

    public Double getNum_Pear2() {
        return num_Pear2;
    }

    public void setNum_Pear2(Double num_Pear2) {
        this.num_Pear2 = num_Pear2;
    }

    
    
}
