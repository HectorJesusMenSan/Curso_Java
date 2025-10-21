
package figuras;

/**
 *
 * @author sc03m14
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    //Constructores
    public Rectangulo(){
        
    }
    public Rectangulo(double base, double altura, String color){
        super(color);
        this.altura = altura;
        this.base = base;
        //Utilizando Super
        
        
    }
    //Metodos de acceso:
    //Getters
    public double getBase(){
        return base;
        }
    public double getAltura(){
        return altura;
        }
    //Setters
    public void setBase(double base){
        this.base = base;
        }
    public void setAltura(double altura){
        this.altura = altura;
        }
    
    
    //Metodo abstracto:
    @Override
    void dibujar(){
        System.out.print("Dibujando rectangulo");
    }
    
}
