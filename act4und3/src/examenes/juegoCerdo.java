package examenes;

import java.util.Scanner;

import java.util.Scanner;

public class juegoCerdo { // Cambia "TuNombrePrimerApellido" por tu nombre y primer apellido

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreJugador;

        // Solicita un nombre de jugador hasta que sea válido
        do {
            System.out.print("Introduce el nombre del jugador: ");
            nombreJugador = sc.nextLine();
        } while (!esNombreValido(nombreJugador));  // Repite hasta que el nombre sea válido

        System.out.println("¡Nombre válido! Bienvenido al juego, " + nombreJugador + ".");

        // Comienza el juego una vez se ha validado el nombre
        jugarJuegoCerdo(sc, nombreJugador);
    }

    // Método principal para validar el nombre del jugador
    public static boolean esNombreValido(String nombre) {
        if (nombre.length() > 30) {  // Verifica que el nombre no sea mayor a 30 caracteres
            System.out.println("Nombre inválido. Debe tener menos de 30 caracteres.");
            return false;
        }
        if (!tieneFormatoCorrecto(nombre)) {  // Verifica que el nombre cumple con el formato requerido
            return false;
        }
        if (contieneDosGuionesSeguidos(nombre)) {  // Verifica que no contenga "__"
            System.out.println("Nombre inválido. No puede contener dos guiones bajos seguidos.");
            return false;
        }
        return true;  // Si pasa todas las verificaciones, el nombre es válido
    }

    // Método para verificar que el nombre empieza y termina con una letra y solo contiene letras y guiones bajos
    public static boolean tieneFormatoCorrecto(String nombre) {
        if (!empiezaYTerminaConLetra(nombre)) {  // Verifica que el nombre empiece y termine con letra
            System.out.println("Nombre inválido. Debe comenzar y terminar con una letra.");
            return false;
        }
        if (!contieneSoloLetrasYGuiones(nombre)) {  // Verifica que solo contenga letras y guiones bajos
            System.out.println("Nombre inválido. Solo puede contener letras y guiones bajos.");
            return false;
        }
        return true;
    }

    // Método para comprobar que el nombre empieza y termina con una letra
    public static boolean empiezaYTerminaConLetra(String nombre) {
        char primerCaracter = nombre.charAt(0);
        char ultimoCaracter = nombre.charAt(nombre.length() - 1);
        return Character.isLetter(primerCaracter) && Character.isLetter(ultimoCaracter);
    }

    // Método para comprobar que el nombre solo contiene letras y guiones bajos
    public static boolean contieneSoloLetrasYGuiones(String nombre) {
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            if (!Character.isLetter(c) && c != '_') {  // Verifica si hay un carácter que no sea letra ni guion
                return false;  // Retorna false si algún carácter no es permitido
            }
        }
        return true;  // Si todos los caracteres son válidos, retorna true
    }

    // Método para comprobar si el nombre contiene dos guiones bajos seguidos
    public static boolean contieneDosGuionesSeguidos(String nombre) {
        return nombre.contains("__");  // Retorna true si el nombre tiene "__"
    }

    // Método para jugar al juego "Cerdo"
    public static void jugarJuegoCerdo(Scanner sc, String nombreJugador) {
        int puntosJugador = 0;
        int puntosMaquina = 0;
        boolean continuarJuego;

        do {
            // Turno del jugador
            puntosJugador += turnoJugador(sc, nombreJugador);
            if (puntosJugador >= 50) break;  // Si el jugador alcanza o supera 50 puntos, termina el juego

            // Turno de la máquina
            puntosMaquina += turnoMaquina();
            System.out.println("Puntuación: " + nombreJugador + " - " + puntosJugador + ", Máquina - " + puntosMaquina);

            continuarJuego = puntosJugador < 50 && puntosMaquina < 50;  // El juego continúa si nadie ha alcanzado 50 puntos
        } while (continuarJuego);

        // Determinación del ganador al finalizar el juego
        if (puntosJugador >= 50 && puntosMaquina < 50) {
            System.out.println("¡Felicidades, " + nombreJugador + "! Has ganado.");
        } else if (puntosMaquina >= 50 && puntosJugador < 50) {
            System.out.println("La máquina ha ganado.");
        } else {
            System.out.println("Es un empate.");
        }
    }

    // Turno del jugador
    public static int turnoJugador(Scanner sc, String nombreJugador) {
        int puntosTurno = 0;
        boolean continuar = true;

        while (continuar) {
            int dado = lanzarDado();  // Lanza el dado para el jugador
            System.out.println(nombreJugador + " lanzó un " + dado);

            if (dado == 6) {  // Si saca un 6, pierde todos los puntos de este turno
                System.out.println("¡Sacaste un 6! Perdiste los puntos de este turno.");
                return 0;
            } else {
                puntosTurno += dado;  // Suma la tirada a los puntos de este turno
                System.out.print("Tienes " + puntosTurno + " puntos en este turno. ¿Quieres (P)lantarte o (C)ontinuar? ");

                String eleccion = sc.nextLine().toUpperCase();
                // Solo acepta P o C como opciones válidas
                while (!eleccion.equals("P") && !eleccion.equals("C")) {
                    System.out.print("Opción no válida. Solo P o C: ");
                    eleccion = sc.nextLine().toUpperCase();
                }

                continuar = eleccion.equals("C");  // Si elige continuar, repite el turno
            }
        }
        return puntosTurno;  // Retorna los puntos obtenidos en este turno si el jugador se planta
    }

    // Turno de la máquina
    public static int turnoMaquina() {
        int puntosTurno = 0;
        // La máquina sigue lanzando hasta acumular al menos 10 puntos en su turno
        while (puntosTurno < 10) {
            int dado = lanzarDado();
            System.out.println("La máquina lanzó un " + dado);

            if (dado == 6) {  // Si la máquina saca un 6, pierde todos los puntos de este turno
                System.out.println("¡La máquina sacó un 6 y pierde los puntos de este turno!");
                return 0;
            }
            puntosTurno += dado;  // Suma la tirada a los puntos de este turno
        }
        System.out.println("La máquina se planta con " + puntosTurno + " puntos.");
        return puntosTurno;  // La máquina se planta y retorna sus puntos de este turno
    }

    // Método para lanzar el dado
    public static int lanzarDado() {
        return 1 + (int)(Math.random() * 6);  // Genera un número aleatorio entre 1 y 6
    }
}

