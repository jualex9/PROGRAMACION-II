import java.util.Scanner;

public class S41EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz 2x5 con vocales minúsculas y mayúsculas
        char[][] vocales = {
                {'a', 'e', 'i', 'o', 'u'},
                {'A', 'E', 'I', 'O', 'U'}
        };

        // Pedir una letra
        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        boolean esVocal = false;

        // Revisar si la letra está en la matriz
        for (int i = 0; i < vocales.length; i++) {
            for (int j = 0; j < vocales[i].length; j++) {
                if (letra == vocales[i][j]) {
                    esVocal = true;
                }
            }
        }

        // Mostrar resultado
        if (esVocal) {
            System.out.println(letra + " es una vocal.");
        } else {
            System.out.println(letra + " no es una vocal.");
        }
    }
}
