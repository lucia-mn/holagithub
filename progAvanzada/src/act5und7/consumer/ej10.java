package act5und7.consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class ej10 {

    public static void main(String[] args) {

        BiConsumer<Integer, String> bimap = (n, s) -> System.out.println(n + " " + s);
        bimap.accept(10, "diez");

        HashMap<Integer, String > mapa = new HashMap<>();
        mapa.put(5, "cinco");
        mapa.put(6, "seis");
        mapa.put(7, "siete");
        //mapa.forEach() -> System.out.println("Clave: " + num + "Valor: " + nombre);
    }
}
