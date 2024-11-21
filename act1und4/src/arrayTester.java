import java.util.Scanner;

public class arrayTester {
    Scanner sc = new Scanner(System.in);
    int[] enteros;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los arrays: ");
        int totalEnteros = sc.nextInt();

        int[] enteros = leerEnteros(totalEnteros);

        System.out.println("Array original: ");
        imprimirArray(int[] enteros);

        int[] arrayTransformado = transformarArray(enteros);

        System.out.println("Array transformado: ");
        imprimirArray(arrayTransformado);
    }


    public static int[] leerEnteros (int totalEnteros) {

        int[] enteros = new int [totalEnteros];

        for (int i = 0; i < enteros.length; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce los números de array " + i + ": ");
            enteros[i] = sc.nextInt();
        }
        return enteros;
    }

    public static void imprimirArray (int[] enteros) {

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("La posición " + i + " tiene un valor de " + enteros[i]);
        }
    }

    public static int[] transformarArray (int[] enteros) {

        int[] transformar = new int[enteros.length];

        for (int i = 0; i < enteros.length; i++) {

            if (enteros[i] % 2 == 0) {
                transformar[i] = enteros[i];

            } else {
                transformar[i] = -1;
            }
        }
        return transformar;
    }

}

