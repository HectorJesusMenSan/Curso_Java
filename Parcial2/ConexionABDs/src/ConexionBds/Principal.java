package ConexionBds;

import java.util.Scanner;

public class Principal {

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          Scanner dts = new Scanner(System.in);
          Consultas con = new Consultas();
          int opcion;

          do {
               System.out.println("\n===== MENÚ =====");
               System.out.println("1. Insertar");
               System.out.println("2. Leer");
               System.out.println("3. Actualizar");
               System.out.println("4. Eliminar");
               System.out.println("5. Salir");
               System.out.print("Opción: ");

               opcion = sc.nextInt();

               switch (opcion) {
                    case 1:
                         DatosPersonales persona = new DatosPersonales();
                         con.insertar(persona);
                         System.out.println("Ingresa Nombre: ");
                         persona.setNombre(dts.nextLine());
                         
                         
                         System.out.println("Ingresa Apellido: ");
                         persona.setApellido(dts.nextLine());
                         
                         System.out.println("Ingresa CURP: ");
                         persona.setCurp(dts.nextLine());
                         
                         System.out.println("Ingresa Fecha de nacimiento: ");
                         persona.setFecha_nacimiento(dts.nextLine());                                  
                         break;
                    case 2:
                         con.leerDatos();
                         break;
                    case 3:
                         System.out.println("Ingresa Id a buscar: ");
                         System.out.println("Ingresa Nuevo nombre: ");
                         
                         con.ActualizarDatos(dts.nextInt(), dts.nextLine());
                         break;
                    case 4:
                         System.out.println("Ingresa Id a buscar: ");

                         con.EliminarDato(dts.nextInt());
                         break;
                    case 5:
                         System.out.println("Saliendo...");
                         break;
                    default:
                         System.out.println("Opción no válida");
               }

          } while (opcion != 5);
     }
}
