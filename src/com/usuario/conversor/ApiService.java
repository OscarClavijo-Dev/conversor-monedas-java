package com.usuario.conversor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiService {

    // Reemplaza este valor con tu API key
    private static final String API_KEY = "da9f15cb8804f51d7c3704ce";

    public double obtenerTasaCambio(String from, String to) {
        try {
            String endpoint = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + from + "/" + to;

            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                respuesta.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(respuesta.toString());
            return json.getDouble("conversion_rate");

        } catch (Exception e) {
            System.out.println("Error al obtener datos de la API: " + e.getMessage());
            return 0;
        }
    }
}
