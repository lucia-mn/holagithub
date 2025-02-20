package heroesReino1J;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static linkedList.Lista.addInOrder;

public class mainHeroe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> tipoHeroes = new LinkedList<>();
        addInOrder(tipoHeroes, "Guerrero/a");
        addInOrder(tipoHeroes, "Mago/a");
        addInOrder(tipoHeroes, "Arquero/a");
        addInOrder(tipoHeroes, "Asesino/a");





        Heroe heroe = new Heroe("lucia", 100, 1000, "espada", "maga");

        ArrayList<Arma> armas = new ArrayList<>();
        ArrayList<Heroe> tipoHeroes = new ArrayList<>();
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

    public static boolean addInOrder(LinkedList<String> tipoHeroes, String nuevoHeroe) {
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



}
