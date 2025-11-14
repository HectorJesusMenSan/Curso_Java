/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExepcionesJava;

/**
 *
 * @author sc03m14
 */
public class Principal {
    public static void main(String[] args){
        
        ExcepcionJava excepcion = new ExcepcionJava();
        try {
            excepcion.accesoFueraDeRango();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:  Indce fuera de rango");
        }
        
        
        try{
            excepcion.referenciaNula();
        } catch (NullPointerException e){
            System.out.println("Error Formato de numero invalido.");
        }
        
    }
    
    /*Hacer 0 exepciones estandar de java,  selecionando de la losta en el archivo  "Pricipales clases dde exepciones", seccion B*/
}
