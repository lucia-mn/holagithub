import java.util.Scanner;

public class ej6 {
        public static void main (String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String piece;
            System.out.println("Introduce la inicial del nombre de la pieza de ajedrez:");

            piece = sc.nextLine();
            if (piece.equals("R")){ //Rey
                System.out.println("Puede moverse en todas direcciones pero solo avanza una posición.");
            } else if (piece.equals("D")) { //Dama o reina
                System.out.println("Puede moverse en todas las direcciones y avanazar todas las casillas disponibles");
            } else if (piece.equals("P")) { //peón
                System.out.println("Puede moverse una o dos casillas al principio y lateralmente");
            } else if (piece.equals("C")) { //caballo
                System.out.println("Puede moverse en forma de L");
            } else if (piece.equals("A")) {
                System.out.println("Puede moverse en diagonal");
            } else if (piece.equals("T")) {
                System.out.println("Puede moverse en horizontal o vertical");
            } else {
                System.out.println("No disponible");
            }
        }
    }

//int suma = 0; acumula todas las sumas parciales que vayamos haciendo
