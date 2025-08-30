public class S5EJ2 {
    public static double calculadorArea(double largo, double ancho){
        return largo * ancho;
    }
    public static double calculadorPerimetro(double largo, double ancho){
        return 2*(largo+ancho);
    }
    public static void main(String[] args) {
        double largo = 10;
        double ancho = 5;

        double area = calculadorArea(largo,ancho);
        double perimetro = calculadorPerimetro(largo,ancho);

        System.out.println("area: " +area);
        System.out.println("perimetro: " + perimetro);


    }
}
