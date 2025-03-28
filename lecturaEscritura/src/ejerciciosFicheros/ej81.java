package ejerciciosFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej81 {
    public static void main(String[] args) {

        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ocurrenciasPalabras.txt");
        String palabraBuscada = "tienda";

        try {
            int ocurrencias = contarOcurrencias(f, "tienda");
            System.out.println("En el archivo la palabra '" + palabraBuscada + "' tiene " + ocurrencias + " ocurrencias");

        } catch (FileNotFoundException e) {
            System.out.println("FAllo");
        }
    }


    //metodo
    private static int contarOcurrencias(File f, String palabraBuscada) throws FileNotFoundException {
        Scanner scan = new Scanner(f);
        int contador = 0;

        while (scan.hasNext()) {
            if (scan.next().equalsIgnoreCase(palabraBuscada)) {
                contador++;
            }
        }
        scan.close();
        return contador;
    }
}
