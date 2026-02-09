/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOrdinario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {
    
    public void menuGestionProfesor() throws OpcionInvalidaException{
        int op;
        System.out.println("\n--- MENÚ Gestion de profesores ---");
        System.out.println("1. Registrar profesores");
        System.out.println("2. Consultar profesores");
        System.out.println("3. Editar informacion de profesores.");
        System.out.println("4. Eliminar profesores informacion de profesores.");
        System.out.println("0. Salir");
        System.out.println("Elige una opción: ");
        Scanner sc = new Scanner(System.in);
        try {
            op = sc.nextInt();

            if (op < 0 || op > 4) {
                throw new OpcionInvalidaException("️ Opción fuera de rango. Intente nuevamente.");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Error:"+ e.getMessage());
            sc.nextLine(); // limpiar buffer
            op = -1;
        }
        sc.nextLine();
        Consultas consulta = new Consultas();
        Funciones funcion = new Funciones();
        switch(op){
            case 1:
                funcion.registrarProfesor();
                break;
            case 2:   
                consulta.consultarProfesores();
                break;
            case 3:
                consulta.editarProfesor();
                break;
                
        }
        while(op != 0);
    }
    
    public void registrarProfesor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- ALTA DE PROFESOR ---");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        
        System.out.print("Correo: ");
        String correo = sc.next();
        sc.nextLine();

        System.out.print("Teléfono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        Profesor p = new Profesor(nombre, apellido, correo, telefono);
        System.out.println("✅ Profesor registrado con ID: " + p.getId());
        
        Consultas consulta = new Consultas();
        consulta.insertarProfesorBD(p);
        
    }
    


}