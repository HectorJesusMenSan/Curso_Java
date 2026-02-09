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
        do{
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
                case 4:
                    funcion.eliminarProfesor();
            }
            
        }while (op != 0);
    }
    
    public void registrarProfesor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- ALTA DE PROFESOR ---");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        
        System.out.print("Correo: ");
        String correo = sc.nextLine();
        

        System.out.print("Teléfono: ");
        int telefono = sc.nextInt();
        sc.nextLine();

        Profesor p = new Profesor(nombre, apellido, correo, telefono);
        System.out.println("✅ Profesor registrado con ID: " + p.getId());
        
        Consultas consulta = new Consultas();
        consulta.insertarProfesorBD(p);
        
    }
    public void eliminarProfesor() {
        System.out.println("\n=== ELIMINAR PROFESOR ===");

        // Primero mostramos los profesores para ver los IDs
        System.out.println("\n📋 Lista de profesores disponibles:");
        Consultas consulta = new Consultas();
        consulta.consultarProfesores();

        Scanner sc = new Scanner(System.in);
        System.out.print("\n🔢 Ingrese el ID del profesor a eliminar: ");

        try {
            int idProfesor = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            // Confirmación
            System.out.print("⚠️ ¿Está seguro de eliminar al profesor? (S/N): ");
            String confirmacion = sc.nextLine().trim().toUpperCase();

            if (confirmacion.equals("S") || confirmacion.equals("SI")) {
                consulta.eliminarProfesorBD(idProfesor);
            } else {
                System.out.println("❌ Operación cancelada");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debe ingresar un número válido");
            sc.nextLine(); // Limpiar entrada inválida
        }
    }
    
        // MENÚ DE GESTIÓN DE ALUMNOS
    public void menuGestionAlumno() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== GESTIÓN DE ALUMNOS ===");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Consultar alumnos");
            System.out.println("3. Editar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                Consultas consulta = new Consultas();

                switch(opcion) {
                    case 1:
                        registrarAlumno();
                        break;
                    case 2:
                        consulta.consultarAlumnos();
                        break;
                    case 3:
                        consulta.editarAlumno();
                        break;
                    case 4:
                        eliminarAlumno();
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número");
                sc.nextLine(); // limpiar buffer
                opcion = 0;
            }

        } while (opcion != 5);
    }

    // REGISTRAR ALUMNO
    public void registrarAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- REGISTRAR ALUMNO ---");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        //
        Alumno a = new Alumno(nombre, apellido, matricula, correo);

        // Insertar en BD
        Consultas consulta = new Consultas();
        consulta.insertarAlumnoBD(a);

        System.out.println("✅ Alumno registrado exitosamente");
    }

    // ELIMINAR ALUMNO
    public void eliminarAlumno() {
        System.out.println("\n=== ELIMINAR ALUMNO ===");

        // Primero mostramos los alumnos para ver los IDs
        System.out.println("\n📋 Lista de alumnos disponibles:");
        Consultas consulta = new Consultas();
        consulta.consultarAlumnos();

        Scanner sc = new Scanner(System.in);
        System.out.print("\n🔢 Ingrese el ID del alumno a eliminar: ");

        try {
            int idAlumno = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            // Confirmación
            System.out.print("⚠️ ¿Está seguro de eliminar al alumno? (S/N): ");
            String confirmacion = sc.nextLine().trim().toUpperCase();

            if (confirmacion.equals("S") || confirmacion.equals("SI")) {
                consulta.eliminarAlumnoBD(idAlumno);
            } else {
                System.out.println("❌ Operación cancelada");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debe ingresar un número válido");
            sc.nextLine(); // Limpiar entrada inválida
        }
    }

    


}