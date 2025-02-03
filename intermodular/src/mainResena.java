import java.util.ArrayList;
import java.util.Scanner;

public class mainResena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resena> resenas = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("Ingrese el ID de la reseña (máx 64 caracteres, 'salir' para terminar): ");
                String idResena = scanner.nextLine().trim();
                if (idResena.equalsIgnoreCase("salir")) {
                    continuar = false;
                    break;
                }
                if (idResena.length() > 64) {
                    System.out.println("Error: El ID de la reseña no puede tener más de 64 caracteres.");
                    continue;
                }

                System.out.print("Ingrese el ID del producto: ");
                int idProducto = Integer.parseInt(scanner.nextLine().trim());
                if (idProducto <= 0) {
                    System.out.println("Error: El ID del producto debe ser un número positivo.");
                    continue;
                }

                System.out.print("Ingrese la calificación (1-10): ");
                int calificacion = Integer.parseInt(scanner.nextLine().trim());
                if (calificacion < 1 || calificacion > 10) {
                    System.out.println("Error: La calificación debe estar entre 1 y 10.");
                    continue;
                }

                System.out.print("Ingrese el contenido de la reseña (máximo 100 caracteres): ");
                String contenido = scanner.nextLine().trim();
                if (contenido.length() > 100) {
                    System.out.println("Error: El contenido no puede tener más de 100 caracteres.");
                    continue;
                }

                System.out.print("Ingrese la fecha de publicación (YYYY-MM-DD): ");
                String fPublicacion = scanner.nextLine().trim();

                System.out.print("Ingrese el ID del usuario: ");
                int idUsuario = Integer.parseInt(scanner.nextLine().trim());
                if (idUsuario <= 0) {
                    System.out.println("Error: El ID del usuario debe ser un número positivo.");
                    continue;
                }

                // Crear y agregar reseña
                resenas.add(new Resena(idResena, idProducto, calificacion, contenido, fPublicacion, idUsuario));
                System.out.println("Reseña agregada correctamente.\n");

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }

        // Mostrar todas las reseñas registradas
        System.out.println("\nLista de reseñas registradas:");
        for (Resena r : resenas) {
            System.out.println(r);
        }

        scanner.close();
    }
}
