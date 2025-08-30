public class S5EJ1 {
    public static void convertidorDolares(double[] salarios , double tasaCambio){
        for (int i = 0; i < salarios.length; i++){
            salarios[i] = salarios[i] / tasaCambio;
        }
    }
    public static void main(String[] args){
        double tasaCambio = 4000;

        double[] salarios = {2000000, 3500000, 5000000, 1200000};

        convertidorDolares(salarios,tasaCambio);

        System.out.println("salarios en USD");
        for (double salario : salarios){
            System.out.println("$" + String.format("%.2f" , salario));
        }
    }
}

