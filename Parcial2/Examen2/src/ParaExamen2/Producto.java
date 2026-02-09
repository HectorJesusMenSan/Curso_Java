/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParaExamen2;

/**
 *
 * @author sc03m14
 */
// Clase abstracta que valida precio y obliga a calcular precio final
public abstract class Producto {

    protected double precioBase;

    public Producto(double precioBase) throws PrecioInvalidoException {
        if (precioBase < 0) {
            throw new PrecioInvalidoException("Precio base negativo.");
        }
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();
}