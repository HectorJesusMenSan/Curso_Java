
package barcos;

/**
 *
 * @author sc03m14
 */
public class barcoPasaje implements Barco {
    
    private int numeroCamas;
    //Definicion de metodos
    //Getters y Setters
    
    @Override
    public void alarma(){
        System.out.println("Alarma");
    }
    @Override
    public void msgSocorro(String mensaje){
        System.out.println(mensaje);
    }
    
}
