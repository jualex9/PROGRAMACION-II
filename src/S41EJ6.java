public class S41EJ6 {
    public static void main(String[] args) {
        // Lista de números
        int[] numeros = {8, 10, 15, 21, 7, 9, 11, 13};

        // Buscar el primer primo
        for (int num : numeros) {
            if (esPrimo(num)) {
                System.out.println("El primer número primo encontrado es: " + num);
                break; // detenemos el ciclo
            }
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) return false; // no son primos los <= 1
        for (int i = 2; i <= Math.sqrt(n); i++) { // solo hasta la raíz cuadrada
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
