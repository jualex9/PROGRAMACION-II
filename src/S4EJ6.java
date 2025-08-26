public class S4EJ6 {
    public static void main(String[] args) {
        // Notas de los estudiantes (ejemplo)
        double[] notas = {3.5, 4.0, 2.8, 5.0, 3.2, 4.5, 2.9, 3.8, 4.7, 3.0};

        double suma = 0;

        // Recorremos el arreglo y sumamos
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        // Calculamos el promedio
        double promedio = suma / notas.length;

        System.out.println("El promedio de las notas es: " + promedio);
    }
}
