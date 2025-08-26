import java.util.Scanner;

public class S41EJ5 {
    public static void main(String[] args) {
        // Lista de meses en desorden
        String[] meses = {"Julio", "Enero", "Marzo", "Diciembre", "Agosto", "Mayo", "Septiembre", "Abril", "Noviembre", "Febrero", "Octubre", "Junio"};

        Scanner sc = new Scanner(System.in);

        // Pedir mes al usuario
        System.out.print("Ingrese el nombre de un mes: ");
        String mesBuscado = sc.nextLine();

        int ciclos = 0; // contador de ciclos

        // Buscar en la lista
        for (String mes : meses) {
            ciclos++; // aumenta en cada ciclo
            if (mes.equalsIgnoreCase(mesBuscado)) { // comparación sin importar mayúsculas/minúsculas
                System.out.println("Mes encontrado: " + mes);
                System.out.println("Se ejecutaron " + ciclos + " ciclos.");
                break; // detener el ciclo cuando se encuentra
            }
        }
    }
}
