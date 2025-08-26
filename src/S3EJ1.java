import java.util.Scanner;

public class S3EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dígito (0-9): ");
        int d = sc.nextInt();

        switch (d) {
            case 0 -> System.out.println("cero");
            case 1 -> System.out.println("uno");
            case 2 -> System.out.println("dos");
            case 3 -> System.out.println("tres");
            case 4 -> System.out.println("cuatro");
            case 5 -> System.out.println("cinco");
            case 6 -> System.out.println("seis");
            case 7 -> System.out.println("siete");
            case 8 -> System.out.println("ocho");
            case 9 -> System.out.println("nueve");
            default -> System.out.println("Entrada inválida. Debe ser un dígito entre 0 y 9.");
        }

        sc.close();
    }
}
