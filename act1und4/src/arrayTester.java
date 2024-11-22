/*import java.util.Scanner;

public class arrayTester {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEnteros;
        System.out.println("Introduce cuántos elementos tiene el array: ");
        totalEnteros = sc.nextInt();

        int[] enterosDelArray = leerEnteros(totalEnteros);

        System.out.println(imprimirArray (int enterosDelAray));
    }

    /*
    Debes seguir un flujo lógico:

    Pedir el tamaño del array.
    Leer los números del usuario con leerEnteros.
    Imprimir el array original con imprimirArray.
    Transformar el array con transformarArray.
    Imprimir el array transformado con imprimirArray.




    public static int[] leerEnteros (int totalEnteros) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[totalEnteros];

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Introduce los números del array: ");
            enteros[i] = sc.nextInt();
        }
        return enteros;
    }

    public static int[] imprimirArray (int enterosDelArray) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int [enterosDelArray];

        for(int i = 0; i < array.length; i++) {
            System.out.println("El array con el exponente " + i + " tiene un valor de: " + array[i]);
            array[i] = sc.nextInt();
        }
        return array;
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

}*/

import java.util.Scanner;

public class arrayTester {

    public static void main(String[] args) {
        imprimirArray(transformarArray(leerEnteros()));
    }

    public static int[] leerEnteros () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuántos elementos tiene el array: ");
        int totalEnteros = sc.nextInt();

        int[] enteros = new int[totalEnteros];

        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Introduce un número del array: ");
            enteros[i] = sc.nextInt();
        }
        return enteros;
    }

    public static void imprimirArray (int[] enteros) {
        /*for (int i = 0; i < enteros.length; i++) {
            System.out.println("El array con el índice " + i + " tiene un valor de: " + enteros[i]);
        }*/

        /*for (int numero : enteros) {
            System.out.println("El array con el índice " + numero + " tiene un valor de: " + enteros[]);
        }*/

        //for each
        for (int numero : enteros){
            System.out.print(numero + " ");
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


