public class S5EJ5 {

    public static int add(int a, int b) {
        return a + b;
    }


    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {

        int suma2 = add(5, 10);
        int suma3 = add(2, 4, 6);
        int suma4 = add(1, 2, 3, 4);

        System.out.println("Suma de 2 números: " + suma2);
        System.out.println("Suma de 3 números: " + suma3);
        System.out.println("Suma de 4 números: " + suma4);
    }
}
