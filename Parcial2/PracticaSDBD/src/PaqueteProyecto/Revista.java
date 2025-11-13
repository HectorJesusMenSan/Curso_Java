package PaqueteProyecto;

/**
 *
 * @author sc03m14
 */
public class Revista extends Material {
    //Atributos
    private int edicion;
    
    //Constructor
    public Revista() {
        
    }
    
    public Revista(String titulo, String autor, int anioPublicacion, int edicion) {
        super(titulo, autor, anioPublicacion);
        this.edicion = edicion;
    }
    
    //Métodos de acceso
    public int getEdicion() {
        return edicion;
    }
    
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    @Override
    public void prestar() throws materialNoDisponibleException {
        if (isPrestado()) {
            throw new materialNoDisponibleException("La revista '" + getTitulo() + "' ya está prestada.");
        }

        setPrestado(true); // Cambio de estado
        System.out.println("La revista '" + getTitulo() + "' ha sido prestada.");
    }
}
