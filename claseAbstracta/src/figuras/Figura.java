/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

/**
 *
 * @author sc03m14
 */    //Se define clase abstracta
public abstract class Figura {

    private String color;
    
    //Metodos abstractos
    abstract void dibujar();
    
    //Metodo no abstracto
    void establecerColor(String color){
        System.out.println("color: " + color);
    }
    
}
