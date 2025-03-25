package ejerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/numNaturales.txt");

        try {
            obtenerSumaNumerosArchivo(f);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void obtenerSumaNumerosArchivo(File f) throws FileNotFoundException {
        int numero, suma = 0, cont = 0;
        Scanner entrada = new Scanner(f);

        while (entrada.hasNextInt()) {
            numero = entrada.nextInt();
            System.out.println(numero);
            suma += numero;
            cont++;
        }

        System.out.println("Números leídos: " + cont);
        System.out.println("Suma: " + suma);

        entrada.close();
    }
}
