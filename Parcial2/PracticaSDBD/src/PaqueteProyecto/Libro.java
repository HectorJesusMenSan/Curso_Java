package PaqueteProyecto;

/**
 *
 * @author sc03m14
 */
public class Libro extends Material {
    //Atributos
    private int numeroDePaginas;
    
    //Constructor
    public Libro(){
        
    }
    public Libro(String titulo, String autor, int anioPublicacion, int numeroDePaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroDePaginas = numeroDePaginas;
    }  
    //Metodo de acceso
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
     public void setNumeroDePaginas( int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }


    @Override
    public void prestar() throws materialNoDisponibleException {
        if (isPrestado()) {
            throw new materialNoDisponibleException("El libro '" + getTitulo() + "' ya está prestado.");
        }

        setPrestado(true);  //Aqui se cambio el estado.
        System.out.println("El libro '" + getTitulo() + "' ha sido prestado.");
        }
}
