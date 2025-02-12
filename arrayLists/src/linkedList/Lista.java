package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        LinkedList<String> lugares = new LinkedList<>();
        addInOrder(lugares, "Roma");
        addInOrder(lugares, "París");
        addInOrder(lugares, "Ámsterdam");
        addInOrder(lugares, "Toronto");
        addInOrder(lugares, "Miami");

        printList(lugares); // Muestra la lista de lugares ordenados
        visitarLugar(lugares); // Inicia el menú interactivo
    }

    public static void printList(LinkedList<String> lugares) {
        System.out.println("Lista de lugares:");
        for (String lugar : lugares) {
            System.out.println("→ " + lugar);
        }
        System.out.println("-----");
    }

    public static boolean addInOrder(LinkedList<String> lugares, String newItem) {
        ListIterator<String> it = lugares.listIterator();
        while (it.hasNext()) {
            int comparacion = it.next().compareTo(newItem);
            if (comparacion == 0) {
                System.out.println("El lugar " + newItem + " ya está incluido.");
                return false;
            } else if (comparacion > 0) { // newItem es más pequeño
                it.previous();
                it.add(newItem);
                return true;
            }
        }
        it.add(newItem);
        return true;
    }

    public static void visitarLugar(LinkedList<String> lugares) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ListIterator<String> it = lugares.listIterator();

        if (lugares.isEmpty()) {
            System.out.println("No hay lugares visitados.");
            return;
        } else {
            System.out.println("Visitando " + it.next());
            imprimirMenu();
        }

        boolean haciaAdelante = true;
        while (continuar) {
            System.out.print("Elige una opción: ");
            String input = scanner.nextLine().trim();

            if (!input.matches("\\d+")) {  // Verifica que la entrada sea un número
                System.out.println("Entrada inválida. Inténtalo de nuevo.");
                continue;
            }

            int opcion = Integer.parseInt(input);

            switch (opcion) {
                case 0:
                    System.out.println("Se acabaron las vacaciones.");
                    continuar = false;
                    break;
                case 1:
                    if (!haciaAdelante) {
                        if (it.hasNext()) it.next();
                        haciaAdelante = true;
                    }
                    if (it.hasNext()) {
                        System.out.println("Visitando " + it.next());
                    } else {
                        System.out.println("Ya no hay más ciudades.");
                        haciaAdelante = false;
                    }
                    break;
                case 2:
                    if (haciaAdelante) {
                        if (it.hasPrevious()) it.previous();
                        haciaAdelante = false;
                    }
                    if (it.hasPrevious()) {
                        System.out.println("Visitando " + it.previous());
                    } else {
                        System.out.println("Primera ciudad.");
                        haciaAdelante = true;
                    }
                    break;
                case 3:
                    imprimirMenu();
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close(); // Cierra el scanner al final del método
    }

    public static void imprimirMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("0 - Salir");
        System.out.println("1 - Ir a la siguiente ciudad");
        System.out.println("2 - Ir a la ciudad anterior");
        System.out.println("3 - Imprimir el menú");
        System.out.println();
    }
}
