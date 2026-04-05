import java.util.Scanner; // Importa la clase Scanner para leer datos del teclado

public class Main { // Clase principal del programa
    public static void main(String[] args) { // Método principal donde inicia el programa

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para entrada de datos

        String marca; // Variable para almacenar la marca
        String modelo; // Variable para almacenar el modelo
        int cilindrada; // Variable para almacenar la cilindrada (número entero)
        String combustible; // Variable para almacenar el tipo de combustible
        int pasajeros; // Variable para almacenar la cantidad de pasajeros

        System.out.print("Ingrese la marca: "); // Solicita la marca al usuario
        marca = scanner.nextLine(); // Lee la marca ingresada

        System.out.print("Ingrese el modelo: "); // Solicita el modelo
        modelo = scanner.nextLine(); // Lee el modelo

        System.out.print("Ingrese la cilindrada: "); // Solicita la cilindrada
        cilindrada = scanner.nextInt(); // Lee un número entero
        scanner.nextLine(); // Limpia el buffer

        System.out.print("Ingrese el tipo de combustible: "); // Solicita el combustible
        combustible = scanner.nextLine(); // Lee el combustible

        System.out.print("Ingrese la capacidad en pasajeros: "); // Solicita pasajeros
        pasajeros = scanner.nextInt(); // Lee el número de pasajeros

        System.out.println("La marca que ha ingresado es: " + marca); // Muestra la marca
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra el modelo
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra la cilindrada
        System.out.println("El tipo de combustible es: " + combustible); // Muestra el combustible
        System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros."); // Muestra pasajeros

        scanner.close(); // Cierra el Scanner
    }
}