package heroesReino1J;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static linkedList.Lista.addInOrder;

public class mainHeroe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Heroe> heroes = new ArrayList<>(); // Lista para almacenar héroes

        imprimirMenu();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 0:
                    imprimirMenu();
                    break;

                case 1: // Añadir un nuevo héroe
                    System.out.println("¿Qué tipo de héroe deseas añadir?");
                    System.out.println("1: Guerrero/a");
                    System.out.println("2: Mago/a");
                    System.out.println("3: Arquero/a");
                    System.out.println("4: Asesino/a");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("Nombre del héroe: ");
                    String nombreHeroe = scanner.nextLine();
                    System.out.print("Nivel: ");
                    int nivel = scanner.nextInt();
                    System.out.print("Puntos de Vida: ");
                    int puntosVida = scanner.nextInt();

                    Heroe nuevoHeroe = null;
                    switch (tipo) {
                        case 1:
                            System.out.print("Fuerza: ");
                            int fuerza = scanner.nextInt();
                            nuevoHeroe = new Guerrero(nombreHeroe, nivel, puntosVida, new ArrayList<>(), fuerza);
                            break;
                        case 2:
                            System.out.print("Mana: ");
                            int mana = scanner.nextInt();
                            nuevoHeroe = new Mago(nombreHeroe, nivel, puntosVida, new ArrayList<>(), mana);
                            break;
                        case 3:
                            System.out.print("Precisión: ");
                            int precision = scanner.nextInt();
                            nuevoHeroe = new Arquero(nombreHeroe, nivel, puntosVida, new ArrayList<>(), precision);
                            break;
                        case 4:
                            System.out.print("Sigilo: ");
                            int sigilo = scanner.nextInt();
                            nuevoHeroe = new Asesino(nombreHeroe, nivel, puntosVida, new ArrayList<>(), sigilo);
                            break;
                        default:
                            System.out.println("Tipo de héroe no válido");
                            continue; // Vuelve al menú
                    }

                    // Llama al método para añadir el héroe
                    if (addInOrder(heroes, nuevoHeroe)) {
                        System.out.println(nuevoHeroe.getNombre() + " ha sido añadido al gremio!");
                    }
                    break;

                case 2: // Añadir un arma nueva al arsenal
                    // Implementar la lógica para añadir un arma
                    break;

                case 3: // Eliminar un héroe por su nombre
                    System.out.print("Nombre del héroe a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    if (eliminarHeroe(heroes, nombreEliminar)) {
                        System.out.println("El héroe " + nombreEliminar + " ha sido eliminado.");
                    } else {
                        System.out.println("No se encontró un héroe con ese nombre.");
                    }
                    break;

                case 4: // Buscar un héroe y mostrar sus detalles
                    System.out.print("Nombre del héroe a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarHeroe(heroes, nombreBuscar);
                    break;

                case 5: // Listar todos los héroes registrados en el gremio
                    listarHeroes(heroes);
                    break;

                case 6: // Salir del programa
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
        scanner.close();
    }

    // Método para imprimir el menú
    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Imprimir el menú");
        System.out.println("1 - Añadir un nuevo héroe");
        System.out.println("2 - Añadir un arma nueva al arsenal");
        System.out.println("3 - Eliminar un héroe por su nombre");
        System.out.println("4 - Buscar un héroe y mostrar sus detalles");
        System.out.println("5 - Listar todos los héroes registrados en el gremio");
        System.out.println("6 - Salir del programa");
    }

    // Método para añadir un héroe en orden
    public static boolean addInOrder(ArrayList<Heroe> heroes, Heroe nuevoHeroe) {
        ListIterator<Heroe> it = heroes.listIterator();

        while (it.hasNext()) {
            Heroe heroeActual = it.next();
            int comparacion = heroeActual.getNombre().compareToIgnoreCase(nuevoHeroe.getNombre());

            if (comparacion == 0) {
                System.out.println("El héroe " + nuevoHeroe.getNombre() + " ya ha sido admitido en el gremio");
                return false; // Ya existe un héroe con el mismo nombre
            } else if (comparacion > 0) {
                it.previous();
                it.add(nuevoHeroe);
                return true; // Héroe añadido antes del héroe actual
            }
        }

        it.add(nuevoHeroe); // Añade al final si es el último héroe
        return true;
    }

    // Método para eliminar un héroe por su nombre
    public static boolean eliminarHeroe(ArrayList<Heroe> heroes, String nombre) {
        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                heroes.remove(heroe);
                return true; // Héroe encontrado y eliminado
            }
        }
        return false; // Héroe no encontrado
    }

    // Método para buscar un héroe y mostrar sus detalles
    public static void buscarHeroe(ArrayList<Heroe> heroes, String nombre) {
        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Detalles del héroe:");
                System.out.println("Nombre: " + heroe.getNombre());
                System.out.println("Nivel: " + heroe.getNivel());
                System.out.println("Puntos de Vida: " + heroe.getPuntosVida());
                if (heroe instanceof Guerrero) {
                    System.out.println("Fuerza: " + ((Guerrero) heroe).getFuerza());
                } else if (heroe instanceof Mago) {
                    System.out.println("Mana: " + ((Mago) heroe).getMana());
                } else if (heroe instanceof Arquero) {
                    System.out.println("Precisión: " + ((Arquero) heroe).getPrecision());
                } else if (heroe instanceof Asesino) {
                    System.out.println("Sigilo: " + ((Asesino) heroe).getSigilo());
                }
                return; // Salir después de encontrar el héroe
            }
        }
        System.out.println("No se encontró un héroe con el nombre " + nombre);
    }

    // Método para listar todos los héroes
    public static void listarHeroes(ArrayList<Heroe> heroes) {
        if (heroes.isEmpty()) {
            System.out.println("No hay héroes registrados en el gremio.");
            return;
        }
        System.out.println("Héroes registrados:");
        for (Heroe heroe : heroes) {
            System.out.println("- " + heroe.getNombre() + " (Nivel: " + heroe.getNivel() + ")");
        }
    }
}



