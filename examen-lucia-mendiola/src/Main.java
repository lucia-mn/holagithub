//lucia mendiola naharro

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Libro> libros = new ArrayList<>();
    private static Escritor escritor = new Escritor("Julio Verne", libros);

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro(12, "De la tierra a la luna", 15.5, 1212, 176, "Julio Verne");
        Libro libro2 = new Libro(21, "Miguel Strogoff", 18.9, 1234, 345, "Julio Verne");
        Libro libro3 = new Libro(23, "El juego del alma", 20.0, 3333, 234, "Javier Castillo");
        Libro libro4 = new Libro(54, "Cinco semanas en globo", 17.5, 1223, 243, "Julio Verne");

        imprimirMenu();
    }


    //metodos
    private static void imprimirMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("========================");
            System.out.println("         LIBROS         ");
            System.out.println("========================");
            System.out.println("""
                0 - Salir
                1 - Agregar libro
                2 - Eliminar libro
                3 - Buscar libro por ISBN
                4 - Buscar libro por nombre de artículo
                5 - Libro más económico
                6 - Mostrar colección
                """);
            System.out.println("- - - - - - - - - - - - - - - - - - - -");

            // solo funcionan el 4 y el 6
            try {
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        //addLibro();
                        break;

                    case 2:
                        //remLibro();
                        break;

                    case 3:
                        //buscarLibroIsbn();
                        break;

                    case 4:
                        buscarLibroNombre();
                        break;

                    case 5:
                        break;

                    case 6:
                        imprimirLibros();
                        break;

                    case 0:
                        System.out.println("Saliendo del programa...");
                        System.out.println("Has salido del programa, vuelve pronto");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } catch (InputMismatchException e){
                System.out.println("Solo puedes introducir números del menú");
            }
        }
    }

    private static boolean buscarLibroNombre() {

        System.out.println("Inserta el título: ");
        String titulo = scanner.nextLine();

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return true;
            }
        }
        return false;
    }

    public static void imprimirLibros() {
        if (libros.isEmpty()) {
            System.out.println("No existen libros");
        } else {
            System.out.println("Los libros que hay en la biblioteca son los siguientes: ");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }

    /*public static void addLibro() {
        System.out.println("Título: ");
        String titulo = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        if (!Libro.esNumeroEntero(isbn) || !Libro.empiezaConLetra(titulo)) {
            System.out.println("El título o el isbn no son válidos");
            return;
        }

        if (Libro.add(libro(isbn))) {
            System.out.println("Libro añadido a la biblioteca");
        } else {
            System.out.println("NO se ha podido añadir el libro");
        }
    }

    public static boolean remLibro() {
        System.out.println("Eliminar un libro ");
        System.out.println("ISBN: ");
        int isbn= scanner.nextInt();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).equals()getIsbn()){
                libros.remove(i);
                System.out.println("El libro se ha eliminado de la biblioteca");
                return true;
            }
        }
        return false;
    }

    public static void buscarLibroIsbn() {
        System.out.println("Buscar libro por ISBN");
        if (libros.isEmpty()) {
            System.out.println("No existe el libro");
        }
        System.out.println("Isbn del libro: ");
        String isbn = scanner.nextInt();

        for (Libro libro : libros) {
            if (libro.interger) {
                System.out.println("El libro con ese isbn es: " + libro);
            }
        }
    }*/

}
