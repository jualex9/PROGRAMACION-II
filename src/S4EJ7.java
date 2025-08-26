import java.util.ArrayList;
import java.util.List;

public class S4EJ7 {
    public static void main(String[] args) {
        // Creamos una lista de enteros positivos
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(10);
        numeros.add(15);
        numeros.add(22);

        // Recorremos con foreach y verificamos si son pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num + " es un número par.");
            }
        }
    }
}

