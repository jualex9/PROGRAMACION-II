public class S4EJ5 {
    public static void main(String[] args) {
        // Matriz 6x1 con números enteros
        int[][] matriz = {
                {2},
                {3},
                {4},
                {5},
                {6},
                {7}
        };

        System.out.println("Resultados de las multiplicaciones:");

        // Multiplicar posición i con la siguiente
        for (int i = 0; i < matriz.length - 1; i++) {
            int resultado = matriz[i][0] * matriz[i + 1][0];
            System.out.println("Posición " + i + " x Posición " + (i + 1) + " = " + resultado);
        }
    }
}
