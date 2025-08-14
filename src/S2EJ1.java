import java.util.Scanner;

public class S2EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double precioSinIVA, precioConIVA;
        boolean aplicaIVA;
        int stock;
        final double IVA = 0.19;

        System.out.print("Ingrese el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el precio sin IVA: ");
        precioSinIVA = sc.nextDouble();
        System.out.print("¿Aplica IVA? (true/false): ");
        aplicaIVA = sc.nextBoolean();
        System.out.print("Ingrese el stock disponible: ");
        stock = sc.nextInt();

        if (aplicaIVA) {
            precioConIVA = precioSinIVA * (1 + IVA);
        } else {
            precioConIVA = precioSinIVA;
        }
        System.out.println("-----------informacion del producto-----------");
        System.out.println("nombre: " + nombre);
        System.out.println("precio sin iva: " + String.format("%.2f", precioSinIVA));
        System.out.println("¿aplica IVA? " + (aplicaIVA ? "si" : "no"));
        System.out.println("precio con iva: " + String.format("%.2f", precioConIVA));
        System.out.println("stock: " + stock + " inidades");

        sc.close();
    }
}