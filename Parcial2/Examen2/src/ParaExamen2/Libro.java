/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParaExamen2;

/**
 *
 * @author sc03m14
 *Libro hereda de Producto e imprime sus datos*/
public class Libro extends Producto implements Imprimible {

    private String titulo;
    private String autor;
    private int paginas;

    public Libro(double precioBase, String titulo, String autor, int paginas) throws PrecioInvalidoException {
        super(precioBase);
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.16; // incluye IVA
    }

    @Override
    public void imprimir() {
        System.out.println("\n--- Libro ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio final: " + calcularPrecioFinal());
    }
}