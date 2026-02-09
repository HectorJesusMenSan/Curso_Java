
package examentercerparcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jesusito
 */
public class Archivos {
    
    private final String nombre_archivo = "ArchivoLibros.txt";

    private final File archivo;

    
    public Archivos(){
        this.archivo = new File(nombre_archivo);
        crearArchivoSiNoExiste();
        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());

        
    }
    
    // 1. Crear el archivo si no existe
    private void crearArchivoSiNoExiste() {
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            }
        } 
        
        catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    // 2. Escribir información (Añadir libro)
    public void escribirLibro(Libro libro) {
        // 'true' en FileWriter permite añadir contenido sin borrar el anterior (append)
        try (FileWriter fw = new FileWriter(archivo, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            
            pw.println(libro.dtsLibro());
            pw.flush(); // fuerza escritura
            System.out.println("Libro registrado en archivo.");
            
        } 
        catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }

    // 3. Leer y mostrar todos los libros
     public void leerTodos() {
         try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

             String linea;
             System.out.println("\n--- LISTADO DE LIBROS (ARCHIVO) ---");

             while ((linea = br.readLine()) != null) {
                 System.out.println(linea);
             }

             System.out.println("-----------------------------------\n");

         } catch (IOException e) {
             System.err.println("Error al leer el archivo: " + e.getMessage());
         }
     }
     
     public void leerArchivoConsulta() {

          File archivo = new File("consultaLibro.txt");

          if (!archivo.exists()) {
              System.out.println("El archivo consultaLibro no existe.");
              return;
          }

          System.out.println("\n--- CONTENIDO DE consultaLibro ---");

          try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

              String linea;

              while ((linea = br.readLine()) != null) {
                  System.out.println(linea);
              }

          } 
          catch (IOException e) {
              System.out.println("Error al leer el archivo consultaLibro.");
          }
     }
     
    public void insertarDesdeArchivo(Consultas con) {

          File archivo = new File("ArchivoLibros.txt");

          if (!archivo.exists()) {
              System.out.println("El archivo de libros no existe.");
              return;
          }

          try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

              String linea;

              while ((linea = br.readLine()) != null) {

                  // Separar por coma
                  String[] datos = linea.split(";");

                  if (datos.length == 4) {

                      String isbn = datos[0].trim();
                      String titulo = datos[1].trim();
                      String autor = datos[2].trim();
                      String anio = datos[3].trim();

                      Libro libro = new Libro(isbn, titulo, autor, anio);
                      con.insertar(libro);
                  }
              }

              System.out.println("Archivo insertado correctamente en la base de datos.");

          } catch (IOException e) {
              System.out.println("Error al leer el archivo.");
          }
     }

    public void leerArchivoLibros() {

          File archivo = new File("ArchivoLibros.txt");

          if (!archivo.exists()) {
              System.out.println("El archivo de libros no existe.");
              return;
          }

          System.out.println("\n--- LISTADO DE LIBROS (ARCHIVO) ---");

          try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

              String linea;

              while ((linea = br.readLine()) != null) {
                  System.out.println(linea);
              }

          } catch (IOException e) {
              System.out.println("Error al leer el archivo de libros.");
          }
     }
    


}
    
    
    

