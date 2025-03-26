package ejerciciosFicheros;

import java.io.*;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/contar.txt");

        int voc = 0, cons = 0, num = 0;

        try {
            Scanner entrada = new Scanner(f);

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine().toLowerCase();

                for (char caracter : linea.toCharArray()) {
                    if (Character.isDigit(caracter)) {
                        num++;
                    } else if ("aeiouáéíóú".indexOf(caracter) != -1) {
                        voc++;
                    } else if (Character.isLetter(caracter)) {
                        cons++;
                    }
                }
            }
            entrada.close();

            System.out.println("Número de vocales: " + voc);
            System.out.println("Número de consonantes: " + cons);
            System.out.println("Número de números: " + num);

        } catch (FileNotFoundException e) {
            System.out.println("FALLOOO");
        }
    }
}
