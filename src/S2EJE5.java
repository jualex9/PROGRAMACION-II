import java.util.Scanner;
import java.util.Scanner;

public class S2EJE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.print("Peso en kg: ");
        peso = sc.nextDouble();

        System.out.print("Altura en metros: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);

        sc.close();
    }
}


