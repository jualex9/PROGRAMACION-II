import java.util.Scanner;

public class S5EJ3 {

    public static char[] vocales = {'a','e','i','o','u'};

    public static boolean esVocal(char letra){
        for(char vocal : vocales){
            if(vocal==letra){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la letra");
       char letra = sc.next().toLowerCase().charAt(0);

       if (esVocal(letra)){
           System.out.println("la letra " + letra + "es vocal");
       }else {
           System.out.println("la letra " + letra + " no es vocal");
       }

    }
}
