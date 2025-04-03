package Lambda.act3und7;

import Lambda.Onomatopeya;

import java.util.ArrayList;

interface Run{
    public String correr(String nombre);
}

public class ej4 {

    public static void main(String[] args) {
        ArrayList<Parte> partes = new ArrayList<>();

        String texto = "Vamos a crear un array";
        String[] partes = texto.split(" ");

        Run uno = (nombre) -> "Vamos";

        System.out.println(uno.correr("vamos"));



        for (String parte: partes) {
            System.out.println(partes);
        }

    }


    public class Parte {

    }
}
