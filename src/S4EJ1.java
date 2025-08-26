import java.util.Scanner;

public class S4EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        System.out.print("Ingresa una letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        boolean esVocal = false;


        for (char v : vocales) {
            if (letra == v) {
                esVocal = true;
                break;
            }
        }

        if (esVocal) {
            System.out.println("La letra '" + letra + "' es una vocal.");
        } else {
            System.out.println("La letra '" + letra + "' no es una vocal.");
        }

        sc.close();
    }
}

