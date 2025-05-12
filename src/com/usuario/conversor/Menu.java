package com.usuario.conversor;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final Conversor conversor = new Conversor();

    public void mostrar() {
        String from, to;
        double cantidad;

        System.out.println("Bienvenido al Conversor de Monedas");

        while (true) {
            System.out.println("\nMonedas comunes: USD, EUR, MXN, BRL, ARS, CLP, COP, PEN");
            System.out.print("Ingrese la moneda de origen (ej: USD): ");
            from = scanner.nextLine().trim().toUpperCase();

            System.out.print("Ingrese la moneda de destino (ej: EUR): ");
            to = scanner.nextLine().trim().toUpperCase();

            System.out.print("Ingrese la cantidad a convertir: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor ingrese un número válido.");
                scanner.next();
            }
            cantidad = scanner.nextDouble();
            scanner.nextLine();

            double resultado = conversor.convertir(from, to, cantidad);
            System.out.printf("\n%.2f %s equivalen a %.2f %s\n",
                    cantidad, from, resultado, to);

            System.out.print("\n¿Desea realizar otra conversión? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("s")) break;
        }

        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
    }
}
