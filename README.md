# 💱 Conversor de Monedas en Java

Este es un proyecto simple en Java que permite convertir valores entre distintas monedas utilizando la [Exchangerate-API](https://www.exchangerate-api.com/). Se ejecuta en la consola y está orientado a reforzar conceptos de programación orientada a objetos (POO), consumo de APIs y manejo de datos JSON.

## 📌 Funcionalidades

- Conversión de monedas en tiempo real.
- Soporte para conversiones entre:
  - COP a USD
  - USD a COP
  - COP a EUR
  - EUR a COP
  - Wones a COP
  - COP a Wones
- Menú interactivo por consola.
- Validación básica de errores.

## 🛠 Tecnologías utilizadas

- Java 21
- Exchangerate-API
- Biblioteca JSON (incluida como `.jar` en el proyecto)

## 📂 Estructura del proyecto
src/
- com.usuario.conversor/
- ApiService.java # Conexión y consumo de la API
- App.java # Lógica del menú y control principal
- Conversor.java # Lógica de conversión
- Menu.java # Opciones disponibles en pantalla
- Moneda.java # Modelo de moneda
- Main.java # Método main()


## ⚙️ Configuración del entorno

1. Clona este repositorio:

git clone https://github.com/tu-usuario/ConversorMonedasJava.git
cd ConversorMonedasJava

## COmo ejecutarlo en tu equipo local
1. Abre el proyecto en IntelliJ IDEA (u otro IDE compatible).

2. Asegúrate de tener el archivo json-20240303.jar en tu carpeta raíz y agregado como biblioteca en el proyecto.

3. Regístrate en Exchangerate-API y obtén tu API Key.

4. Abre ApiService.java y reemplaza "AQUÍ_TU_API_KEY" por tu clave personal


## Evidencia fotografica del programa
![image](https://github.com/user-attachments/assets/b56362ed-e3a5-44fb-b0f8-88ea6d4633fc)



## 📜 Licencia

Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.


#challengeoneconversorlatam8