/*public class mainHeroe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* LinkedList<String> tipoHeroes = new LinkedList<>();
        addInOrder(tipoHeroes, "Guerrero/a");
        addInOrder(tipoHeroes, "Mago/a");
        addInOrder(tipoHeroes, "Arquero/a");
        addInOrder(tipoHeroes, "Asesino/a");





        Heroe heroe = new Heroe("lucia", 100, 1000, "espada", "maga");

        ArrayList<Arma> armas = new ArrayList<>();

        ArrayList<String> tipoHeroes = new ArrayList<>();
        addInOrder(tipoHeroes, "Guerrero/a");
        addInOrder(tipoHeroes, "Mago/a");
        addInOrder(tipoHeroes, "Arquero/a");
        addInOrder(tipoHeroes, "Asesino/a");

        Guerrero guerrero = new Guerrero("Thor", 1, 100, armas, tipoHeroes, 20);
        guerrero.atacar();




        imprimirMenu();
        boolean continuar = true;
        while(continuar) {

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    imprimirMenu();
                    break;

                case 1:
                    heroe.addHero("vhg", 12, 12, armas, tipoHeroes);

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
        System.out.println("0 - Imprimir el menú");
        System.out.println("1 - Añadir un nuevo héroe");
        System.out.println("2 - Añadir un arma nueva al arsenal");
        System.out.println("3 - Eliminar un héroe por su nombre");
        System.out.println("4 - Buscar un héroe y mostrar sus detalles");
        System.out.println("5 - Listar todos los héroes registrados en el gremio");
        System.out.println("6 - Salir del programa");
    }

    public static boolean addInOrder(ArrayList<String> tipoHeroes, String nuevoHeroe) {
        ListIterator<String> it = tipoHeroes.listIterator();
        while (it.hasNext()) {
            int comparacion = it.next().compareTo(nuevoHeroe);

            if (comparacion == 0) {
                System.out.println("El héroe " + nuevoHeroe + " ya ha sido admitido en el gremio");
                return false;
            } else if (comparacion > 0) {
                it.previous();
                it.add(nuevoHeroe);
                return true;
            }
        }
        it.add(nuevoHeroe);
        return true;
    }

}*/
