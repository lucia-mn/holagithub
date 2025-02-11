package linkedList.ej1act2und6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static linkedList.Lista.addInOrder;

public class mainAlbum {

    private static Scanner scanner = new Scanner(System.in);
    private static Cancion cancion = new Cancion("Haven", 1.43);

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("ChristmasEveL", "SKZ"));
        albums.add(new Album("Parachutes", "Coldplay"));
        albums.add(new Album("Origin", "Imagine Dragons"));
        albums.add(new Album("Sin noticias de Holanda", "Melendi"));
        albums.add(new Album("Sour", "Olivia Rodrigo"));


        LinkedList<String> canciones = new LinkedList<>();
        addInOrder(canciones, "24 to 25");
        addInOrder(canciones, "Winter falls");
        addInOrder(canciones, "Domino eng.ver");
        addInOrder(canciones, "Yellow");
        addInOrder(canciones, "Sparks");
        addInOrder(canciones, "Natural");
        addInOrder(canciones, "Boomerang");
        addInOrder(canciones, "Machine");
        addInOrder(canciones, "Sé lo que hicisteis");
        addInOrder(canciones, "Hablando en plata");
        addInOrder(canciones, "vampire");
        addInOrder(canciones, "good 4 u");



        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ListIterator<String> it = canciones.listIterator();

        if (canciones.isEmpty()) {
            System.out.println("No se han encontrado canciones en la lista de reproducción");
            return;
        } else {
            System.out.println("Estás escuchando: " + it.next());
            imprimirMenu();
        }

        //switch
        boolean haciaAdelante = true;
        while(continuar) {
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 0:
                    imprimirMenu();
                    break;
                case 1:
                    if (!haciaAdelante) {
                        if (it.hasNext())
                            it.next();
                        haciaAdelante = true;
                    }
                    if (it.hasNext()) {
                        System.out.println("Escuchando... " + it.next());
                    } else {
                        System.out.println("Ya no hay más canciones en la lista, has llegado a la última");
                        haciaAdelante = false;
                    }
                    break;
                case 2:
                    if(haciaAdelante) {
                        if (it.hasPrevious())
                            it.previous();
                        haciaAdelante = false;
                    }
                    if (it.hasPrevious()) {
                        System.out.println("Escuchando... " + it.previous());
                    } else {
                        System.out.println("Esta es la primera canción de la lista");
                        haciaAdelante = true;
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
    }


    //imprimir menu
    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Volver a imprimir el menú");
        System.out.println("1 - Reproducir siguiente canción en la lista");
        System.out.println("2 - Reproducir la canción previa de la lista");
        System.out.println("3 - Repetir la canción actual");
        System.out.println("4 - Imprimir la lista de canciones en la playlist");
        System.out.println("5 - Salir de la lista de reproducción");
    }

    public static Cancion getCancion() {
        return cancion;
    }

    public static void setCancion(Cancion cancion) {
        mainAlbum.cancion = cancion;
    }



    public static boolean addInOrder(LinkedList<String> canciones, String nuevaCancion) {
        ListIterator<String> it = canciones.listIterator();

        while (it.hasNext()) {
            int comparacion = it.next().compareTo(nuevaCancion);

            if (comparacion == 0) {
                System.out.println("La canción " + nuevaCancion + " ya está incluida en la lista");
                return false;
            } else if (comparacion > 0) {
                it.previous();
                it.add(nuevaCancion);
                return true;
            }
        }

        it.add(nuevaCancion);
        return true;
    }


}
