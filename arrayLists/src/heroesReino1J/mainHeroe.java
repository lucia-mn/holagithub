package heroesReino1J;

import java.util.*;

public class mainHeroe {

    private static ArrayList<Arma> armas;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Heroe> heroes = new ArrayList<>();
        armas = new ArrayList<>();
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
                    crearHeroe(scanner, heroes);
                    break;

                case 2:
                    System.out.print("Nombre del arma: ");
                    String nombreArma = scanner.nextLine();

                    System.out.print("Daño que infringe: ");
                    int danyo = scanner.nextInt();
                    scanner.nextLine();

                    if (nombreArma == null || nombreArma.trim().isEmpty()) {
                        System.out.println("El nombre del arma no puede estar vacío");
                        break;
                    }

                    if (!Character.isLetter(nombreArma.charAt(0))) {
                        System.out.println("El nombre del arma debe empezar con una letra");
                        break;
                    }

                    // Asegúrate de que armas esté inicializada antes de llamar a addNuevaArma
                    if (addNuevaArma(armas, nombreArma, danyo)){
                        System.out.println("¡El arma " + nombreArma + " ha sido añadida al arsenal con " + danyo+ " puntos de daño!");
                    } else {
                        System.out.println("Esta arma ya se encuentra entre nuestro arsenal");
                    }
                    break;

                case 3:
                    System.out.print("Nombre del héroe: ");
                    String nombreEliminar = scanner.nextLine();
                    if (eliminarHeroe(heroes, nombreEliminar)) {
                        System.out.println("El héroe " + nombreEliminar + " se ha ido del gremio");
                    } else {
                        System.out.println("No existe un héroe en el gremio con ese nombre");
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
    private static void crearHeroe(Scanner scanner, ArrayList<Heroe> heroes) {
        System.out.println("¿Qué tipo de héroe quieres ser hoy?");
        System.out.println("1. Guerrero/a");
        System.out.println("2. Mago/a");
        System.out.println("3. Arquero/a");
        System.out.println("4. Asesino/a");


        int tipo = 0;
        while (tipo < 1 || tipo > 4) {
            System.out.print("Elige una opción (1-4): ");
            if (scanner.hasNextInt()) {
                tipo = scanner.nextInt();
                if (tipo < 1 || tipo > 4) {
                    System.out.println("Opción no válida. Por favor, elige un número entre 1 y 4.");
                }
            } else {
                System.out.println("Por favor, introduce un número entre 1 y 4.");
                scanner.next();
            }
        }
        scanner.nextLine();


        System.out.print("Nombre del héroe: ");
        String nombreHeroe = scanner.nextLine();

        System.out.print("Nivel: ");
        int nivel = obtenerNumeroEntero(scanner, "nivel");

        System.out.print("Puntos de vida: ");
        int puntosVida = obtenerNumeroEntero(scanner, "puntos de vida");


        int atributoExtra = 0;
        String atributoNombre = "";

        switch (tipo) {
            case 1:
                atributoNombre = "Fuerza";
                break;
            case 2:
                atributoNombre = "Maná";
                break;
            case 3:
                atributoNombre = "Precisión";
                break;
            case 4:
                atributoNombre = "Sigilo";
                break;
        }

        System.out.print(atributoNombre + ": ");
        atributoExtra = obtenerNumeroEntero(scanner, atributoNombre.toLowerCase());


        Heroe nuevoHeroe = null;
        switch (tipo) {
            case 1:
                nuevoHeroe = new Guerrero(nombreHeroe, nivel, puntosVida, new ArrayList<>(), atributoExtra);
                break;
            case 2:
                nuevoHeroe = new Mago(nombreHeroe, nivel, puntosVida, new ArrayList<>(), atributoExtra);
                break;
            case 3:
                nuevoHeroe = new Arquero(nombreHeroe, nivel, puntosVida, new ArrayList<>(), atributoExtra);
                break;
            case 4:
                nuevoHeroe = new Asesino(nombreHeroe, nivel, puntosVida, new ArrayList<>(), atributoExtra);
                break;
        }


        System.out.println("Elige un arma para tu héroe: ");
        listarArmas(armas); 
        int elegirArma = scanner.nextInt();
        
        if (elegirArma >= 0 && elegirArma < armas.size()) {
            Arma armaSeleccionada = armas.get(elegirArma);
            System.out.println("Detalles del arma: ");
            System.out.println("Nombre: " + armaSeleccionada.getNombre());
            System.out.println("Daño: " + armaSeleccionada.getDanyo());
        } else {
            System.out.println("Opción no válida, por favor elige un número de la lista");
        }

        
        if (nuevoHeroe != null) {
            if (addInOrder(heroes, nuevoHeroe)) {
                System.out.println("¡" + nuevoHeroe.getNombre() + " se ha unido al gremio con su nueva arma!");
            } else {
                System.out.println("No se ha podido añadir el héroe al gremio :(");
            }
        }
    }

    private static int obtenerNumeroEntero(Scanner scanner, String tipo) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            //System.out.print("Introduce el " + tipo + ": ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                scanner.nextLine();
                valido = true;
            } else {
                System.out.println("El " + tipo + " debe ser un número entero");
                scanner.next();
            }
        }
        return numero;
    }

    public static void listarArmas(ArrayList<Arma> armas) {
        for (int i = 0; i < armas.size(); i++) {
            System.out.println(i + ": " + armas.get(i).getNombre());
        }
    }




    //para imprimir el menú
    public static void imprimirMenu() {
        System.out.println("Bienvenido a Héroes 1J");
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

    private static boolean addNuevaArma(ArrayList<Arma> armas, String nombreArma, int danyo) {
        for (Arma arma : armas) {
            if (arma.getNombre().equalsIgnoreCase(nombreArma)) {
                System.out.println("El arma " + nombreArma + " ya está en el arsenal");
                return false;
            }
        }

        armas.add(new Arma(nombreArma, danyo));
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

                if (heroe instanceof Guerrero) {
                    System.out.println("Fuerza: " + ((Guerrero) heroe).getFuerza());
                } else if (heroe instanceof Mago) {
                    System.out.println("Mana: " + ((Mago) heroe).getMana());
                } else if (heroe instanceof Arquero) {
                    System.out.println("Precisión: " + ((Arquero) heroe).getPrecision());
                } else if (heroe instanceof Asesino) {
                    System.out.println("Sigilo: " + ((Asesino) heroe).getSigilo());
                }
                return;
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