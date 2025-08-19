import java.util.Scanner;

public class S2EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese la nota");
        double nota = sc.nextDouble();

        if (nota >= 3.0) {
            System.out.println("El estudiante GANÓ el quiz.");
        } else {
            System.out.println("El estudiante PERDIÓ el quiz.");
        }


      sc.close();
    }

}
