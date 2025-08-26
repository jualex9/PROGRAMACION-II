public class S41EJ3 {
    public static void main(String[] args) {
        // Arreglo con edades
        int[] edades = {12, 17, 18, 25, 30, 15, 20};

        int menores = 0, mayores = 0;

        // Recorremos el arreglo
        for (int edad : edades) {
            if (edad < 18) {
                menores++;
            } else {
                mayores++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de menores de edad: " + menores);
        System.out.println("Cantidad de mayores de edad: " + mayores);
    }
}

