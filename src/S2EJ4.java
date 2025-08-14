import java.util.Scanner;


public class S2EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int diasTrabajados;
        double valorDia;
        double salarioTotal;

        // Entrada de datos
        System.out.print("Ingrese el número de días trabajados: ");
        diasTrabajados = sc.nextInt();

        System.out.print("Ingrese el valor por día: ");
        valorDia = sc.nextDouble();

        // Cálculo del salario
        salarioTotal = diasTrabajados * valorDia;

        // Salida de datos
        System.out.println("\n--- Cálculo de Salario ---");
        System.out.println("Días trabajados: " + diasTrabajados);
        System.out.println("Valor por día: $" + String.format("%.2f", valorDia));
        System.out.println("Salario total a pagar: $" + String.format("%.2f", salarioTotal));

        sc.close();
    }
}
