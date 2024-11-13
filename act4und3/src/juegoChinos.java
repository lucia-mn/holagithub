import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.InputMismatchException;

public class juegoChinos {

    //int contadorJ = 0;
    //int contadorM = 0;
    //int monedas;


    public static void main(String[] args) {

        int contadorJ = 0;
        int contadorM = 0;
        Scanner sc = new Scanner(System.in);

        do {

        //System.out.println("Selecciona el número de monedas (0-3): " );
        int monedasJ = seleccionMonedasJ();

        int monedasM = seleccionMonedasM();
        //System.out.print("Haz una apuesta (0-6): ");

        int apuestaJ = apuestaJugador();

        int apuestaM = apuestaMaquina(monedasM);

        //System.out.println(ganadorRonda(monedasJ, monedasM, apuestaJ, apuestaM));
        String ganador = ganadorRonda(monedasJ, monedasM, apuestaJ, apuestaM);

        if (ganador == "Jugador") {
            contadorJ ++;

        } else if (ganador == "Máquina") {
            contadorM ++;
        }

        } while (contadorJ < 5 && contadorM <5);

    }


    public static int seleccionMonedasJ () {
        Scanner sc = new Scanner(System.in);
        int monedasJ;

        do {
            System.out.print("Selecciona el número de monedas (0-3): ");
            monedasJ = sc.nextInt();
        } while (monedasJ < 0 || monedasJ > 3);

        return monedasJ;
    }

    public static int seleccionMonedasM () {
        int monedasM;
        monedasM = 1 + (int) (Math.random() * 3);

        return monedasM;
    }

    public static int apuestaJugador () {
        Scanner sc = new Scanner(System.in);
        int apuestaJ;

        do {
            System.out.print("Haz una apuesta (0-6): ");
            apuestaJ = sc.nextInt();
        } while (apuestaJ < 0 || apuestaJ > 6);

        return apuestaJ;
    }

    public static int apuestaMaquina (int monedasM) {
        int apuestaM;
        apuestaM = 1 + (int) (Math.random() * 3) + monedasM;

        return apuestaM;
    }

    public static String ganadorRonda (int monedasJ, int monedasM, int apuestaJ, int apuestaM) {

        int sumaMonedas = monedasJ + monedasM;
        String ganador;

        if (sumaMonedas == apuestaJ) {
            System.out.println("El ganador de la ronda es el jugador");
            ganador = "Jugador";

        } else if (sumaMonedas == apuestaM) {
            System.out.println("El ganador de la ronda es la máquina");
            ganador = "Máquina";

        } else {
            System.out.println("En esta ronda hay empate");
            ganador = "Empate";
        }

        return ganador;
    }

    /*public static void ganadorPartida (int contadorJ, int contadorM) {
        do {
            if (contadorJ == 5) {
                System.out.println("El ganador es el jugador");

            } else {
                System.out.println("El ganador es la máquina");
            }

        } while (contadorJ < 6);
        System.out.println("Fin de la partida");
    }*/
}









