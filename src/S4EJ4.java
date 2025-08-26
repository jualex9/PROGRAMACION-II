public class S4EJ4 {
    public static void main(String[] args) {
        // Lista (arreglo) de donaciones en dólares
        double[] donaciones = {10, 20, 15, 5, 50, 100, 30, 25, 40};

        double totalDolares = 0;

        // Recorrer la lista y sumar
        for (int i = 0; i < donaciones.length; i++) {
            totalDolares += donaciones[i];
        }

        // Conversión a pesos colombianos (1 dólar = 4000 COP)
        double tasaCambio = 4000;
        double totalPesos = totalDolares * tasaCambio;

        // Mostrar resultados
        System.out.println("Total en dólares: $" + totalDolares);
        System.out.println("Total en pesos colombianos: $" + totalPesos);
    }
}
