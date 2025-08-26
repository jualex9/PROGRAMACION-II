public class S4EJ3 {
    public static void main(String[] args) {

        String[] persona = new String[3];

        persona[0] = "Juan Pérez";
        persona[1] = "123456789";
        persona[2] = "20";


        System.out.println("Nombre: " + persona[0]);
        System.out.println("Documento: " + persona[1]);
        System.out.println("Edad: " + persona[2]);


        int edad = Integer.parseInt(persona[2]);
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}
