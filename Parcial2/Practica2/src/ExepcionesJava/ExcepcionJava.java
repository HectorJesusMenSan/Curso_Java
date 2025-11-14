/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExepcionesJava;

/**
 *
 * @author sc03m14
 */
public class ExcepcionJava {
    //Atributos
    //Constructores
    //Metodos
    public void accesoFueraDeRango(){
        int[ ] numeros = {1, 2,  3};
        System.out.println(numeros[5]); //Indice fuera de rango 
    }
    
    public void referenciaNula(){
        String texto = null;
        System.out.println(texto.length());//Parametro nullo 
    }
    
    public void formatoNumeroInvalido(){
        String numero = "abc";
        int valor = integer.parseint(numero); //Conversion invalida
        System.out.println("Valor covertido:  " + valor);
    }
    
}
