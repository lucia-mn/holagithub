package generico;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {

    public static void main(String[] args) {

    List<String> lista = new ArrayList<String>();
    lista.add("Hola mundo");

    String cadena = lista.get(0);
    System.out.println(cadena);


    Box<Integer> integerBox1 = new Box<Integer>();
        Box<Integer> integerBox2 = new Box<>();
        integerBox2.set(4);
        integerBox1.set(6);

        int suma = integerBox1.get()+integerBox2.get();

        Box<String> textoBox = new Box<>();
        textoBox.set("Hola mundo");
        // System.out.println(textoBox); MAL
        System.out.println(textoBox.get()); // BIEN

    }
}
