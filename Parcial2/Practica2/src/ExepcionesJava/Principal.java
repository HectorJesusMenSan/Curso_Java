package ExepcionesJava;

public class Principal {
    public static void main(String[] args) {

        ExcepcionJava ex = new ExcepcionJava();

        // accesoFueraDeRango
        try {
            ex.accesoFueraDeRango(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }

        try {
            ex.accesoFueraDeRango(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }

        // referenciaNula
        try {
            ex.referenciaNula(null);
        } catch (NullPointerException e) {
            System.out.println("Error: referencia nula.");
        }

        try {
            ex.referenciaNula("Hola");
        } catch (NullPointerException e) {
            System.out.println("Error: referencia nula.");
        }

        // formatoNumeroInvalido
        try {
            ex.formatoNumeroInvalido("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: formato inválido.");
        }

        try {
            ex.formatoNumeroInvalido("123");
        } catch (NumberFormatException e) {
            System.out.println("Error: formato inválido.");
        }

        // division
        try {
            ex.division(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero.");
        }

        try {
            ex.division(10, 2);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero.");
        }

        // argumentoInvalido
        try {
            ex.argumentoInvalido(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: argumento inválido.");
        }

        try {
            ex.argumentoInvalido(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: argumento inválido.");
        }

        // caracterInvalido
        try {
            ex.caracterInvalido("Hola", 10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: posición inválida.");
        }

        try {
            ex.caracterInvalido("Hola", 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: posición inválida.");
        }

        // arregloNegativo
        try {
            ex.arregloNegativo(-3);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: tamaño negativo.");
        }

        try {
            ex.arregloNegativo(5);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: tamaño negativo.");
        }

        // casteoInvalido
        try {
            ex.casteoInvalido(10);
        } catch (ClassCastException e) {
            System.out.println("Error: casteo inválido.");
        }

        try {
            ex.casteoInvalido("Hola");
        } catch (ClassCastException e) {
            System.out.println("Error: casteo inválido.");
        }

        // operacionNoSoportada
        try {
            ex.operacionNoSoportada();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: no soportado.");
        }

        try {
            ex.operacionNoSoportada();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: no soportado.");
        }

        // estadoIlegal
        try {
            ex.estadoIlegal(false);
        } catch (IllegalStateException e) {
            System.out.println("Error: estado inválido.");
        }

        try {
            ex.estadoIlegal(true);
        } catch (IllegalStateException e) {
            System.out.println("Error: estado inválido.");
        }

        // tipoIncorrecto
        try {
            ex.tipoIncorrecto();
        } catch (ArrayStoreException e) {
            System.out.println("Error: tipo incorrecto.");
        }

        try {
            ex.tipoIncorrecto();
        } catch (ArrayStoreException e) {
            System.out.println("Error: tipo incorrecto.");
        }

        // listaFueraRango
        try {
            ex.listaFueraRango(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }

        try {
            ex.listaFueraRango(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
        }
    }
}
