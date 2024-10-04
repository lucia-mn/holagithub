import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int numero = i;
        System.out.println("Elige un número:");
        numero = scan.nextInt();

        if (numero >= i) {
            System.out.println("El número" +numero + "es positivo");
            System.out.println("Todos los números positivos son mayores a cero");
        } else {
            System.out.println("El número" +numero + " es negativo");
        }
    }
}
