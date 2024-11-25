import java.util.Scanner;
import java.util.Arrays;

public class ej2y3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Introduce 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maximo = obtenerMaximo(numeros);
        System.out.println("El máximo valor del array es: " + maximo);
    }


    public static int obtenerMaximo(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // meto 10 numeros, devulve un métodos int que recorra el máximo del array y devuelva el maximo valor del array
    //recorres el bucle sin ordenarlo y lo sacas; ordenarlo es el en ejercicio 3 (lo del .sort)
    // para la ordenación se hace con el .sort


    //eduardo
    //COGES EL PRIMER VALOR COMO EL MÁXIMO Y LUEGO LO VAS COMPARANDO CON EL RESTO DE VALORES DEL ARRAY (CON UN BUCLE)!!!
    //HACER LAS VARIABLES COMO CONSTANTES!!!
    //MANTENER EL VALOR MÁXIMO EN UNA VARAIBLE CON UN FOR Y UN IF
    //para practicar pasar valores a una función que devuelva los valores máximos y mínimos a un entero; pasar el array a entero
}

//INTEGER: max-min (inicializar las variables con el integre)
// public static int maxArray (int[] array) {

// return;
// }