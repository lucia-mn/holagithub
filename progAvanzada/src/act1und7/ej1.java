package act1und7;

class Set<T> {
    private static final int TAM = 10;
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public Set() {
        array = (T[]) new Object[TAM];
        size = 0;
    }

    public boolean insert(T element) {
        if (size >= TAM) {
            return false;
        }
        array[size++] = element;
        return true;
    }

    public boolean delete(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                array[i] = array[size - 1]; // Mover el último elemento a la posición eliminada
                array[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public T find(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return array[i];
            }
        }
        return null;
    }

    public void printSet() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Set<String> stringSet = new Set<>();
        stringSet.insert("Hola");
        stringSet.insert("Java");
        stringSet.insert("Mundo");
        stringSet.printSet();

        System.out.println("Encontrado: " + stringSet.find("Java"));
        stringSet.delete("Java");
        stringSet.printSet();

        Set<Integer> intSet = new Set<>();
        intSet.insert(10);
        intSet.insert(20);
        intSet.insert(30);
        intSet.printSet();

        System.out.println("Encontrado: " + intSet.find(20));
        intSet.delete(20);
        intSet.printSet();
    }
}


/*
import java.util.Scanner;

class Set<T> {
    private static final int TAM = 10;
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public Set() {
        array = (T[]) new Object[TAM];
        size = 0;
    }

    public boolean insert(T element) {
        if (size >= TAM) {
            return false;
        }
        array[size++] = element;
        return true;
    }

    public boolean delete(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                array[i] = array[size - 1];
                array[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public T find(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return array[i];
            }
        }
        return null;
    }

    public void printSet() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> intSet = new Set<>();
        int option;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar conjunto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese un número a insertar: ");
                    int numInsert = scanner.nextInt();
                    if (intSet.insert(numInsert)) {
                        System.out.println("Elemento insertado correctamente.");
                    } else {
                        System.out.println("No se pudo insertar, el conjunto está lleno.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese un número a eliminar: ");
                    int numDelete = scanner.nextInt();
                    if (intSet.delete(numDelete)) {
                        System.out.println("Elemento eliminado correctamente.");
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un número a buscar: ");
                    int numFind = scanner.nextInt();
                    Integer found = intSet.find(numFind);
                    if (found != null) {
                        System.out.println("Elemento encontrado: " + found);
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Conjunto actual: ");
                    intSet.printSet();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (option != 5);

        scanner.close();
    }
}
 */
