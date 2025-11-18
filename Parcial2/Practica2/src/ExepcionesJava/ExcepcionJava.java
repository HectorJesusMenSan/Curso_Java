package ExepcionesJava;

public class ExcepcionJava {

    // Índice fuera de rango
    public void accesoFueraDeRango(int indice) {
        int[] numeros = {1, 2, 3};
        System.out.println(numeros[indice]);
    }

    // Uso de referencia null
    public void referenciaNula(String texto) {
        System.out.println(texto.length());
    }

    // Texto a número inválido
    public void formatoNumeroInvalido(String numero) {
        int valor = Integer.parseInt(numero);
        System.out.println("Valor convertido: " + valor);
    }

    // División entre cero
    public void division(int a, int b) {
        int r = a / b;
        System.out.println("Resultado: " + r);
    }

    // Parámetro no válido
    public void argumentoInvalido(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad negativa");
        }
        System.out.println("Edad válida: " + edad);
    }

    // Posición inválida en cadena
    public void caracterInvalido(String cadena, int pos) {
        System.out.println(cadena.charAt(pos));
    }

    // Arreglo con tamaño negativo
    public void arregloNegativo(int tam) {
        int[] arreglo = new int[tam];
        System.out.println("Arreglo creado: " + tam);
    }

    // Cast incorrecto
    public void casteoInvalido(Object obj) {
        String s = (String) obj;
        System.out.println("Convertido: " + s);
    }

    // Acción no permitida
    public void operacionNoSoportada() {
        throw new UnsupportedOperationException("No permitido");
    }

    // Estado inválido
    public void estadoIlegal(boolean activo) {
        if (!activo) {
            throw new IllegalStateException("Estado inválido");
        }
        System.out.println("Estado válido");
    }

    // Tipo incorrecto en arreglo
    public void tipoIncorrecto() {
        Object[] datos = new String[3];
        datos[0] = 5;
    }

    // Índice fuera de rango en lista
    public void listaFueraRango(int indice) {
        int[] lista = {10, 20, 30};
        System.out.println(lista[indice]);
    }
}
