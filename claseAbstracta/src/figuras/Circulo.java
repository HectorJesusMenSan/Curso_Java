/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author sc03m14
 */
public class Circulo extends Figura implements Calculable, Mostrable{
    //Atributos propios
    private double diametro;
    private double radio;
    
    //Metodos de aceso
    public double getDiametro(){
        return diametro;
    }
    public void setDiametro(double diametro){
        this.diametro = diametro;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Constructor
    public Circulo(){
    }
    public Circulo(double diametro, double radio){
        this.diametro = diametro;
        this.radio = radio;
    }
    //Funcionalidad
    @Override
    void dibujar(){
        System.out.println("Dibujando circulo");
    }
    
    //(Aplicando interfaces
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    
}
