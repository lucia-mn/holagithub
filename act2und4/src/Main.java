import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int size;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Tamaño?");
        size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserta un entero: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Número " + array[i]);
        }
    }

    // la dimensión del array se mete en el array
    //int[] array = new int[0]; esto no sería porque le hemos dado al array un valor de 0; sería: int[] array = new int[size];

}


//josé andréss
/*
2. hay que hacer primero un array.sort (nombre) para que lo ordene de menor a mayor y luego un
println (nombre[i])
A continuación, como el más grande es el del final hacer un sout con el .lenght -1 o como en este
caso sí que sabemos el lenght del array poner la posición última del array.
 */
