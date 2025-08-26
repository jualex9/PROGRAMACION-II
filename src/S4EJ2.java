import java.util.ArrayList;

public class S4EJ2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregamos valores
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Imprimir el último valor
        System.out.println("Último valor: " + numeros.get(numeros.size() - 1));

        // Agregamos otro valor
        numeros.add(99);

        // Imprimir nuevamente el último valor
        System.out.println("Último valor después de agregar: " + numeros.get(numeros.size() - 1));
    }
}
