import java.util.Scanner;

public class S2EJ7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("incribe el numero: ");
        short numero = sc.nextShort();

        if (numero >=0 && numero <= 9 ){
            System.out.println("el numero es un digito ");
        } else {
            System.out.println("el numero no es un digito ");
        }
    }
}
