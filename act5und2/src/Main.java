import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();


        while (numero != 0); {
            suma += numero;
            System.out.println("Inserta 0 para salir: ");
            numero = scanner.nextInt();
        }
        System.out.println("la suma es" +suma);
    }
}