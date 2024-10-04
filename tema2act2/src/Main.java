import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cuántos años tienes: ?");
        int edad = scan.nextInt();
        System.out.println("¿Crédito en la tarjeta?");
        int dinero = scan.nextInt();

        if (edad >= 21 && dinero >= 10.000) {
            System.out.println("Apto");
        } else {
            System.out.println("No apto");
        }
    }
}