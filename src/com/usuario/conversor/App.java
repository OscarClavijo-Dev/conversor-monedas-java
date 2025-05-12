package com.usuario.conversor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner escritura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        double valor = 0;
        int opciones = 0;

        try {
            while (opciones != 7) {
                verMenu();
                System.out.print("Ingresa una opción válida: ");
                opciones = escritura.nextInt();

                if (opciones != 7) {
                    System.out.print("Ingresa el valor que deseas convertir: ");
                    valor = escritura.nextDouble();
                }

                switch (opciones) {
                    case 1:
                        conversor.convertirMoneda("COP", "USD", valor);
                        break;
                    case 2:
                        conversor.convertirMoneda("USD", "COP", valor);
                        break;
                    case 3:
                        conversor.convertirMoneda("COP", "EUR", valor);
                        break;
                    case 4:
                        conversor.convertirMoneda("EUR", "COP", valor);
                        break;
                    case 5:
                        conversor.convertirMoneda("KRW", "COP", valor); // Wones a COP
                        break;
                    case 6:
                        conversor.convertirMoneda("COP", "KRW", valor); // COP a Wones
                        break;
                    case 7:
                        System.out.println("¡Gracias por usar el conversor!");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        escritura.close();
    }

    public static void verMenu() {
        System.out.println("\n*** CONVERSOR DE MONEDAS ***");
        System.out.println("1. COP a USD");
        System.out.println("2. USD a COP");
        System.out.println("3. COP a EUR");
        System.out.println("4. EUR a COP");
        System.out.println("5. KRW (Wones) a COP");
        System.out.println("6. COP a KRW (Wones)");
        System.out.println("7. Salir");
    }
}
