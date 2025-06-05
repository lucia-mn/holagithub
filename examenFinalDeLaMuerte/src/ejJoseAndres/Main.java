package ejJoseAndres;

import java.io.*;
import java.util.*;

public class Main {

    // File j = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres.txt");
    // File ja = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/joseAndres2.txt");
    static final String INPUT_PATH = "C:\\Users\\lucia\\Desktop\\holagithub-master\\lecturaEscritura\\joseAndres.txt";
    static final String OUTPUT_PATH = "C:\\Users\\lucia\\Desktop\\holagithub-master\\lecturaEscritura\\joseAndres2.txt";
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
                        añadirProfesor(scanner);
                        break;

                    case 2:
                        eliminarProfesor(scanner);
                        break;

                    case 3:
                        mostrarProfesores();
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        System.out.println("Has salido del programa, vuelve pronto :)");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir números del menú");
            }
        }
    }


    private static void añadirProfesor(Scanner scanner) {
        System.out.println("Introduce los datos del profesor separados por ';' (nombre;apellido;asignatura;sueldo):");
        String linea = scanner.nextLine();
        String[] datos = linea.split(";");
        if (datos.length == 4) {
            if (profesores.add(linea.trim())) {
                System.out.println("Profesor añadido.");
            } else {
                System.out.println("Ese profesor ya existe (no se añade duplicado).");
            }
        } else {
            System.out.println("Debes introducir exactamente 4 campos.");
        }
    }

    private static void eliminarProfesor(Scanner scanner) {
        mostrarProfesores();
        System.out.println("Copia exacta de la línea del profesor que quieres eliminar:");
        String linea = scanner.nextLine();
        if (profesores.remove(linea.trim())) {
            System.out.println("Profesor eliminado.");
        } else {
            System.out.println("No se encontró esa línea.");
        }
    }

    private static void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
        } else {
            System.out.println("Profesores:");
            for (String linea : profesores) {
                System.out.println("• " + linea);
            }
        }
    }
}
