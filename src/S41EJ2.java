public class S41EJ2 {
    public static void main(String[] args) {
        // Arreglo con números
        int[] numeros = {10, 23, 45, 66, 78, 91, 100};

        int pares = 0, impares = 0;

        // Recorremos el arreglo
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
