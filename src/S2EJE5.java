import java.util.Scanner;


public class S2EJE5  {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variables
    String nombre;     // Nombre del paciente
    double peso;       // Peso en kilogramos
    double estatura;   // Altura en metros
    double imc;        // Índice de Masa Corporal

    // Entrada de datos
    System.out.print("Ingrese el nombre del paciente: ");
    nombre = sc.nextLine();

    System.out.print("Ingrese el peso en kg: ");
    peso = sc.nextDouble();

    System.out.print("Ingrese la estatura en metros (ej: 1.75): ");
    estatura = sc.nextDouble();

    // Cálculo del IMC
    imc = peso / Math.pow(estatura, 2);

    // Salida de datos
    System.out.println("\n--- Resultado IMC ---");
    System.out.println("Paciente: " + nombre);
    System.out.println("Peso: " + peso + " kg");
    System.out.println("Estatura: " + estatura + " m");
    System.out.println("IMC: " + String.format("%.2f", imc));

    // Clasificación del IMC (opcional)
    if (imc < 18.5) {
        System.out.println("Clasificación: Bajo peso");
    } else if (imc < 25) {
        System.out.println("Clasificación: Peso normal");
    } else if (imc < 30) {
        System.out.println("Clasificación: Sobrepeso");
    } else {
        System.out.println("Clasificación: Obesidad");
    }

    sc.close();
}
}

