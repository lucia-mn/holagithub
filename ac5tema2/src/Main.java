import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.print("Inserta 0 para salir): ");
        numero = scanner.nextInt();


        while (numero != 0) {
            suma += numero;
            System.out.print("Inserta 0 para salir): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los valores es " + suma);
    }
}