package lecturaEscrituraAjedrez;

import java.io.*;
import java.util.*;

public class Ajedrez {
    public static void main(String[] args) {

        File j = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ajedrez/jugadoresAjedrez.txt");
        File ja = new File("/home/lucmennah/IdeaProjects/lecturaEscritura/ajedrez/jugadoresAlojamiento.txt");

        try {
            Scanner entrada = new Scanner(j);
            List<String> jugadores = new ArrayList<>();

            while (entrada.hasNext()) {
                String jugador = entrada.nextLine();
                jugadores.add(jugador);
            }
            entrada.close();

            Collections.sort(jugadores);


            PrintWriter salida = new PrintWriter(new FileWriter(ja));
            for (String jugador : jugadores) {
                salida.println(jugador + " ");
            }

            salida.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
