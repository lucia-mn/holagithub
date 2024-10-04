import java.util.Scanner;

public class IFjugadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("¿Cuántos jugadores hay?: ");
        int numJugadores = scan.nextInt();

        if (numJugadores == 1) {
            System.out.println("Single player");
        } else if (numJugadores == 2) {
            System.out.println("Two player");
        } else if (numJugadores == 3) {
            System.out.println("Multiplayer");
        } else if (numJugadores <= 0) {
            System.out.println("Not possible");
        }
    }
}