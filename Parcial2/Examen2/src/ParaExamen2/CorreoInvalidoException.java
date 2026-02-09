package ParaExamen2;


// Excepción que se lanza cuando el correo no cumple con el formato básico
public class CorreoInvalidoException extends Exception {
public CorreoInvalidoException(String mensaje) {
super(mensaje); // Envía el mensaje a la clase Exception
}
}