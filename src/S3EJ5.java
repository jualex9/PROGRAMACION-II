import java.util.Scanner;

public class S3EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("ingrese el numero:");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("el numero es negativo");
        } else if (numero % 2 ==0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    }

}
