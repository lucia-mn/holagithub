package ejJoseAndres;

import java.io.*;
import java.util.*;

public class Main {

    // File j = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres.txt");
    // File ja = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres2.txt");
    static final String INPUT_PATH = "/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres.txt";
    static final String OUTPUT_PATH = "/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres2.txt";
    static Set<String> profesores = new HashSet<>();

    public static void main(String[] args) {
        cargarProfesores();
        imprimirMenu();
        guardarProfesores();
    }


    //metodos
    private static void cargarProfesores() {
        File j = new File(INPUT_PATH);

        try (Scanner entrada = new Scanner(j)) {
            while (entrada.hasNextLine()) {

                String linea = entrada.nextLine().trim();
                String[] datos = linea.split(";");
                if (datos.length == 4) {
                    profesores.add(linea);
                }
            }
            System.out.println("Profesores cargados");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    private static void guardarProfesores() {
        try (PrintWriter salida = new PrintWriter(new FileWriter(OUTPUT_PATH))) {
            for (String linea : profesores) {
                salida.println(linea);
            }
            System.out.println("Profesores guardados en " + OUTPUT_PATH);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }


    private static void imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n====== MENÚ DE PROFESORES ======");
            System.out.println("""
                    0 - Salir
                    1 - Añadir un profesor
                    2 - Eliminar un profesor
                    3 - Mostrar todos los profesores
                    """);
            System.out.println("- - - - - - - - - - - - - - - - - - - -");

            try {
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        System.out.println("Has salido del programa, vuelve pronto :)");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir números del menú");
            }
        }
    }
}