import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int limite;

        do {
            System.out.print("Inserta el primer número (mayor que 0): ");
            num1 = scanner.nextInt();

            System.out.print("Inserta el segundo número (mayor que el primero): ");
            num2 = scanner.nextInt();

            System.out.print("Inserta el límite de la serie (mayor que 2 y menor o igual que 30): ");
            limite = scanner.nextInt();

            if (num1 <= 0 || num2 <= num1 || limite <= 2 || limite > 30) {
                System.out.println("Datos incorrectos. Por favor, introduce valores válidos.");
            }
        } while (num1 <= 0 || num2 <= num1 || limite <= 2 || limite > 30);


        int contador = 2;

        while (contador < limite) {
            int siguiente = num1 + num2;
            System.out.print(siguiente + " ");

            num1 = num2;
            num2 = siguiente;

            contador++;

        }
    }
}