package PaqueteProyecto;

/**
 *
 * @author sc03m14
 */
public class Tesis extends Material {
    //Atributos
    private String universidad;
    
    //Constructor
    public Tesis() {
        
    }
    
    public Tesis(String titulo, String autor, int anioPublicacion, String universidad) {
        super(titulo, autor, anioPublicacion);
        this.universidad = universidad;
    }
    
    //Métodos de acceso
    public String getUniversidad() {
        return universidad;
    }
    
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    
    @Override
    public void prestar() throws materialNoDisponibleException {
        if (isPrestado()) {
            throw new materialNoDisponibleException("La tesis '" + getTitulo() + "' ya está prestada.");
        }

        setPrestado(true); // Cambio de estado
        System.out.println("La tesis '" + getTitulo() + "' ha sido prestada.");
    }
}
