/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class Fruit{
    
    String Name;
    String Color;
    String Texture;
    String Shape;
    String Flavor;
    
    //Constructor
    public Fruit(){
    }

    public Fruit(String Name, String Color, String Texture, String Shape, String Flavor) {
        this.Name = Name;
        this.Color = Color;
        this.Texture = Texture;
        this.Shape = Shape;
        this.Flavor = Flavor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTexture() {
        return Texture;
    }

    public void setTexture(String Texture) {
        this.Texture = Texture;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String Shape) {
        this.Shape = Shape;
    }

    public String getFlavor() {
        return Flavor;
    }

    public void setFlavor(String Flavor) {
        this.Flavor = Flavor;
    }
    
    
    
}
