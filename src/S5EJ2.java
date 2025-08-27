import java.util.Scanner;

public class S5EJ2 {

    // Método para calcular el área
    public static double calcularArea( double largo, double ancho){
        return largo * ancho;
    }

    // Método para calcular el perímetro
    public static double calcularPerimetro(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el largo del terreno: ");
        double largo = sc.nextDouble();

        System.out.print("Ingrese el ancho del terreno: ");
        double ancho = sc.nextDouble();

        // Uso de los métodos
        double area = calcularArea(largo, ancho);
        double perimetro = calcularPerimetro(largo, ancho);

        // Mostrar resultados
        System.out.println("Área del terreno: " + area + " m²");
        System.out.println("Perímetro del terreno: " + perimetro + " m");

        sc.close();
    }
}
