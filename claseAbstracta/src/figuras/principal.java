
package figuras;

/**
 *
 * @author sc03m14
 */
public class principal {
    public static void main(String[] args){
        Figura fig1 = new circulo();
        Figura f2 = new Rectangulo();
        
        fig1.establecerColor("rojo");
        fig1.dibujar();
    }
    
}
