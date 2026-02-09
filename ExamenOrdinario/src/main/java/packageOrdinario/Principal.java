/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package packageOrdinario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jesusito
 */
public class Principal {

    public static void main(String[] args) throws OpcionInvalidaException {

        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Gestion de profesores");
            System.out.println("2. Gestion de alumnos");
            System.out.println("3. Asignación tutor–alumno.");
            System.out.println("0. Salir");
            System.out.println("Elige una opción: ");
            
            try {
                op = sc.nextInt();

                if (op < 0 || op > 3) {
                    throw new OpcionInvalidaException("️ Opción fuera de rango. Intente nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println(" Error:"+ e.getMessage());
                sc.nextLine(); // limpiar buffer
                op = -1;
            }
            sc.nextLine(); 
            Funciones funcion= new Funciones();
            switch(op){
                case 1:
                    
                    funcion.menuGestionProfesor();
                    break;
                case 2:
                    funcion.menuGestionAlumno();
                    break;
                //AQUI VA EL TERCER CASO
                    
            }
            
        }
        while(op != 0);

    }
}
