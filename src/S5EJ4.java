import java.util.ArrayList;
import java.util.Scanner;

public class S5EJ4 {

    // 🔹 Método para encontrar la edad más joven
    public static int encontrarMenor(ArrayList<Integer> edades) {
        int menor = edades.get(0);
        for (int edad : edades) {
            if (edad < menor) {
                menor = edad;
            }
        }
        return menor;
    }

    // 🔹 Método para encontrar la edad más vieja
    public static int encontrarMayor(ArrayList<Integer> edades) {
        int mayor = edades.get(0);
        for (int edad : edades) {
            if (edad > mayor) {
                mayor = edad;
            }
        }
        return mayor;
    }

    // 🔹 Método para calcular el promedio
    public static double calcularPromedio(ArrayList<Integer> edades) {
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return (double) suma / edades.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> edades = new ArrayList<>();

        // Pedimos 10 edades
        System.out.println("Ingrese 10 edades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades.add(sc.nextInt());
        }

        // Llamamos los métodos
        int menor = encontrarMenor(edades);
        int mayor = encontrarMayor(edades);
        double promedio = calcularPromedio(edades);

        // Mostramos resultados
        System.out.println("\nEdad más joven: " + menor);
        System.out.println("Edad más vieja: " + mayor);
        System.out.println("Promedio de edades: " + promedio);

        sc.close();
    }
}
