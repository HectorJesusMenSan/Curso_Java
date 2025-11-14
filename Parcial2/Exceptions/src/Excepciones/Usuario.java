/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author sc03m14
 */
public class Usuario {
    
    public static void validarEdad(int edad) throws ExeptionInvalid{
        if (edad<0){
            throw new ExepionInvalid("La edad no puede ser negativa");
        }
        else if(edad < 18){
            throw new ExeptionInvalid("La edad debe ser mayor a 18")
        }
        else{
            System.out.println("Edad valida "+ edad);
        }
        
    }
    
}
