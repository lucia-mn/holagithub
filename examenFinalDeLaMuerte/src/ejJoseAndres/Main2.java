package ejJoseAndres;

import java.io.*;
import java.util.*;

public class Main2 {

    static final String INPUT_PATH = "C:\\Users\\lucia\\Desktop\\holagithub-master\\lecturaEscritura\\joseAndres.txt";
    static final String OUTPUT_PATH = "C:\\Users\\lucia\\Desktop\\holagithub-master\\lecturaEscritura\\joseAndres2.txt";
    static Set<String> profesores = new LinkedHashSet<>();

    public static void main(String[] args) {
        cargarProfesores();
        imprimirMenu();
    }

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
            System.out.println("Profesores cargados.");
        } catch (IOException e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }

    private static void guardarProfesores() {
        try (PrintWriter salida = new PrintWriter(new FileWriter(OUTPUT_PATH))) {
            for (String linea : profesores) {
                salida.println(linea);
            }
            System.out.println("Profesores exportados a " + OUTPUT_PATH);
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
                    4 - Exportar profesores al archivo
                    """);
            System.out.println("- - - - - - - - - - - - - - - - - - - -");

            try {
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer

                switch (opcion) {
                    case 1 -> añadirProfesor(scanner);
                    case 2 -> eliminarProfesor(scanner);
                    case 3 -> mostrarProfesores();
                    case 4 -> guardarProfesores();
                    case 0 -> {
                        System.out.println("Saliendo del programa...");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Solo puedes introducir números del menú");
                scanner.nextLine(); // limpiar entrada errónea
            }
        }
    }

    private static void añadirProfesor(Scanner scanner) {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine().trim();

        System.out.print("Introduce el apellido: ");
        String apellido = scanner.nextLine().trim();

        System.out.print("Introduce la asignatura: ");
        String asignatura = scanner.nextLine().trim();

        System.out.print("Introduce el sueldo: ");
        String sueldo = scanner.nextLine().trim();

        String linea = nombre + ";" + apellido + ";" + asignatura + ";" + sueldo;
        if (profesores.add(linea)) {
            System.out.println("Profesor añadido correctamente.");
        } else {
            System.out.println("Ese profesor ya existe (no se añade duplicado).");
        }
    }

    private static void eliminarProfesor(Scanner scanner) {
        List<String> listaProfesores = new ArrayList<>(profesores);

        if (listaProfesores.isEmpty()) {
            System.out.println("No hay profesores que eliminar.");
            return;
        }

        System.out.println("Selecciona el número del profesor que quieres eliminar:");
        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println((i + 1) + " - " + listaProfesores.get(i));
        }

        try {
            System.out.print("Número: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (indice >= 1 && indice <= listaProfesores.size()) {
                String eliminado = listaProfesores.get(indice - 1);
                profesores.remove(eliminado);
                System.out.println("Profesor eliminado: " + eliminado);
            } else {
                System.out.println("Número fuera de rango.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número válido.");
            scanner.nextLine(); // limpiar buffer
        }
    }

    private static void mostrarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores cargados.");
        } else {
            System.out.println("Lista de profesores:");
            int i = 1;
            for (String linea : profesores) {
                System.out.println(i + " - " + linea);
                i++;
            }
        }
    }
}
