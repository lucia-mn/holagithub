package resena;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class mainResena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Resena> resenas = new ArrayList<>();

        boolean fin = false;
        while (!fin) {
            System.out.println("Introduce los datos del usuario: ");

            String idResena;
            do {
                System.out.print("ID de la reseña (max 64 caracteres): ");
                idResena = scanner.nextLine();
                if (idResena.equalsIgnoreCase("salir")) {
                    System.out.println("Saliendo...");
                    mostrarResenas(resenas);
                    return;
                }
            } while (idResena.length() > 64 || existeIdResena(resenas, idResena));

            // Validar ID del producto
            int idProducto;
            do {
                System.out.print("ID del producto: ");
                idProducto = obtenerNumero(scanner);
            } while (idProducto <= 0 || existeIdProducto(resenas, idProducto));

            // Validar calificación
            int calificacion;
            do {
                System.out.print("Calificación (1-10): ");
                calificacion = obtenerNumero(scanner);
            } while (calificacion < 1 || calificacion > 10);

            // Validar contenido
            String contenido;
            do {
                System.out.print("Contenido de la reseña (max 100 caracteres): ");
                contenido = scanner.nextLine();
            } while (contenido.length() > 100);

            // Validar fecha de publicación
            String fPublicacion;
            do {
                System.out.print("Fecha de publicación (YYYY-MM-DD): ");
                fPublicacion = scanner.nextLine();
            } while (!esFechaValida(fPublicacion));

            // Validar ID del usuario
            int idUsuario;
            do {
                System.out.print("ID del usuario: ");
                idUsuario = obtenerNumero(scanner);
            } while (idUsuario <= 0 || existeIdUsuario(resenas, idUsuario));

            // Crear y agregar la reseña
            Resena resena = new Resena(idResena, idProducto, calificacion, contenido, fPublicacion, idUsuario);
            resenas.add(resena);
            System.out.println("Reseña agregada correctamente.\n");
        }
    }


    //verificar si se repiten
    private static boolean existeIdResena(ArrayList<Resena> resenas, String idResena) {
        for (Resena r : resenas) {
            if (r.getIdResena().equals(idResena)) {
                System.out.println("Error: ID de reseña ya existente.");
                return true;
            }
        }
        return false;
    }

    private static boolean existeIdProducto(ArrayList<Resena> resenas, int idProducto) {
        for (Resena r : resenas) {
            if (r.getIdProducto() == idProducto) {
                System.out.println("Error: ID de producto ya registrado.");
                return true;
            }
        }
        return false;
    }

    private static boolean existeIdUsuario(ArrayList<Resena> resenas, int idUsuario) {
        for (Resena r : resenas) {
            if (r.getIdUsuario() == idUsuario) {
                System.out.println("Error: ID de usuario ya registrado.");
                return true;
            }
        }
        return false;
    }


    // Método para verificar el formato de fecha
    private static boolean esFechaValida(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            System.out.println("Error: La fecha debe tener el formato YYYY-MM-DD.");
            return false;
        }
    }

    // Método para validar que el input sea un número
    private static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Error: Debe ingresar un número válido. Intente nuevamente: ");
            }
        }
    }


    //para ver el array
    private static void mostrarResenas(ArrayList<Resena> resenas) {
        System.out.println("\nLista de reseñas: ");
        for (Resena r : resenas) {
            System.out.println(r);
        }
    }
}

