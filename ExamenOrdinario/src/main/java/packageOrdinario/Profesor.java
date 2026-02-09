/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOrdinario;



/**
 *
 * @author  Hector Jesus Mendez Santiago,
 *          Juan Bautista Juarez.
 * 
 * @version 1.0
 */
public class Profesor {
    /**
     * Esta clase es una plantilla para los profesores
     * @param id:       Es el identificador de un profesor y aumenta
     *                  cada que se crea un nuevo objeto tipo profesor.
     *                  Tipo entero.
     * @param nombre:   Atributo que guarda el nombre de un 
     *                  profesor. Tipo cadena
     * @param apellido: Atributo que guarda el apellido de un 
     *                  profesor. Tipo cadena
     * @param telefono: Guarda el numero telefonico de cada profesor.
     *                  Tipo entero.
     */

    // Declaracion de variables
    private static int contador;
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;

    // Constructores
    public Profesor(){};
    public Profesor(String nombre, String apellido, String correo, int telefono){
        /**
         * Constructor para los objetos tipo profesor.
         * Recibe un nombre apellido y un telefono 
         * numerico y los asigna segun la clase
         */
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        contador++;
        this.id=contador;
    }

    //Metodos
    public String getNombre(){
        /**
         * Metodo para obtener nombre.
         * @return String nombre: nombre de pofesor.
         */
        return this.nombre;
    }
    public void setNombre(String nombre){
        /**
         * Metodo para cambiar nombre.
         * @param nombre: nombre a cambiar.
         */
        this.nombre = nombre;
    }

    public String getApellido(){
        /**
         * Metodo para obtener apellido.
         * @return String apellido: apellido de pofesor.
         */
        return this.apellido;
    }
    public void setApellido(String apellido){
        /**
         * Metodo para cambiar apellido.
         * @param apellido: apellido a cambiar.
         */
        this.apellido = apellido;
    }

    public int getTelefono(){
        /**
         * Metodo para obtener telefono.
         * @return int telefono: nombre de telefono.
         */
        return this.telefono;
    }
    public void setTelefono(int telefono){
        /**
         * Metodo para cambiar telefono.
         * telefono a cambiar.
         */
        this.telefono = telefono;
    }
    public int getId(){
        /**
         * Metodo para obtener id
         * @return id: retorna el id de la clase
         */
        return id;
    }
    public String getCorreo() {
        /**
         * Metodo para obtener correo.
         *
         * @return String correo: correo de profesor.
         */
        return this.correo;
    }

    public void setCorreo(String correo) {
        /**
         * Metodo para cambiar correo.
         *
         * @param correo: correo a cambiar.
         */
        this.correo = correo;
    }


}                                                                                                                                                                       

