import java.util.Scanner;

public class S3EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1;
        int nota2;
        double promedio;

        System.out.println("ingrese la primera nota: ");
        nota1 = sc.nextInt();

        System.out.println("ingrese la segunda nota: ");
        nota2 = sc.nextInt();

        promedio = ((nota1 * 0.7) + (nota2 * 0.3));

        if (promedio >= 3.0) {
            System.out.println("aprobado");
        } else{
            System.out.println("reprobado");
        }
    }
}

