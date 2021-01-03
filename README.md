# Kata 4

Programa que crea un histograma de los dominios de una lista de correos electrónicos almacenados en un archivo de texto.
El archivo con los correos electrónicos se encuentra dentro de la carpeta de cada versión.

El código se distribuye en 3 paquetes, siguiendo el patrón MVC:
- Main (Controller)
  - kata4.java (main)
- Model
  - Histogram.java
  - Mail.java
- View
  - HistogramDisplay.java
  - MailHistogramBuilder.java
  - MailListReader.java

### Versión 1
La clase kata4 solo tiene el método principal, el cual hace todas las llamadas a las distintas clases del programa.

### Versión 2
La clase kata4 ahora cuenta, además del método principal, con los métodos execute, input, process y output, siguiendo el modelo CIPO.
De esta manera, las distintas actividades quedan separadas en métodos dedicados para cada fin. Por ejemplo, el método input está destinado sólamente a llamar al método que lee los correos electrónicos del archivo de texto y los guarda en una lista de objetos Mail.
