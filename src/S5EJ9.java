import java.util.Scanner;

public class S5EJ9 {

    public static double aplicarBono(double salario, double minimo) {
        if (salario <= minimo) {
            salario += 200;
        }
        return aplicarAuxilioTransporte(salario);
    }
    public static double aplicarAuxilioTransporte(double salario) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿El trabajador es mujer? (s/n): ");
        char genero = sc.next().toLowerCase().charAt(0);

        if (genero == 's') {
            salario += 100;
        }
        return salario;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el salario del trabajador: ");
        double salario = sc.nextDouble();

        double salarioFinal = aplicarBono(salario, 1300);
        System.out.println("El salario final es: " + salarioFinal);
    }
}

