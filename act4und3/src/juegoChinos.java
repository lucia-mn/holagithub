import java.util.Scanner;
import java.util.InputMismatchException;

public class juegoChinos {

    public static void main(String[] args) {

        //1 selección de las monedas
        int apuestaMonedas;
        int monedas = 0;
        int dado;


        Scanner sc = new Scanner(System.in);

        System.out.println("Elige un número de monedas: ");
        monedas = sc.nextInt();
        System.out.println("Monedas jugador: " + numeroMonedas(monedas));

    }

    public static int numeroMonedas (int monedas) {
        for (int i = 0; i <= 3; i++) {
            if (monedas > 3) {
                System.out.println("Introduce un número válido entre 0 y 3");
            } else if (monedas <= 3) {
                return monedas;

            }
        }
        return monedas;
    }

    public static int apuestaMaquina (int dado) {
        dado = 1 + (int) (Math.random()*6);
        {
            return dado;
        }
    }



    //int contadorJugador;
    //int contadorMaquina;

}





/*
import java.util.Scanner;

public class JuegoChinos {

    // Variables para llevar el puntaje
    static int puntajeJugador = 0;
    static int puntajeMaquina = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de los chinos!");

        boolean turnoJugadorPrimero = true;

        while (puntajeJugador < 5 && puntajeMaquina < 5) {
            System.out.println("\n--- Nueva Ronda ---");
            System.out.println("Puntaje: Jugador " + puntajeJugador + " - Máquina " + puntajeMaquina);

            // Ejecuta una ronda, alternando quien comienza
            if (turnoJugadorPrimero) {
                jugarRondaJugadorPrimero(scanner);
            } else {
                jugarRondaMaquinaPrimero(scanner);
            }

            // Cambia el turno de quién empieza
            turnoJugadorPrimero = !turnoJugadorPrimero;
        }

        mostrarGanadorFinal();
        scanner.close();
    }

    // Métodos para jugar una ronda cuando el jugador apuesta primero
    public static void jugarRondaJugadorPrimero(Scanner scanner) {
        int monedasJugador = seleccionarMonedasJugador(scanner);
        int monedasMaquina = seleccionarMonedasMaquina();

        int apuestaJugador = hacerApuestaJugador(scanner, 0, 6);
        int apuestaMaquina = hacerApuestaMaquina(apuestaJugador, monedasMaquina, 0, 6);

        resolverRonda(monedasJugador, monedasMaquina, apuestaJugador, apuestaMaquina);
    }

    // Métodos para jugar una ronda cuando la máquina apuesta primero
    public static void jugarRondaMaquinaPrimero(Scanner scanner) {
        int monedasJugador = seleccionarMonedasJugador(scanner);
        int monedasMaquina = seleccionarMonedasMaquina();

        int apuestaMaquina = hacerApuestaMaquina(-1, monedasMaquina, 0, 6);
        int apuestaJugador = hacerApuestaJugador(scanner, 0, 6, apuestaMaquina);

        resolverRonda(monedasJugador, monedasMaquina, apuestaJugador, apuestaMaquina);
    }

    // Métodos para que el jugador seleccione su cantidad de monedas (entre 0 y 3)
    public static int seleccionarMonedasJugador(Scanner scanner) {
        int monedas;
        do {
            System.out.print("Selecciona el número de monedas (0-3): ");
            monedas = scanner.nextInt();
        } while (monedas < 0 || monedas > 3);
        return monedas;
    }

    // Métodos para que la máquina seleccione aleatoriamente su cantidad de monedas (entre 0 y 3)
    public static int seleccionarMonedasMaquina() {
        return (int)(Math.random() * 4);
    }

    // Métodos para que el jugador haga su apuesta de la suma total (entre 0 y 6), opcionalmente evitando una apuesta
    public static int hacerApuestaJugador(Scanner scanner, int min, int max, int... evitar) {
        int apuesta;
        do {
            System.out.print("Apuesta el total de monedas (0-6): ");
            apuesta = scanner.nextInt();
        } while ((apuesta < min || apuesta > max) || (evitar.length > 0 && apuesta == evitar[0]));
        return apuesta;
    }

    // Métodos para que la máquina haga su apuesta de la suma total (entre 0 y 6), evitando una apuesta
    public static int hacerApuestaMaquina(int evitar, int monedasMaquina, int min, int max) {
        int apuesta;
        do {
            apuesta = min + (int)(Math.random() * (max - min + 1));
        } while (apuesta == evitar || apuesta < monedasMaquina);  // La apuesta debe ser >= monedas seleccionadas
        System.out.println("La máquina apuesta: " + apuesta);
        return apuesta;
    }

    // Métodos para resolver la ronda y actualizar los puntajes
    public static void resolverRonda(int monedasJugador, int monedasMaquina, int apuestaJugador, int apuestaMaquina) {
        int sumaMonedas = monedasJugador + monedasMaquina;

        System.out.println("Jugador eligió " + monedasJugador + " monedas y apostó " + apuestaJugador);
        System.out.println("Máquina eligió " + monedasMaquina + " monedas y apostó " + apuestaMaquina);
        System.out.println("Total de monedas: " + sumaMonedas);

        if (apuestaJugador == sumaMonedas) {
            System.out.println("¡Jugador gana la ronda!");
            puntajeJugador++;
        } else if (apuestaMaquina == sumaMonedas) {
            System.out.println("¡Máquina gana la ronda!");
            puntajeMaquina++;
        } else {
            System.out.println("Empate en la ronda, nadie acierta.");
        }
    }

    // Métodos para mostrar el ganador final
    public static void mostrarGanadorFinal() {
        System.out.println("\n--- Fin del Juego ---");
        if (puntajeJugador == 5) {
            System.out.println("¡Felicidades! El jugador ha ganado la serie.");
        } else {
            System.out.println("La máquina ha ganado la serie. Mejor suerte la próxima vez.");
        }
        System.out.println("Puntaje final: Jugador " + puntajeJugador + " - Máquina " + puntajeMaquina);
    }
}

 */
