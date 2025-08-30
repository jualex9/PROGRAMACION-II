public class S5EJ4 {

 public static int obtenerMenor(int[] edades){
     int menor = edades[0];
     for (int edad : edades){
         if(edad < menor){
             menor = edad;
         }
     }
     return menor;
 }
    public static int obtenerMayor(int[] edades){
        int mayor = edades[0];
        for (int edad : edades){
            if(edad < mayor){
                mayor = edad;
            }
        }
        return mayor;
    }


   public static double obtenerPromedio(int[] edades){
     int suma = 0;
     for(int edad : edades){
         suma += edad;
     }
     return (double) suma / edades.length;
   }

    public static void main(String[] args) {

        int[] edades = {18, 25, 30, 15, 40, 22, 19, 28, 33, 20};

        int menor = obtenerMenor(edades);
        int mayor = obtenerMayor(edades);
        double promedio = obtenerPromedio(edades);

        System.out.println("Edad menor: " + menor);
        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad promedio: " + promedio);
    }
}
