package com.usuario.conversor;

public class Conversor {

    private final ApiService apiService;

    public Conversor() {
        this.apiService = new ApiService();
    }

    public void convertirMoneda(String monedaOrigen, String monedaDestino, double cantidad) {
        double tasa = apiService.obtenerTasaCambio(monedaOrigen, monedaDestino);

        if (tasa == 0) {
            System.out.println("No se pudo obtener la tasa de cambio. Verifica tu conexión o tu API Key.");
            return;
        }

        double resultado = cantidad * tasa;

        System.out.printf("Tasa de cambio: 1 %s = %.4f %s%n", monedaOrigen, tasa, monedaDestino);
        System.out.printf("%.2f %s = %.2f %s%n", cantidad, monedaOrigen, resultado, monedaDestino);
    }

    public double convertir(String from, String to, double cantidad) {
        return cantidad;
    }
}
