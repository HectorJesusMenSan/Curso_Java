package examentercerparcial;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

     public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Archivos arch = new Archivos();
        Consultas con = new Consultas();

        int op;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Capturar libro y guardar en archivo");
            System.out.println("2. Pasar archivo a BD");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Consultar BD (guardar en archivo)");
            System.out.println("6. Mostrar archivo Libro");
            System.out.println("7. Mostrar archivo consultaLibro");
            System.out.println("0. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                     
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año: ");
                    String anio = sc.nextLine();

                    Libro libro = new Libro(isbn, titulo, autor, anio);
                    arch.escribirLibro(libro);
                    break;

                case 2:
                    // Lee archivo y lo inserta completo en BD
                    arch.insertarDesdeArchivo(con);
                    break;

                case 3:
                     
                    System.out.println("Id a actualizar: ");
                    int id_buscar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ISBN a actualizar: ");
                    isbn = sc.nextLine();
                    System.out.println("Nuevo título: ");
                    titulo = sc.nextLine();
                    System.out.print("Nuevo autor: ");
                    autor = sc.nextLine();
                    System.out.println("Nuevo año: ");
                    anio = sc.nextLine();

                    con.actualizar(id_buscar, isbn, titulo, autor, anio);
                    break;

                case 4:
                    System.out.print("ISBN a eliminar: ");
                    con.eliminar(sc.nextLine());
                    break;

                case 5:
                    // Consulta BD y guarda en consultaLibro.txt
                    con.consultar();
                    break;

                case 6:
                    arch.leerArchivoLibros();
                    break;

                case 7:
                    arch.leerArchivoConsulta();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);
    }
}
