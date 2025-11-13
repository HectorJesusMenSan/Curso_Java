
package PaqueteProyecto;

/**
 *
 * @author sc03m14
 */
public abstract class Material {

    // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;
       // Constructor
    public Material(){
    }
    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false; // Por defecto no está prestado
    }

    // Métodos de acceso (getters y setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Método abstracto
    public abstract void prestar() throws materialNoDisponibleException;

}
