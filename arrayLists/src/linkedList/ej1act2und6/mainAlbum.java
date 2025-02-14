package linkedList.ej1act2und6;

import linkedList.Lista;
import javax.sound.midi.Soundbank;
import java.util.*;


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
        addInOrder(canciones, "Domino eng. ver");
        addInOrder(canciones, "Yellow");
        addInOrder(canciones, "Sparks");
        addInOrder(canciones, "Natural");
        addInOrder(canciones, "Boomerang");
        addInOrder(canciones, "Machine");
        addInOrder(canciones, "Sé lo que hicisteis");
        addInOrder(canciones, "Hablando en plata");
        addInOrder(canciones, "Vampire");
        addInOrder(canciones, "Good 4 u");



        boolean continuar = true;
        ListIterator<String> it = canciones.listIterator();

        if (canciones.isEmpty()) {
            System.out.println("No se han encontrado canciones en la lista de reproducción");
            return;
        } else {
            imprimirMenu();
        }

        //switch
        boolean haciaAdelante = true;
        while(continuar) {

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo de la lista de reproducción...");
                    continuar=false;
                    break;

                case 1:
                    try {
                        if (!haciaAdelante) {
                            if (it.hasNext())
                                it.next();
                            haciaAdelante = true;
                        }
                        if (it.hasNext()) {
                            System.out.println("Estás escuchando... " + it.next());
                        } else {
                            System.out.println("Ya no hay más canciones en la lista, has llegado a la última");
                            haciaAdelante = false;
                        }
                    } catch (ConcurrentModificationException e) {
                        System.out.println("No se ha encontrado ninguna canción para reproducir");
                    }
                    break;

                case 2:
                    if(haciaAdelante) {
                        if (it.hasPrevious())
                            it.previous();
                        haciaAdelante = false;
                    }
                    if (it.hasPrevious()) {
                        System.out.println("Estás escuchando... " + it.previous());
                    } else {
                        System.out.println("Esta es la primera canción de la lista");
                        haciaAdelante = true;
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Estás escuchando de nuevo: " + it.previous());
                        it.next();
                    } catch (NoSuchElementException e) {
                        System.out.println("No hay canción para repetir");
                    }
                    break;

                case 4:
                    System.out.println("-----* Esta es la lista de canciones de la playlist *-----");
                    imprimirPlaylist(canciones);
                    break;

                case 5:
                    imprimirMenu();
                    break;

                case 6:
                    //it.current?
                    if(haciaAdelante) {
                        try {

                            System.out.println(it.previous() + " se está eliminando...");
                            System.out.println("La canció se ha eliminado de la playlist");
                            canciones.remove(it.next());
                            haciaAdelante = false;

                            //if (it.hasNext())
                              //  it.next();

                        } catch (ConcurrentModificationException e) {
                            System.out.println("Estás escuchando... " + it.next());
                            System.out.println("Ya no hay más canciones en la lista, has llegado a la última");

                        }

                    } else {
                        if (haciaAdelante) {
                            System.out.println(it.next() + " se está eliminando...");
                            System.out.println("La canció se ha eliminado de la playlist");
                            canciones.remove(it.previous());
                            haciaAdelante = true;

                        } else{
                            System.out.println("Estás escuchando... " + it.previous());
                                if (it.hasPrevious())
                                    it.previous();
                        }
                    }
                    break;

                case 7:

                    break;
                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
    }


    //metodos
    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Salir de la lista de reproducción");
        System.out.println("1 - Reproducir siguiente canción en la lista");
        System.out.println("2 - Reproducir la canción previa de la lista");
        System.out.println("3 - Repetir la canción actual");
        System.out.println("4 - Imprimir la lista de canciones en la playlist");
        System.out.println("5 - Volver a imprimir el menú");
        System.out.println("6 - Eliminar canción actual de la playlist");
        System.out.println("7 - Imprimir canciones por álbum");
        //buscas un álbum y te dicen las canciones que tiene

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

    public static void imprimirPlaylist(LinkedList<String> canciones) {
        if (canciones.isEmpty()) {
            System.out.println("No hay canciones en la playlist");
        } else {
            for (String cancion : canciones) {
                //System.out.println("🎵 " + cancion);
                System.out.println(cancion);
            }
        }
        System.out.println("-----");
    }


}
