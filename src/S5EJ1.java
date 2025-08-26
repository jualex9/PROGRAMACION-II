import java.util.ArrayList;

public class S5EJ1 {
    public static void main(String[] args) {
        // 1. Crear lista de salarios en pesos colombianos (COP)
        ArrayList<Double> salarios = new ArrayList<>();
        salarios.add(3500000.0);
        salarios.add(2200000.0); // 2.200.000 COP
        salarios.add(5000000.0); // 5.000.000 COP
        salarios.add(1200000.0); // 1.200.000 COP

        // 2. Llamar al método para convertir a dólares
        convertirADolares(salarios);

        System.out.println("dinero en dolares");
        for (double salario : salarios){
            System.out.println("$" + salario);
        }
    }

        // 3. Imprimir resultados (ya están modificados por referencia)

    // Método que convierte COP a USD (modifica la lista directamente)
    public static void convertirADolares (ArrayList<Double> lista){
        // Supongamos que la TRM (tasa de cambio) es 1 USD = 4000 COP
        double tasaCambio = 4000.0;

        for (int i = 0; i < lista.size(); i++){    //lista.size devuelve cuntos elemetos hay
                                                   //condición: sigue repitiendo mientras i sea menor que el tamaño de la lista
            double salarioColombia = lista.get(i);  //lista.get(i) accedemos al elemento en la posición i de la lista
            double salarioUSD = salarioColombia / tasaCambio;
            lista.set(i, salarioUSD); // modificamos directamente la lista // get Reemplaza el valor en la posición i de la lista por el nuevo salario en dólares.
        }
    }
}
