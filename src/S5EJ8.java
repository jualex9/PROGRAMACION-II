import java.util.Scanner;

public class S5EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] espanol = {"gato", "perro", "casa", "agua", "comida"};
        String[] ingles  = {"cat", "dog", "house", "water", "food"};

        System.out.print("Ingrese una palabra en español: ");
        String palabra = sc.nextLine().toLowerCase();

        boolean encontrada = false;
        for (int i = 0; i < espanol.length; i++) {
            if (espanol[i].equals(palabra)) {
                System.out.println("En inglés es: " + ingles[i]);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("La palabra no está en el diccionario.");
        }
    }
}
