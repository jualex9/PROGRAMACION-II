import java.util.Scanner;

class Numero {
    int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public String aPalabra() {
        switch (valor) {
            case 0: return "Cero";
            case 1: return "Uno";
            case 2: return "Dos";
            case 3: return "Tres";
            case 4: return "Cuatro";
            case 5: return "Cinco";
            case 6: return "Seis";
            case 7: return "Siete";
            case 8: return "Ocho";
            case 9: return "Nueve";
            default: return "Número inválido";
        }
    }
}
public class S5EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un dígito (0-9): ");
        int digito = sc.nextInt();

        Numero num = new Numero(digito);

        String palabra = num.aPalabra();

        System.out.println("El número en palabras es: " + palabra);
    }
}
