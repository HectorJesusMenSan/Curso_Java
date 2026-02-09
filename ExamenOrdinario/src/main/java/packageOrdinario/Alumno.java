/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOrdinario;


/**
 *
 * @author Hector Jesus Mendez Santiago, Juan Bautista Juarez.
 *
 * @version 1.0
 */
public class Alumno {

    /**
     * Esta clase es una plantilla para los alumnos
     *
     * @param id: Es el identificador de un alumno y aumenta cada que se crea un
     * nuevo objeto tipo alumno. Tipo entero.
     * @param nombre: Atributo que guarda el nombre de un alumno. Tipo cadena
     * @param apellido: Atributo que guarda el apellido de un alumno. Tipo
     * cadena
     * @param matricula: Guarda la matrícula del alumno. Tipo cadena.
     * @param correo: Guarda el correo del alumno. Tipo cadena.
     */

    // Declaracion de variables
    private static int contador = 0;
    private int id = 0;
    private String nombre;
    private String apellido;
    private String matricula;
    private String correo;

    // Constructores
    public Alumno() {};
    public Alumno(String nombre, String apellido, String matricula, String correo) {
        /**
         * Constructor para los objetos tipo alumno. Recibe nombre, apellido,
         * matricula y correo y los asigna segun la clase.
         */
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
        contador++;
        this.id=contador;
    }
    // Metodos
    public String getNombre() {
        /**
         * Metodo para obtener nombre.
         *
         * @return String nombre: nombre de alumno.
         */
        return this.nombre;
    }

    public void setNombre(String nombre) {
        /**
         * Metodo para cambiar nombre.
         *
         * @param nombre: nombre a cambiar.
         */
        this.nombre = nombre;
    }

    public String getApellido() {
        /**
         * Metodo para obtener apellido.
         *
         * @return String apellido: apellido de alumno.
         */
        return this.apellido;
    }

    public void setApellido(String apellido) {
        /**
         * Metodo para cambiar apellido.
         *
         * @param apellido: apellido a cambiar.
         */
        this.apellido = apellido;
    }

    public String getMatricula() {
        /**
         * Metodo para obtener matricula.
         *
         * @return String matricula: matricula del alumno.
         */
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        /**
         * Metodo para cambiar matricula.
         *
         * @param matricula: matricula a cambiar.
         */
        this.matricula = matricula;
    }

    public String getCorreo() {
        /**
         * Metodo para obtener correo.
         *
         * @return String correo: correo del alumno.
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
    public int getId(){
        /**
         * Metodo para obtener id
         * @return id: retorna el id de la clase
         */
        return id;
    }
}
         
                                                                                                        