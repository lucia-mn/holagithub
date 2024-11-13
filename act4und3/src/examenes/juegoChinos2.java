package examenes;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.InputMismatchException;

public class juegoChinos2 {

    //int contadorJ = 0;
    //int contadorM = 0;
    //int monedas;


    public static void main(String[] args) {

        int contadorJ = 0;
        int contadorM = 0;
        Scanner sc = new Scanner(System.in);
        boolean turnoJugador = true;

        do {

            //System.out.println("Selecciona el número de monedas (0-3): " );
            int monedasJ;
            int apuestaJ;

            int monedasM;
            //System.out.print("Haz una apuesta (0-6): ");
            int apuestaM;


            /*if (turnoJugador) {
                System.out.println("Monedas Jugador: " + monedasJ);
                System.out.println("Apuesta Jugador: " + apuestaJ);

            } else {
                System.out.println("Apuesta Máquina: " + apuestaM);
                System.out.println("Monedas Jugador: " + monedasJ);
            }


            System.out.println("El jugador escogió " + monedasJ + " monedas y apostó " + apuestaJ);
            System.out.println("La máquina escogió " + monedasM + " monedas y apostó " + apuestaM);*/

            if (turnoJugador) {
                // Turno del jugador
                System.out.println("Turno del jugador para empezar");

                monedasJ = seleccionMonedasJ();
                apuestaJ = apuestaJugador();

                monedasM = seleccionMonedasM();
                apuestaM = apuestaMaquina(monedasM, apuestaJ);

                System.out.println("Monedas jugador: " + monedasJ);
                System.out.println("Apuesta jugador: " + apuestaJ);
                System.out.println("La máquina escogió " + monedasM + " monedas y apostó " + apuestaM);

            } else {
                // Turno de la máquina
                System.out.println("Turno de la máquina para empezar");

                monedasJ = seleccionMonedasJ();
                monedasM = seleccionMonedasM();
                apuestaM = apuestaMaquina(monedasM, -1); // La máquina hace su apuesta sin saber la del jugador

                apuestaJ = apuestaJugador();


                System.out.println("Apuesta máquina: " + apuestaM);
                System.out.println("Monedas jugador: " + monedasJ + " y apuesta jugador: " + apuestaJ);
                System.out.println("La máquina escogió " + monedasM + " monedas.");
            }


            //System.out.println(ganadorRonda(monedasJ, monedasM, apuestaJ, apuestaM));
            String ganador = ganadorRonda(monedasJ, monedasM, apuestaJ, apuestaM);

            if (ganador.equals("Jugador")) {
                contadorJ ++;

            } else if (ganador.equals("Máquina")) {
                contadorM ++;
            }

            System.out.println("Resultado: máquina " + contadorM + " – jugador " + contadorJ);

            turnoJugador = !turnoJugador;

        } while (contadorJ < 5 && contadorM <5);

        if (contadorJ == 5) {
            System.out.println("El jugador ha ganado la serie de rondas. ¡Enhorabuena!");

        } else {
            System.out.println("La máquina ha ganado la serie de rondas");
        }

    }



    public static int seleccionMonedasJ () {
        Scanner sc = new Scanner(System.in);
        int monedasJ;

        do {
            System.out.print("Selecciona el número de monedas (0-3): ");
            monedasJ = sc.nextInt();

            if (monedasJ < 0 || monedasJ > 3) {
                System.out.println("Eres imbécil no puedes poner más de 3, vuelve a intentarlo <3");
            }

        } while (monedasJ < 0 || monedasJ > 3);

        return monedasJ;
    }

    public static int seleccionMonedasM () {
        int monedasM;
        monedasM = (int) (Math.random() * 3);

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

    public static int apuestaMaquina (int monedasM, int apuestaJ) {
        int apuestaM;

        do {
            apuestaM = 1 + (int) (Math.random() * 3) + monedasM;

        } while (apuestaM == apuestaJ);

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