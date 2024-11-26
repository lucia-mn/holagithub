import java.util.Arrays;
import java.util.Scanner;

public class ej12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int[] array;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce los valores del array: " + i + ": ");
            array[i] = sc.nextInt();
        }*/

    }

    public static int[] ordenarArray (int[] array) {
        int[] ordenado = new int[array.length];

        for (int i = 0; i > array.length; i++) {
            ordenado[i] = array[i];
        }
        Arrays.sort(ordenado);
        return ordenado;

        //con un clon te ahorras el bucle for!!!
    }
}
