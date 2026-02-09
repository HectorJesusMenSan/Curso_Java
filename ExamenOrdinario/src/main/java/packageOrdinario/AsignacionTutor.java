package packageOrdinario;

/**
 *
 * @author  Hector Jesus Mendez Santiago,
 *          Juan Bautista Juarez.
 * 
 * @version 1.0
 */
public class AsignacionTutor {
    /**
     * Esta clase representa la asignación de un tutor a un alumno.
     * @param id:   Identificador de la asignación.
     *                        Tipo entero.
     * @param idProfesor:     Identificador del profesor asignado.
     *                        Tipo entero.
     * @param idAlumno:       Identificador del alumno asignado.
     *                        Tipo entero.
     * @param fechaAsignacion: Fecha en la que se realiza la asignación.
     *                        Tipo cadena.
     */

    // Declaracion de variables
    private static int contador = 0;
    private int id=0;
    private int idProfesor;
    private int idAlumno;
    private String fechaAsignacion;

    // Constructores
    public AsignacionTutor(){};
    public AsignacionTutor(int idProfesor, int idAlumno, String fechaAsignacion){
        /**
         * Constructor para los objetos tipo AsignacionTutor.
         * Recibe el id del profesor, id del alumno y la fecha
         * y los asigna segun la clase.
         */
        this.idProfesor = idProfesor;
        this.idAlumno = idAlumno;
        this.fechaAsignacion = fechaAsignacion;
        contador++;
        this.id = contador;
    }

    // Metodos
    public int getIdProfesor(){
        /**
         * Metodo para obtener idProfesor.
         * @return int idProfesor: identificador del profesor.
         */
        return this.idProfesor;
    }
    public void setIdProfesor(int idProfesor){
        /**
         * Metodo para cambiar idProfesor.
         * @param idProfesor: idProfesor a cambiar.
         */
        this.idProfesor = idProfesor;
    }

    public int getIdAlumno(){
        /**
         * Metodo para obtener idAlumno.
         * @return int idAlumno: identificador del alumno.
         */
        return this.idAlumno;
    }
    public void setIdAlumno(int idAlumno){
        /**
         * Metodo para cambiar idAlumno.
         * @param idAlumno: idAlumno a cambiar.
         */
        this.idAlumno = idAlumno;
    }

    public String getFechaAsignacion(){
        /**
         * Metodo para obtener fechaAsignacion.
         * @return String fechaAsignacion: fecha de asignacion.
         */
        return this.fechaAsignacion;
    }
    public void setFechaAsignacion(String fechaAsignacion){
        /**
         * Metodo para cambiar fechaAsignacion.
         * @param fechaAsignacion: fecha a cambiar.
         */
        this.fechaAsignacion = fechaAsignacion;
    }

    public int getId(){
        /**
         * Metodo para obtener id
         * @return id: retorna el id de la clase
         */
        return id;
    }
}
