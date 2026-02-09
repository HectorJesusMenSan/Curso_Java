package ParaExamen2;

import java.util.Scanner;

// Clase principal que pide los datos al usuario
public class principa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------- PERSONA --------------------
        try {
            System.out.println("\n--- Registro de Persona ---");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            System.out.print("Correo electrónico: ");
            String correo = sc.nextLine();

            Persona p = new Persona(nombre, edad, correo);
            p.imprimir();

        } catch (Exception e) {
            System.out.println("Error en Persona: " + e.getMessage());
        }

        // -------------------- CUENTA BANCARIA --------------------
        try {
            System.out.println("\n--- Crear Cuenta Bancaria ---");

            System.out.print("Número de cuenta: ");
            String numCuenta = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double saldoInicial = Double.parseDouble(sc.nextLine());

            CuentaBancaria cb = new CuentaBancaria(numCuenta, saldoInicial);

            System.out.print("Cantidad a depositar: ");
            double dep = Double.parseDouble(sc.nextLine());
            cb.depositar(dep);

            try {
                System.out.print("Cantidad a retirar: ");
                double ret = Double.parseDouble(sc.nextLine());
                cb.retirar(ret);
            } catch (FondoInsuficienteException | RetiroAnticipadoException e) {
                System.out.println("Error al retirar: " + e.getMessage());
            }

            cb.imprimir();

        } catch (Exception e) {
            System.out.println("Error al crear cuenta bancaria: " + e.getMessage());
        }

        // -------------------- CUENTA AHORROS --------------------
        try {
            System.out.println("\n--- Crear Cuenta de Ahorros ---");

            System.out.print("Número de cuenta: ");
            String numAhorro = sc.nextLine();

            System.out.print("Saldo inicial: ");
            double saldoAh = Double.parseDouble(sc.nextLine());

            System.out.print("¿Retiros permitidos? (true/false): ");
            boolean retirosPermitidos = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Tasa de interés: ");
            double tasa = Double.parseDouble(sc.nextLine());

            System.out.print("Meses de antigüedad: ");
            int meses = Integer.parseInt(sc.nextLine());

            CuentaAhorros ca = new CuentaAhorros(numAhorro, saldoAh, retirosPermitidos, tasa, meses);

            try {
                System.out.print("Cantidad a retirar: ");
                double retAh = Double.parseDouble(sc.nextLine());
                ca.retirar(retAh);
            } catch (FondoInsuficienteException | RetiroAnticipadoException e) {
                System.out.println("Error en cuenta ahorros: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al crear cuenta de ahorros: " + e.getMessage());
        }

        // -------------------- LIBRO --------------------
        try {
            System.out.println("\n--- Registrar Libro ---");

            System.out.print("Precio base: ");
            double precioBase = Double.parseDouble(sc.nextLine());

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Número de páginas: ");
            int paginas = Integer.parseInt(sc.nextLine());

            Libro libro = new Libro(precioBase, titulo, autor, paginas);

            libro.imprimir();

            System.out.println("Precio final del libro: " + libro.calcularPrecioFinal());

        } catch (Exception e) {
            System.out.println("Error al registrar libro: " + e.getMessage());
        }

        sc.close();
    }
}
