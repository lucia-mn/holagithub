package ejerciciosFicheros;

import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ej3 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/primos.txt");

        escribirPrimos(String.valueOf(f));
        leerPrimos(String.valueOf(f));
    }


    //metodos
    private static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    private static void escribirPrimos(String f) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(f))){
            for (int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    writer.println(i);
                }
            }
            System.out.println("Escribir primos: " + f);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void leerPrimos(String f) {
        try (PrintWriter salida = new PrintWriter(f);){
            List<PrintWriter> primos = new ArrayList<>();
            primos.add(salida);

            System.out.println("Lista de números primos: ");
            System.out.println(primos);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
