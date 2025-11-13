package PaqueteProyecto;

import java.util.Scanner;

/**
 *
 * @author sc03m14
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el título del libro: ");
            String titulo = entrada.nextLine();

            System.out.print("Ingrese el autor: ");
            String autor = entrada.nextLine();

            System.out.print("Ingrese el año de publicación: ");
            int anio = entrada.nextInt();

            System.out.print("Ingrese el número de páginas: ");
            int paginas = entrada.nextInt();

            // Validaciones básicas
            if (titulo.isEmpty() || autor.isEmpty()) {
                throw new datosInvalidosException("El título y el autor no pueden estar vacíos.");
            }

            if (anio <= 0) {
                throw new datosInvalidosException("El año de publicación debe ser un número positivo.");
            }

            if (paginas <= 0) {
                throw new datosInvalidosException("El número de páginas debe ser mayor que cero.");
            }

            // Si todo está correcto, creamos el objeto
            Libro libro = new Libro(titulo, autor, anio, paginas);

            // Intentamos prestar el libro
            libro.prestar();

        } catch (datosInvalidosException e) {
            System.out.println("⚠️ Error de datos: " + e.getMessage());
        } catch (materialNoDisponibleException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Error inesperado: " + e.getMessage());
        }

        System.out.println("\nPrograma finalizado correctamente.");
    }
}
