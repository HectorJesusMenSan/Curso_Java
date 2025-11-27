/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoDeArchivos;

import java.util.Scanner;

/**
 *
 * @author sc03m14
 */
public class Principal{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Archivo aplicacion = new Archivo();
        
        aplicacion.analizarRuta("/home/sc03m14/Documentos/ReporteExamen (1).pdf");
    }
    
}
