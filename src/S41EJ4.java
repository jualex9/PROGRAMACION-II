public class S41EJ4{
    public static void main(String[] args) {
        // Guardar el alfabeto en un arreglo
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Recorrer el arreglo con un bucle for
        for (char letra : alfabeto) {
            // Si la letra es vocal, se salta con "continue"
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                continue;
            }
            // Mostrar la letra
            System.out.print(letra + " ");
        }
    }
}
