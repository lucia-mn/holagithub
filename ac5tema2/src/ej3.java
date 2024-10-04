import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        int contador = 0;
        int impar = 0;

        System.out.print("Inserta un número: ");
        numero = scanner.nextInt();


        while (numero != 0) {
            suma += numero;
            contador ++;
            System.out.print("Inserta 0 para salir: ");
            numero = scanner.nextInt();

            if (numero % 2 == 1){
                impar++;
            }

        }
        System.out.println("La suma de los valores es " + suma);
        System.out.println("Total de número insertados es " + contador);
        System.out.println("Total números impares es " +impar);
    }
}
