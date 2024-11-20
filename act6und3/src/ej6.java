import java.util.Scanner;

public class ej6 {

    private static final int min = 1;
    private static final int max = 100;

    public static void main(String[] args) {

        int numeroSecreto;
        numeroSecreto = min + (int) (Math.random() * max);


        Scanner sc = new Scanner(System.in);
        int numero = 0;


        do {
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();

            if (numeroSecreto > numero) {
                System.out.println("Número bajo");

            } else if (numeroSecreto < numero) {
                System.out.println("Número alto");

            } else {
                System.out.println("¡Has acertado!");
            }

        } while (numero != numeroSecreto);
    }

}
