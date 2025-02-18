package heroesReino1J;

import java.util.Scanner;

public class mainHeroe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while(continuar) {

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    break;

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }

    }



    //metodos del main
    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("1 - Añadir un nuevo héroe");
        System.out.println("2 - Añadir un arma nueva al arsenal");
        System.out.println("3 - Eliminar un héroe por su nombre");
        System.out.println("4 - Buscar un héroe y mostrar sus detalles");
        System.out.println("5 - Listar todos los héroes registrados en el gremio");
        System.out.println("6 - Salir del programa");
    }
}
