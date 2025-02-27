/*package examenVuelos;

import linkedList.ej1act2und6Cancion.Album;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class mainVuelo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vuelo> vuelos = new ArrayList<>();

        Vuelo vuelo1 = new Vuelo("2023-01", "Valencia", "Menorca", "15-08", "turista");
        Vuelo vuelo2 = new Vuelo("2023-02", "Valencia", "Tenerife", "20-08", "turista");
        Vuelo vuelo3 = new Vuelo("2023-03", "París", "Valencia", "15-08", "primera");
        Vuelo vuelo4 = new Vuelo("2023-04", "Atenas", "Valencia", "20-08", "primera");

        //add in orden?
        vuelos.add(vuelo1);
        vuelos.add(vuelo2);
        vuelos.add(vuelo3);
        vuelos.add(vuelo4);



        imprimirMenu();
        boolean continuar = true;
        while (continuar) {

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 6:
                    imprimirMenu();
                    break;

                case 1:
                    imprimirVuelos(vuelos);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    System.out.println("Has salido del programa");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
        scanner.close();
    }


    //METODOS
    //impirmir menu
    public static void imprimirMenu() {
        System.out.println("=================================\n" +
        "VUELOS DEL AEORPUERTO DE VALENCIA\n" +
        "================================="
        );
        System.out.println("1 - Imprimir todos los vuelos");
        System.out.println("2 - Buscar un número de vuelo");
        System.out.println("3 - Buscar vuelo por clave");
        System.out.println("4 - Añadir vuelo nuevo");
        System.out.println("5 - Borrar vuelo por número");
        System.out.println("6 - Imprimir el menú");
        System.out.println("0 - SALIR");
    }

    /*public static boolean addInOrder(LinkedList<String> canciones, String nuevaCancion) {
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
    }*/

    /*//impirmir los vuelos
    public static void imprimirVuelos(ArrayList<Vuelo> vuelos) {
        System.out.println("Lista de vuelos:");
        for (Vuelo vuelo : vuelos) {
            System.out.println("Número: " + vuelo.getNumeroVuelo() +
                    ", Origen: " + vuelo.getOrigen() +
                    ", Destino: " + vuelo.getDestino() +
                    ", Día: " + vuelo.getDia() +
                    ", Clase: " + vuelo.getClase());
        }
    }
}*/
