import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador;
        int incremento;

        System.out.println("Introduce un incremento");
        incremento = scanner.nextInt();

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("contador es: " + (contador * incremento));
        }
    }
}
