import java.util.Scanner;

public class mainResena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese el id de la reseña (max 64 caracteres): ");
            String idReseña = scanner.nextLine();

            System.out.print("Ingrese el id del producto: ");
            int idProducto = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese la calificación (1-10): ");
            int calificacion = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el contenido de la reseña (máximo 100 caracteres): ");
            String contenido = scanner.nextLine();

            System.out.print("Ingrese la fecha de publicación (YYYY-MM-DD): ");
            String fPublicacion = scanner.nextLine();

            System.out.print("Ingrese el id del usuario: ");
            int idUsuario = Integer.parseInt(scanner.nextLine());


            Resena resena =new Resena("rsd", 001, 9, "juego de cartas", "08/12/24", 2034);

            System.out.println(" ");
            System.out.println("Reseña creada correctamente: ");
            System.out.println(resena);


        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        //} catch (NumberFormatException e) {
            //System.out.println("Error: Debe ingresar un número válido.");
        } finally {
            scanner.close();
        }
    }
}