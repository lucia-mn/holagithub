import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Contadores?");
        int contador = scan.nextInt();

        while (contador <= 3) {
            System.out.println("contador es: " + contador);
            contador = contador +1;
            }
        }
    }

