package examenes;

import java.util.Random;
import java.util.Scanner;

public class luciaMendiola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sel;
        int rondasJugador1 = 0;
        int rondasJugador2 = 0;
        int jugadorActual = 0; // 1 para jugador 1, 2 para jugador 2

        do {
            System.out.println("""
                    Selecciona una opción:
                    1. Jugar contra otro jugador
                    2. Jugar contra la máquina (próximamente)
                    3. Salir
                    """);

            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingresa una opción válida.");
                sc.next(); // Limpiar la entrada incorrecta
            }
            sel = sc.nextInt();

            switch (sel) {
                case 1:
                    System.out.println(pedirNombre1());
                    System.out.println(pedirNombre2());

                    int ganadorRonda = 0; // Al principio no hay ganador

                    // Decidir quién empieza la primera ronda
                    jugadorActual = empezar();

                    while (rondasJugador1 < 5 && rondasJugador2 < 5) {
                        // Se juega una ronda, el jugador que empieza es el que ha ganado la ronda anterior
                        int puntuacionJugador1 = jugar(1);
                        int puntuacionJugador2 = jugar(2);

                        if (puntuacionJugador1 == 0 && puntuacionJugador2 == 0) {
                            System.out.println("Empate en la ronda, se vuelve a empezar.");
                            continue; // Empate, se vuelve a jugar la ronda
                        }

                        if (puntuacionJugador1 > puntuacionJugador2 && puntuacionJugador1 <= 21) {
                            rondasJugador1++;
                            jugadorActual = 1; // Jugador 1 gana esta ronda y sigue jugando
                            System.out.println("Jugador 1 gana esta ronda");
                        } else if (puntuacionJugador2 > puntuacionJugador1 && puntuacionJugador2 <= 21) {
                            rondasJugador2++;
                            jugadorActual = 2; // Jugador 2 gana esta ronda y sigue jugando
                            System.out.println("Jugador 2 gana esta ronda");
                        } else if (puntuacionJugador1 == puntuacionJugador2) {
                            System.out.println("Empate en la ronda, nadie gana.");
                        }

                        System.out.println("Rondas Jugador 1: " + rondasJugador1 + " - Rondas Jugador 2: " + rondasJugador2);
                    }

                    if (rondasJugador1 == 5) {
                        System.out.println("¡Jugador 1 gana la partida!");
                    } else {
                        System.out.println("¡Jugador 2 gana la partida!");
                    }
                    break;

                case 2:
                    System.out.println("Has seleccionado jugar contra la máquina, se implementará próximamente");
                    break;

                case 3:
                    System.out.println("Has seleccionado salir");
                    break;

                default:
                    System.out.println("Introduce un número válido");

            }

        } while (sel != 3);
    }


    public static String pedirNombre1() {
        Scanner sc = new Scanner(System.in);
        String nombre1;

        System.out.print("Introduce el nombre del jugador1: ");
        nombre1 = sc.nextLine();

        return "Jugador1: " + nombre1;
    }

    public static String pedirNombre2() {
        Scanner sc = new Scanner(System.in);
        String nombre2;

        System.out.print("Introduce el nombre del jugador2: ");
        nombre2 = sc.nextLine();

        return "Jugador2: " + nombre2;
    }

    public static int empezar() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();

        System.out.print("El primer jugador tira el dado, ha sacado un: " + dado1 + ". El segundo jugador tira el dado y ha sacado un: " + dado2);

        if (dado1 > dado2) {
            System.out.println(". Empieza el jugador 1");
            return dado1;

        } else {
            System.out.println(". Empieza el jugador 2");
            return dado2;
        }
    }

    public static int tirarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int jugar (int jugador) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int tirada;
        boolean plantarse = false;

        // El jugador lanza dos dados inicialmente
        while (suma < 14) {
            tirada = tirarDado() + tirarDado();
            suma += tirada;
            System.out.println("Primera tirada = " + tirada + " | Total = " + suma);

            if (suma >= 14) {
                break; // Si llega a 14 o más, se termina la fase de lanzamiento inicial
            }

            System.out.println("¿Quieres seguir tirando o plantarte? (C: Continuar / P: Plantarse)");
            String decision = sc.nextLine().toUpperCase();

            while (!decision.equals("C") && !decision.equals("P")) {
                System.out.println("Respuesta inválida. Introduce C para continuar o P para plantarte.");
                decision = sc.nextLine().toUpperCase();
            }

            if (decision.equals("P")) {
                plantarse = true;
                break; // El jugador se planta
            }
        }

        // A partir de 14 puntos, solo tira un dado
        while (!plantarse && suma <= 21) {
            tirada = tirarDado();
            suma += tirada;
            System.out.println("Has sacado un dado: " + tirada + " | Total = " + suma);

            if (suma > 21) {
                System.out.println("Te has pasado de 21, pierdes esta ronda.");
                return 0; // El jugador pierde la ronda
            }

            System.out.println("¿Quieres seguir tirando o plantarte? (C: Continuar / P: Plantarse)");
            String decision = sc.nextLine().toUpperCase();

            while (!decision.equals("C") && !decision.equals("P")) {
                System.out.println("Respuesta inválida. Introduce C para continuar o P para plantarte.");
                decision = sc.nextLine().toUpperCase();
            }

            if (decision.equals("P")) {
                plantarse = true;
            }
        }

        return suma; // Devuelve la puntuación final del jugador
    }
}
