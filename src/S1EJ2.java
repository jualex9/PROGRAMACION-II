import java.util.Scanner;

public class S1EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreHuesped;
        short diasReservados;
        double tarifaDiaria;
        boolean vistaAlMar;
        short numHabitaciones;
        double total;


        System.out.print("Ingrese el nombre del huésped: ");
        nombreHuesped = sc.nextLine();

        System.out.print("Ingrese el número de días reservados: ");
        diasReservados = sc.nextShort();

        System.out.print("Ingrese la tarifa diaria por habitación: ");
        tarifaDiaria = sc.nextDouble();

        System.out.print("¿La habitación tiene vista al mar? (true/false): ");
        vistaAlMar = sc.nextBoolean();

        System.out.print("Ingrese el número de habitaciones: ");
        numHabitaciones = sc.nextShort();


        total = diasReservados * tarifaDiaria * numHabitaciones;


        System.out.println("\n--- Información de la Reserva ---");
        System.out.println("Huésped: " + nombreHuesped);
        System.out.println("Días reservados: " + diasReservados);
        System.out.println("Tarifa diaria: $" + String.format("%.2f", tarifaDiaria));
        System.out.println("Vista al mar: " + (vistaAlMar ? "Sí" : "No"));
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Total a pagar: $" + String.format("%.2f", total));

        sc.close();
    }
}
