package Ejemplos;

import java.util.Scanner;

public class MainList {

    private static Scanner scanner = new Scanner(System.in);
    private static ProductList productList = new ProductList();

    public static void imprimirMenu() {
        System.out.println("0 - Para imprimir menu");
        System.out.println("1 - Para imprimir productos");
        System.out.println("2 - Para añadir");
        System.out.println("3 - Para modificar");
        System.out.println("4 - Para eliminar");
        System.out.println("5 - Para salir");
    }

    public static void addItem() {
        System.out.println("Inserta el producto: ");
        productList.addProduct(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Inserta número de posición: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escribe el nuevo producto: ");
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
                    productList.printProductList();
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
