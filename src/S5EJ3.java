import java.util.Scanner;

public class S5EJ3 {

    // 🔹 Atributo de clase: arreglo de vocales
    private static char[] vocales = {'a', 'e', 'i', 'o', 'u'};

    // Método para verificar si una letra es vocal
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra); // convertir a minúscula
        for (char v : vocales) {
            if (v == letra) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar letra
        System.out.print("Ingrese una letra: ");
        char letra = sc.next().charAt(0);

        // Verificar
        if (esVocal(letra)) {
            System.out.println("✅ La letra '" + letra + "' es una vocal.");
        } else {
            System.out.println("❌ La letra '" + letra + "' no es una vocal.");
        }

        sc.close();
    }
}
