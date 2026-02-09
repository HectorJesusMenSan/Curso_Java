/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParaExamen2;

/**
 *
 * @author sc03m14
 */
// Clase que representa una persona,
public class Persona implements Imprimible {
      //Atrubutos
    private String nombre;
    private int edad;
    private String correo;
    //Constructr
    public Persona(String nombre, int edad, String correo) throws EdadInvalidaException, CorreoInvalidoException {
        this.nombre = nombre;
        //Si el correo no tiene @ o .
        if (!correo.contains("@") || !correo.contains(".")) {                       //Funcion para buscar palabras dentro de cadena
            throw new CorreoInvalidoException("Correo no válido.");
        }
        else{
            this.correo = correo;
        }
        
        if (edad < 0 || edad > 90) {
            throw new EdadInvalidaException("Edad incorrecta: " + edad);
        }
        else{
            this.edad = edad;
        }
        
        
    }
    public Persona(){
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- Datos de Persona ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }
}