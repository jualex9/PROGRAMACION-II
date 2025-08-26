import java.util.Scanner;

public class S3EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mujeres = 5;
        int sumaEdades = 0;
        int promedio;
        int edad;

        for (int i =1; i <= mujeres; i++){
            System.out.print("ingrese la edad de la mujer" + i + ":");
            edad = sc.nextInt();
            sumaEdades += edad;
        }

        promedio = sumaEdades / mujeres;
        System.out.println("el prmedio es:" + promedio);

        if (promedio < 18){
            System.out.println("la edad promedio es menor a 18 años");
        }





    }
}
