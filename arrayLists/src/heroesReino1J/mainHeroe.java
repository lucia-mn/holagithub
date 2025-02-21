package heroesReino1J;

import java.util.*;

public class mainHeroe {

    private static ArrayList<Arma> armas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Heroe> heroes = new ArrayList<>();
        //METER UN OBJETO EN UN ARRAY
        //QUE CADA HEROE PUEDA TENER MAS DE UN ARMA, Y QUE APAREZCAN TODAS
        //HERENCIA, COMPOSICION, ARRAY LISTS
        //LINKED LIST MENOS IMPORTANTE

        imprimirMenu();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    imprimirMenu();
                    break;

                case 1:
                    System.out.println("¿Qué tipo de héroe quieres ser hoy?");
                    System.out.println("1. Guerrero/a");
                    System.out.println("2. Mago/a");
                    System.out.println("3. Arquero/a");
                    System.out.println("4. Asesino/a");

                    int tipo;
                    do {
                        //System.out.print("Selecciona el número del héroe: ");
                        System.out.print("Elige una subopción: ");
                        tipo = scanner.nextInt();
                    } while (tipo < 1 || tipo > 4);
                    scanner.nextLine(); //para limpiar el buffer
                    //System.out.println("Tipo seleccionado: " + tipo);

                    //con un try-catch no funciona, pero con los métodos de obtenerNumero y letra sí (validaciones)
                    /*try {
                        System.out.print("Nivel: ");
                        int nivel = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("El nivel tiene que ser un númeo entero");
                    }*/

                    System.out.print("Nombre del " + tipo + ": ");
                    String nombreHeroe = scanner.nextLine();

                    System.out.print("Nivel: ");
                    int nivel = scanner.nextInt();

                    System.out.print("Puntos de Vida: ");
                    int puntosVida = scanner.nextInt();


                    Heroe nuevoHeroe = null;
                    scanner.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("Fuerza: ");
                            int fuerza = scanner.nextInt();
                            nuevoHeroe = new Guerrero(nombreHeroe, nivel, puntosVida, new ArrayList<>(), fuerza);
                            break;

                        case 2:
                            System.out.print("Maná: ");
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
                            System.out.println("Ese tipo de héroe no está disponible en el gremio");
                            break;
                    }

                    if (nuevoHeroe != null) {
                        if (addInOrder(heroes, nuevoHeroe)) {
                            System.out.println("¡" + nuevoHeroe.getNombre() + " se ha unido al gremio!");
                        } else {
                            System.out.println("No se ha podido añadir el héroe al gremio :(");
                        }
                    }
                    break;

                case 2:
                    scanner.nextLine(); //limpiar el buffer

                    System.out.print("Nombre del arma: ");
                    String nombreArma = scanner.nextLine().trim();

                    if (!nombreArma.isEmpty() && Character.isLetter(nombreArma.charAt(0))) {
                        if (addNuevaArma(armas, nombreArma)) {
                            System.out.println("¡El arma ha sido añadida con éxito!");
                        } else {
                            System.out.println("El arma ya existía en el arsenal.");
                        }
                    } else {
                        System.out.println("El nombre del arma tiene que empezar por una letra.");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del héroe: ");
                    String nombreEliminar = scanner.nextLine();
                    if (eliminarHeroe(heroes, nombreEliminar)) {
                        System.out.println("El héroe " + nombreEliminar + " se ha ido del gremio");
                    } else {
                        System.out.println("No existe un héroe con ese nombre");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del héroe a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarHeroe(heroes, nombreBuscar);
                    break;

                case 5:
                    listarHeroes(heroes);
                    break;

                case 6:
                    System.out.println("Saliendo del gremio...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
        scanner.close();
    }


    //metodos
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

    public static boolean addInOrder(ArrayList<Heroe> heroes, Heroe nuevoHeroe) {
        ListIterator<Heroe> it = heroes.listIterator();

        while (it.hasNext()) {
            Heroe heroeActual = it.next();
            int comparacion = heroeActual.getNombre().compareToIgnoreCase(nuevoHeroe.getNombre());

            if (comparacion == 0) {
                System.out.println("El héroe " + nuevoHeroe.getNombre() + " ya ha sido admitido en el gremio");
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

    private static boolean addNuevaArma(ArrayList<Arma> armas, String nombreNuevaArma) {
        ListIterator<Arma> it = armas.listIterator();

        while (it.hasNext()) {
            Arma armaActual = it.next();
            int comparacion = armaActual.getNombre().compareToIgnoreCase(nombreNuevaArma);

            if (comparacion == 0) {
                System.out.println("El arma " + nombreNuevaArma + " ya está en el arsenal");
                return false;
            } else if (comparacion > 0) {
                it.previous();
                it.add(new Arma(nombreNuevaArma));
                System.out.println("El arma " + nombreNuevaArma + " ha sido añadida al arsenal");
                return true;
            }
        }
        return true;
    }

    public static boolean eliminarHeroe(ArrayList<Heroe> heroes, String nombre) {
        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                heroes.remove(heroe);
                return true;
            }
        }
        return false;
    }

    public static void buscarHeroe(ArrayList<Heroe> heroes, String nombre) {
        for (Heroe heroe : heroes) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Detalles del héroe: ");
                System.out.println("Nombre: " + heroe.getNombre());
                System.out.println("Nivel: " + heroe.getNivel());
                System.out.println("Puntos de vida: " + heroe.getPuntosVida());

                /*if (heroe instanceof Guerrero) {
                    System.out.println("Fuerza: " + ((Guerrero) heroe).getFuerza());
                } else if (heroe instanceof Mago) {
                    System.out.println("Mana: " + ((Mago) heroe).getMana());
                } else if (heroe instanceof Arquero) {
                    System.out.println("Precisión: " + ((Arquero) heroe).getPrecision());
                } else if (heroe instanceof Asesino) {
                    System.out.println("Sigilo: " + ((Asesino) heroe).getSigilo());
                }
                return;*/
            }
        }
        System.out.println("No se encontró en el gremio un héroe con el nombre " + nombre);
    }

    public static void listarHeroes(ArrayList<Heroe> heroes) {
        if (heroes.isEmpty()) {
            System.out.println("No hay héroes registrados en el gremio.");
            return;
        }
        System.out.println("Héroes registrados: ");
        for (Heroe heroe : heroes) {
            System.out.println("- " + heroe.getNombre() + " (nivel: " + heroe.getNivel() + ")");
        }
    }


    /*private static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("Tiene que ser un número");
            }
        }
    }

    private static String obtenerLetra(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty() && Character.isLetter(input.charAt(0))) {
                return input;
            } else {
                System.out.print("Tiene que empezar por una letra");
            }
        }
    }*/
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