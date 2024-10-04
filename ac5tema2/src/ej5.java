import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        int contador = 0;
        int impar = 0;
        int objetivo;
        int contadores = 0;
        int max=0;

        System.out.println("Inserta un número objetivo: ");
        objetivo = scanner.nextInt();
        System.out.print("Inserta un número: ");
        numero = scanner.nextInt();


        while (numero != 0) {
            suma += numero;
            contador ++;
            System.out.print("Inserta 0 para salir: ");
            numero = scanner.nextInt();

            if (numero > max) {
                max = numero;
            }


            if (numero % 2 == 1){
                impar++;

                if (numero == objetivo) {
                    contadores++;
                }
            }
        }
        System.out.println("La suma de los valores es " + suma);
        System.out.println("Total de número insertados es " + contador);
        System.out.println("Total números impares es " +impar);
        System.out.println("El valor " +objetivo +" se insertó " +contadores +" veces");
        System.out.println("El valor máximo insertado es " +max);
    }
}