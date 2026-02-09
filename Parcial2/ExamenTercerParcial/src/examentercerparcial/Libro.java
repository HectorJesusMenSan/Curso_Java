package examentercerparcial;



public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String anio;
    
    public Libro(){}
    public Libro(String isbn, String titulo, String autor, String anio){
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
        this.titulo = titulo;
    }
    // Getters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn){this.isbn = isbn;}
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo){this.titulo = titulo;}

    public String getAutor() { return autor; }
    public void setAutor(String autor){this.autor = autor;}

    public String getAnio() { return anio; }
    public void setAnio(String anio) {this.anio = anio;}
    
    public String dtsLibro() {
          return isbn + ";" + titulo + ";" + autor + ";" + anio;
     }

}