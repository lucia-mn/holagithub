import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int suma = 0;
            int numero;

            System.out.print("Inserta un número (0 para salir): ");
            numero = scanner.nextInt();

            // Bucle while que se ejecuta hasta que el número sea 0
            while (numero != 0) {
                suma += numero; // Sumar el número ingresado
                System.out.print("Inserta un número (0 para salir): ");
                numero = scanner.nextInt(); // Leer el siguiente número
            }

            System.out.println("La suma de los valores es " + suma);
        }
}