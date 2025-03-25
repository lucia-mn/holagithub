package ejerciciosFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ej1 {
    public static void main(String[] args) {
        File f = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/numNaturales.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(f))) {
            for (int i = 1; i <= 100; i++) {
                //Integer.toString(i);
                writer.println(i);
            }
            System.out.println("Archivo creado");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
