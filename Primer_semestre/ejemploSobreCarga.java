/*
En este proyecto se ven los pricipios basicpos de el lenguaje java
y el cocepto de la sobrecarga.
 */
package ptueba1;

import java.util.Scanner;
/**
 *
 * @author sc03m14
 */
public class Ptueba1 {
    //Se declaran atributos y metodos
    //------------A T R I B U T O S--------------------
    private String nombre;
    private int edad;
    
    
    //-------------M E T O D O S---------------------
    public void mostrarInfomacion(){
        System.out.println("Hola mundo");       //pintln:Saltarlinea   print:escrbir
    }
    //Metodos de acceso
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Metodo para sobrecarga
    public void mostrarInfomacion(String nombre){
        System.out.println("Hola al mundo de: "+nombre);       //pintln:Saltarlinea   print:escrbir
    }
    

    /**
     * @param args the command line arguments
     */
    
    //----------------------------M A I N ---------------------------
    public static void main(String[] args) {
        Ptueba1 proyecto1 = new Ptueba1 ();
        proyecto1.mostrarInfomacion();
        System.out.println(proyecto1.getEdad());
        System.out.println(proyecto1.getNombre());
       
            //Declaracion de variables y entrada de consola
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa nombre: ");
        nombre = entrada.nextLine();
        
            //Meter datos en objetos
        proyecto1.setEdad(3);
        proyecto1.setNombre("Albelto");
        System.out.println("Edad: "+proyecto1.getEdad());
        System.out.println("Nombre: "+proyecto1.getNombre());
        
        proyecto1.setNombre(nombre);
        System.out.println("Nuevo Nombre: "+proyecto1.getNombre());
        
        proyecto1.mostrarInfomacion(nombre);
    }
    
}
