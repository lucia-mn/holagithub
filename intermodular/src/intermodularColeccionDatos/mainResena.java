package intermodularColeccionDatos;

import ejemploEduardo.Almohada;
import ejemploEduardo.Colchon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

//lucia mendiola naharro

public class mainResena {

    static Resena resena = new Resena("AB01", 1234, 9, "Excelente juego, muy divertido", "2003-07-09", 1234);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraydeResena listaResenas = new ArraydeResena();


        boolean fin = true;
        while (fin) {

            imprimirmenu();
            int opcion = obtenerNumero(scanner);

            switch (opcion) {
                case 1:
                    agregarResena(scanner, listaResenas);
                    break;

                case 2:
                    eliminarResena(scanner, listaResenas);
                    break;

                case 3:
                    actualizarResena(scanner, listaResenas);
                    break;

                case 4:
                    mostrarResenas(listaResenas.getResenas());
                    break;

                case 5:
                    listaResenas.printResenas();
                    break;

                case 6:
                    fin = false;
                    break;

                case 7:
                    pasarAXml(listaResenas);
                    break;

                case 8:
                    infoclase(resena, listaResenas);
                    break;

                default:
                    System.out.println("Opción no válida, introduce un número del menú de opciones");
                    break;
            }
        }
        System.out.println("*** Fin del programa ***");
    }




    //METODOS
    public static void infoclase(Object o, ArraydeResena listaResenas) {
        Class<?> c;
        c=o.getClass();

        System.out.println("<RESENAS>");
        for (Resena resena : listaResenas.getResenas()) {
            System.out.println("      <resenaJuego>");
            System.out.println("           <" + c.getName() + "> " + resena.getIdResena() + " </idResena>");
            System.out.println("           <idProducto> " + resena.getIdProducto() + " </idProducto>");
            System.out.println("           <calificacion> " + resena.getCalificacion() + " </calificacion>");
            System.out.println("           <contenido> " + resena.getContenido() + " </contenido>");
            System.out.println("           <fPublicacion> " + resena.getFPublicacion() + " </fPublicacion>");
            System.out.println("           <idUsuario> " + resena.getIdUsuario() + " </idUsuario>");
            System.out.println("      </resenaJuego>\n");
        }
        System.out.println("</RESENAS>");

        System.out.println("Nombre de la clase: "+c.getName());
        System.out.println("Nombre del paquete: "+c.getPackage().getName());
        System.out.println("Hereda de la clase: "+c.getSuperclass().getName());
        System.out.println("Posee los campos:");
        for (int i=0;i<c.getDeclaredFields().length;i++)
        {
            System.out.println("\t"+ ""+c.getDeclaredFields()[i].getName()+ " "+c.getDeclaredFields()[i].getType().getName());
        }
    }

    //menu
    public static void imprimirmenu() {
        System.out.println(" ");
        System.out.println("---* Menú *---");
        System.out.println("1. Añadir reseña");
        System.out.println("2. Eliminar reseña");
        System.out.println("3. Actualizar reseña");
        System.out.println("4. Consultar reseñas");
        System.out.println("5. Imprimir reseñas");
        System.out.println("6. Salir");
        System.out.println("7. Pasar de JAVA a XML");
        System.out.println("8. Resena XML bien");
        System.out.print("Selecciona una opción: ");
    }

    private static void agregarResena(Scanner scanner, ArraydeResena listaResenas) {
        System.out.println("---* Introducción datos reseña *---");

        String idResena;
        do {
            System.out.print("ID de la reseña, máximo 64 caracteres: ");
            idResena = scanner.nextLine();
        } while (idResena.length() > 64);

        int idProducto;
        do {
            System.out.print("ID del producto, solo números: ");
            idProducto = obtenerNumero(scanner);
        } while (idProducto <= 0);

        int calificacion;
        do {
            System.out.print("Calificación del 1 al 10, solo números enteros: ");
            calificacion = obtenerNumero(scanner);
        } while (calificacion < 1 || calificacion > 10);

        String contenido;
        do {
            System.out.print("Contenido de la reseña, máximo 100 caracteres: ");
            contenido = scanner.nextLine();
        } while (contenido.length() > 100);

        String fPublicacion;
        do {
            System.out.print("Fecha de publicación de la reseña en formato AAAA-MM-DD: ");
            fPublicacion = scanner.nextLine();
        } while (!esFechaValida(fPublicacion));

        int idUsuario;
        do {
            System.out.print("ID del usuario, solo números: ");
            idUsuario = obtenerNumero(scanner);
        } while (idUsuario <= 0);


        Resena resena = new Resena(idResena, idProducto, calificacion, contenido, fPublicacion, idUsuario);
        if (listaResenas.addNewResena(resena)) {
            System.out.println("La reseña se ha añadido a la lista");
        } else {
            System.out.println("Ya hay una reseña con el mismo ID de reseña o ID de producto");
        }
    }

    private static void eliminarResena(Scanner scanner, ArraydeResena listaResenas) {
        System.out.print("ID de la reseña a eliminar: ");
        String idResena = scanner.nextLine();
        if (listaResenas.removeResena(idResena)) {
            System.out.println("La reseña ha sido eliminada");
        } else {
            System.out.println("No hay una reseña con ese ID en la lista");
        }
    }

    private static void actualizarResena(Scanner scanner, ArraydeResena listaResenas) {
        System.out.print("ID de la reseña a actualizar: ");
        String idResena = scanner.nextLine();

        System.out.print("Calificación del 1 al 10: ");
        int Calificacion = obtenerNumero(scanner);

        System.out.print("Contenido de la reseña: ");
        String Contenido = scanner.nextLine();

        if (listaResenas.updateResena(idResena, Calificacion, Contenido)) {
            System.out.println("La reseña ha sido actualizada");
        } else {
            System.out.println("No hay una reseña con ese ID en la lista.");
        }
    }

    //validar fecha
    private static boolean esFechaValida(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;

        } catch (ParseException e) {
            System.out.println("Formato incorrecto, vuelve a intentarlo: ");
            return false;
        }
    }

    //idproducto, calificaion, idusuario que sean números
    private static int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.print("Tiene que ser un número, vuelve a intentarlo: ");
            }
        }
    }

    //imprimir array
    private static void mostrarResenas(ArrayList<Resena> resenas) {
        System.out.println(" ");
        System.out.println("---* Lista de reseñas *--- ");
        for (Resena r : resenas) {
            System.out.println(r);
        }
    }

    //pasar a XML
    private static void pasarAXml(ArraydeResena listaResenas) {
        if (listaResenas == null || listaResenas.getResenas().isEmpty()) {
            System.out.println("No hay reseñas para imprimir");

        } else {
            System.out.println("<RESENAS>");
            for (Resena resena : listaResenas.getResenas()) {
                System.out.println("      <resenaJuego>");
                System.out.println("           <idResena> " + resena.getIdResena() + " </idResena>");
                System.out.println("           <idProducto> " + resena.getIdProducto() + " </idProducto>");
                System.out.println("           <calificacion> " + resena.getCalificacion() + " </calificacion>");
                System.out.println("           <contenido> " + resena.getContenido() + " </contenido>");
                System.out.println("           <fPublicacion> " + resena.getFPublicacion() + " </fPublicacion>");
                System.out.println("           <idUsuario> " + resena.getIdUsuario() + " </idUsuario>");
                System.out.println("      </resenaJuego>\n");
            }
            System.out.println("</RESENAS>");
        }
    }

}
