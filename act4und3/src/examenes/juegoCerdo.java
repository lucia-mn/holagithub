package examenes;

import java.util.Scanner;

public class juegoCerdo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = scan.nextLine();

    }


    public static boolean caracterAlfabetico (String nombre) {
        do {
            for (int i = 0; i < nombre.length(); i++) {
                if (Character.isLetter(nombre.charAt(i))) {
                    return false;
                }
            }
        System.out.println("Solo se admiten letras");
        return true;

        } while (!Character.isLetter(nombre.charAt(i)));
    }

    public static boolean guionesBajos (String nombre2) {

        for (int i = 0; i < nombre2.length(); i++) {
            if (nombre2.equalsIgnoreCase(nombre2));

            System.out.println("No se aceptan dos guines bajos seguidos");
        }
        return false;

    }




}
