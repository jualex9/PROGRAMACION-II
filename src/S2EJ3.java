import java.util.Scanner;

public class S2EJ3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Variables
            String nombreCompleto;
            int edad;
            double estatura;
            char sexo;
            boolean casado;

            // Entrada de datos
            System.out.print("Ingrese el nombre completo: ");
            nombreCompleto = sc.nextLine();

            System.out.print("Ingrese la edad: ");
            edad = sc.nextInt();

            System.out.print("Ingrese la estatura en metros (ej: 1.75): ");
            estatura = sc.nextDouble();

            System.out.print("Ingrese el sexo (F/M): ");
            sexo = sc.next().charAt(0); // Toma solo el primer carácter

            System.out.print("¿Está casado? (true/false): ");
            casado = sc.nextBoolean();

            System.out.println("\n--- Datos Demográficos ---");
            System.out.println("Nombre completo: " + nombreCompleto);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Estatura: " + estatura + " m");
            System.out.println("Sexo: " + (sexo == 'F' || sexo == 'f' ? "Femenino" : "Masculino"));
            System.out.println("Estado civil: " + (casado ? "Casado/a" : "Soltero/a"));

            sc.close();
        }
    }
