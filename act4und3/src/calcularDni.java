
import java.util.Scanner;
import java.util.InputMismatchException;

public class calcularDni {

    private static boolean esNumero (String dni) {
        for (int i = 0; i < dni.length(); i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;


        while (salir == false) {

            try {

                System.out.println("Introduce tu DNI:");
                int dniLetra = sc.nextInt();

                String dniString = Integer.toString(dniLetra);

                if (dniString.length() != 8 && esNumero(dniString)) {
                    System.out.println("Tienen que ser 8 números");

                } else {
                    int dniLetra2 = Integer.parseInt(dniString);

                    if (dniLetra2 % 23 == 0) {
                        System.out.println("El DNI es: " + dniLetra2 + " T");
                        salir = true;

                    } else if (dniLetra2 % 23 == 1) {
                        System.out.println("El DNI es: " + dniLetra2 + " R");
                        salir = true;

                    } else if (dniLetra2 % 23 == 2) {
                        System.out.println("El DNI es: " + dniLetra2 + " W");
                        salir = true;

                    } else if (dniLetra2 % 23 == 3) {
                        System.out.println("El DNI es: " + dniLetra2 + " A");
                        salir = true;

                    } else if (dniLetra2 % 23 == 4) {
                        System.out.println("El DNI es: " + dniLetra2 + " G");
                        salir = true;

                    } else if (dniLetra2 % 23 == 5) {
                        System.out.println("El DNI es: " + dniLetra2 + " M");
                        salir = true;

                    } else if (dniLetra2 % 23 == 6) {
                        System.out.println("El DNI es: " + dniLetra2 + " Y");
                        salir = true;

                    } else if (dniLetra2 % 23 == 7) {
                        System.out.println("El DNI es: " + dniLetra2 + " F");
                        salir = true;

                    } else if (dniLetra2 % 23 == 8) {
                        System.out.println("El DNI es: " + dniLetra2 + " P");
                        salir = true;

                    } else if (dniLetra2 % 23 == 9) {
                        System.out.println("El DNI es: " + dniLetra2 + " D");
                        salir = true;

                    } else if (dniLetra2 % 23 == 10) {
                        System.out.println("El DNI es: " + dniLetra2 + " X");
                        salir = true;

                    } else if (dniLetra2 % 23 == 11) {
                        System.out.println("El DNI es: " + dniLetra2 + " B");
                        salir = true;

                    } else if (dniLetra2 % 23 == 12) {
                        System.out.println("El DNI es: " + dniLetra2 + " N");
                        salir = true;

                    } else if (dniLetra2 % 23 == 13) {
                        System.out.println("El DNI es: " + dniLetra2 + " J");
                        salir = true;

                    } else if (dniLetra2 % 23 == 14) {
                        System.out.println("El DNI es: " + dniLetra2 + " Z");
                        salir = true;

                    } else if (dniLetra2 % 23 == 15) {
                        System.out.println("El DNI es: " + dniLetra2 + " S");
                        salir = true;

                    } else if (dniLetra2 % 23 == 16) {
                        System.out.println("El DNI es: " + dniLetra2 + " Q");
                        salir = true;

                    } else if (dniLetra2 % 23 == 17) {
                        System.out.println("El DNI es: " + dniLetra2 + " V");
                        salir = true;

                    } else if (dniLetra2 % 23 == 18) {
                        System.out.println("El DNI es: " + dniLetra2 + " H");
                        salir = true;

                    } else if (dniLetra2 % 23 == 19) {
                        System.out.println("El DNI es: " + dniLetra2 + " L");
                        salir = true;

                    } else if (dniLetra2 % 23 == 20) {
                        System.out.println("El DNI es: " + dniLetra2 + " C");
                        salir = true;

                    } else if (dniLetra2 % 23 == 21) {
                        System.out.println("El DNI es: " + dniLetra2 + " K");
                        salir = true;

                    } else {
                        System.out.println("El DNI es: " + dniLetra2 + " E");
                        salir = true;
                    }

                    sc.nextLine();
                }


            } catch(InputMismatchException error) {
                System.out.println("Son 8 números y sin letra");
                sc.nextLine();
            }
        }
        System.out.println("Fin del programa");
    }
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
