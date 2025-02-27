package examenVuelos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Vuelo> vuelos = new ArrayList<>();

    public static void main(String[] args) {
        vuelos.add(new Vuelo("2023-01", "Valencia", "Menorca", "15-08", "turista"));
        vuelos.add(new Vuelo("2023-02", "Valencia", "Tenerife", "20-08", "turista"));
        vuelos.add(new Vuelo("2023-03", "París", "Valencia", "15-08", "primera"));
        vuelos.add(new Vuelo("2023-04", "Atena", "Valencia", "20.08", "primera"));

        menu();
    }

    private static void menu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("=======================================");
            System.out.println("   VUELOS DEL AEROPUERTO DE VALENCIA   ");
            System.out.println("=======================================");
            System.out.println("""
                1 - Imprimir todos los vuelos
                2 - Buscar por número de vuelos
                3 - Buscar vuelo por clave
                4 - Añadir vuelo nuevo
                5 - Borrar vuelo por número
                0 - Salir""");
            System.out.println("- - - - - - - - - - - - - - - - - - - -");
            try {
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        imprimirVuelos();
                        break;
                    case 2:
                        buscarVuelo();
                        break;
                    case 3:
                        buscarVueloClave();
                        break;
                    case 4:
                        añadirVuelo();
                        break;
                    case 5:
                        if (!borrarVuelo()){
                            System.out.println("No se ha podido eliminar el vuelo");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e){
                System.out.println("Solo puedes introducir números");
            }
        }
    }

    public static void imprimirVuelos() {
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
        } else {
            System.out.println("DATOS DE LOS VUELOS:");
            for (Vuelo vuelo : vuelos) {
                System.out.println(vuelo);
            }
        }
    }

    public static void buscarVuelo() {
        System.out.println("BUSCAR VUELO POR Nº");
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
        }
        System.out.println("Número de vuelo: ");
        String numeroVuelo = sc.nextLine();
        for (Vuelo vuelo : vuelos) {
            if (vuelo.numeroVuelo.equals(numeroVuelo)) {
                System.out.println(vuelo);
            }
        }
    }

    public static void buscarVueloClave(){
        System.out.println("BUSCAR VUELO POR CLAVE: ");
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
        }
        System.out.println("Clave: ");
        String clave;
        clave = sc.nextLine().toLowerCase();
        System.out.println("Valor: ");
        String valor;
        valor = sc.nextLine();
        switch (clave) {
            case "numero":
                buscarNumeroVuelo(valor);
                break;
            case "origen":
                buscarOrigen(valor);
                break;
            case "destino":
                buscarDestino(valor);
                break;
            case "dia":
                buscarDia(valor);
                break;
            case "clase":
                buscarClase(valor);
                break;
            default:
                System.out.println("Lo siento pero esa clave no existe");
        }
    }

    public static void buscarNumeroVuelo(String numeroVuelo) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getNumeroVuelo().equalsIgnoreCase(numeroVuelo)){
                System.out.println(vuelos.get(i));
            }
        }
    }

    public static void buscarOrigen(String origen) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getOrigen().equalsIgnoreCase(origen)){
                System.out.println(vuelos.get(i));
            }
        }
    }

    public static void buscarDestino(String destino) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).destino.equalsIgnoreCase(destino)){
                System.out.println(vuelos.get(i));
            }
        }
    }

    public static void buscarDia(String dia) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).dia.equalsIgnoreCase(dia)){
                System.out.println(vuelos.get(i));
            }
        }
    }

    public static void buscarClase(String clase) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).clase.equalsIgnoreCase(clase)){
                System.out.println(vuelos.get(i));
            }
        }
    }

    public static void añadirVuelo() {
        System.out.println("AÑADIR NUEVO VUELO: ");
        System.out.println("Número: ");
        String numeroVuelo;
        numeroVuelo = sc.nextLine();
        System.out.println("Origen: ");
        String origen;
        origen = sc.nextLine();
        System.out.println("Destino: ");
        String destino;
        destino = sc.nextLine();
        System.out.println("Día (dd-mm): ");
        String dia;
        dia = sc.nextLine();
        System.out.println("Clase: ");
        String clase;
        clase = sc.nextLine();
        vuelos.add(new Vuelo(numeroVuelo, origen, destino, dia, clase));
        System.out.println("Vuelo añadido a la lista");
    }

    public static boolean borrarVuelo() {
        System.out.println("BORRAR VUELO ");
        System.out.println("Número de vuelo: ");
        String numero = sc.nextLine();
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getNumeroVuelo().equalsIgnoreCase(numero)){
                vuelos.remove(i);
                System.out.println("El vuelo se ha eliminado correctamente");
                return true;
            }
        }
        return false;
    }
}
