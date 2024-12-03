import java.sql.SQLOutput;
import java.util.Scanner;

public class mainJugador {

    public static void main(String[] args) {

        /*Jugador[] jugadores = new Jugador[5];

        jugadores[0] = new Jugador("Messi", "centro", 750.000, 20, 4);
        jugadores[1] = new Jugador("Cristiano", "delantero", 800.000, 21, 6);
        jugadores[2] = new Jugador("Casillas", "portero", 45.000, 0, 1);
        jugadores[3] = new Jugador("Neymar", "defensa", 20.000, 2, 0);
        jugadores[4] = new Jugador("Iniesta", "delantero", 300.000, 24, 2);
        //pasar a toString*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de jugadores: ");
        int num = sc.nextInt();

        Jugador[] jugadores = new Jugador[num];
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce la posición: ");
            String posicion = sc.nextLine();
            System.out.println("Introduce el sueldo: ");
            double sueldo = sc.nextDouble();
            System.out.println("Introduce el número de goles: ");
            int goles = sc.nextInt();
            System.out.println("Introduce el número de tarjetas: ");
            int tarjetas = sc.nextInt();
            sc.nextLine();
            jugadores[i] = new Jugador(nombre, posicion, sueldo, goles, tarjetas);
        }


        //promedio goles
        //public static double totalGoles() { se podria hacer con métodos, no es el caso
            double totalgoles = 0;
            for (int i = 0; i < jugadores.length; i++) {
                totalgoles = totalgoles + jugadores[i].getGoles();
            }

            double promedio = totalgoles/jugadores.length;
            System.out.println("promedio de goles: " + promedio);
        //}


        //quién gana más
        double maxSueldo = 0;
        int posicion = 0; //para hacer el sout de la persona

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getSueldo() > maxSueldo) {
                maxSueldo = jugadores[i].getSueldo();
                posicion = i;
            }
        }

        System.out.println("la persona con más sueldo es: " + jugadores[posicion].getNombre());


        //quién tiene menos tarjetas amarillas
        double minTarjetas = 0;
        int posicion2 = 0; //para hacer el sout de la persona

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getSueldo() < minTarjetas) {
                minTarjetas = jugadores[i].getSueldo();
                posicion2 = i;
            }
        }

        System.out.println("la persona con más sueldo es: " + jugadores[posicion2].getAmarillas());

    }
}
