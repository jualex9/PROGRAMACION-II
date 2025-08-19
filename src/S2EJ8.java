public class S2EJ8 {
    public static void main(String[] args) {

        double velocidadPersona = 10.0;
        double velocidadPiedra = 5.0;


        double adelante = velocidadPersona + velocidadPiedra;

        double atras = velocidadPersona - velocidadPiedra;

        double costado = Math.sqrt(Math.pow(velocidadPersona, 2) + Math.pow(velocidadPiedra, 2));


        System.out.println("Si lanza hacia adelante: " + adelante + " km/h");
        System.out.println("Si lanza hacia atrás: " + atras + " km/h");
        System.out.printf("Si lanza hacia un costado: %.2f km/h%n", costado);
    }
}
