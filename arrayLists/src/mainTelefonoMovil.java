import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class mainTelefonoMovil {

    private static Scanner scanner = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil("123456789", new ArrayList<>());

    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Agregar nuevo contacto");
        System.out.println("3 - Actualizar contacto existente");
        System.out.println("4 - Eliminar contacto de la lista");
        System.out.println("5 - Buscar/ encontrar contacto por nombre");
        System.out.println("6 - Volver a imprimir la lista de opciones");
    }

    public static void addItem() {
        System.out.println("Inserta el producto: ");
        productList.addProduct(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Inserta número de posición: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escribe el nuevo producto:");
        String newItem = scanner.nextLine();
        productList.modifyProductItem(index, newItem);
    }

    public static void removeItem() {
        System.out.println("Inserta número de posición: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        productList.removeProductItem(index);
    }

    public static void main(String[] args) {
        boolean continuar = true;
        int opcion = 0;
        imprimirMenu();

        while(continuar) {
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    imprimirMenu();
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    continuar = false;
                    break;
            }
        }
    }
}
