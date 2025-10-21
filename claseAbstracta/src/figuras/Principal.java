
package figuras;

//Importar

/**
 *
 * @author sc03m14
 */
public class Principal {
    public static void main(String[] args){
        Figura fig1 = new Circulo();
        Figura fig2 = new Rectangulo(1,2,"rojo");
        
        fig1.establecerColor("rojo");
        fig1.dibujar();
        
        fig2.dibujar();
        System.out.println();
        
        
        //Acceder a los los metodos de acceso para subclases.
        
        System.out.println(((Rectangulo)fig2).getAltura());
        System.out.println(((Rectangulo)fig2).getBase());
        
        //Asi tambien
        ((Rectangulo)fig2).getAltura();
        
        ((Circulo)fig1).mostrarInformacion();

    }
    
}
