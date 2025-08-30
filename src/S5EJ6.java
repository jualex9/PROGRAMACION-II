import java.util.ArrayList;

class Empleado {
    // Atributo de clase
    int diasTrabajados;

    // Constructor
    public Empleado(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    // Método para calcular el pago de este empleado
    public int calcularPago(int pagoPorDia) {
        return diasTrabajados * pagoPorDia;
    }
}

public class S5EJ6 {
    public static void main(String[] args) {
        // Lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Supongamos que cada empleado trabajó estos días
        int[] dias = {5, 7, 6, 8, 10, 4, 9, 3, 7, 6};

        // Crear empleados con sus días
        for (int d : dias) {
            empleados.add(new Empleado(d));
        }

        // Calcular el total a pagar
        int total = calcularTotal(empleados, 50); // pagoPorDia = 50

        // Mostrar el resultado
        System.out.println("El total a pagar es: $" + total);
    }

    // Método que suma el total de todos los empleados
    public static int calcularTotal(ArrayList<Empleado> empleados, int pagoPorDia) {
        int total = 0;
        for (Empleado e : empleados) {
            total += e.calcularPago(pagoPorDia);
        }
        return total;
    }
}
