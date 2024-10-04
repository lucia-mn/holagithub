import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Contador?");
        int contador = scan.nextInt();

        while (contador <= 4) {
            System.out.println("contador es: " + contador);
            contador = contador +1;
        }

        //se imprimirán -2, -1, 0, 1
        //se acaba el bucle
    }
}
