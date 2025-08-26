import java.util.Scanner;

public class S3EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ganancia;
        double impuesto;

        System.out.println("ingrese lo ganado en salarios minimos");
        ganancia = sc.nextDouble();

        if (ganancia > 100) {
            impuesto = ganancia * 0.40;
        } else {
            impuesto = ganancia * 0.20;
        }

        System.out.println("impuesto a pagar:" + impuesto + "salierios minimos");

    }

}
