/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejoDeArchivos;

import java.io.File;

/**
 *
 * @author sc03m14
 */
public class Archivo {
    public void analizarRuta(String ruta){
        //Crea un objeto con base de entrada del usuario
        File nombre = new File (ruta);
        
        if (nombre.exists()){
            System.out.println(nombre.getName() + " existe" + "\nTamaño:  " +nombre.length() + "\nruta: " + nombre.getPath() + "\nRuta absoluta: " + nombre.getAbsolutePath() );
            
            if (nombre.isDirectory()){
                String directorio[] = nombre.list();
                System.out.println("\n\nContenido del directorio:  \n");
                
                for (String nombreDirectorio : directorio){
                         System.out.println("  "+ nombreDirectorio);

                }   
            }else{
                System.out.println(ruta + " no existe");

            }
            
        }
        
        
        
        
        
        
    }

    
}
