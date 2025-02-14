package intermodularColeccionDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static java.awt.AWTEventMulticaster.add;

//lucia mendiola naharro

public class ArraydeResena {

    private static Scanner scanner = new Scanner(System.in);
    //Resena resena =new Resena("ABC123", 123456, 8, "casco de juguete infantil unisex", "2023-12-04", 1234);
    //Resena resena2 =new Resena("ABC122", 123455, 7, "casita de juguete infantil unisex", "2023-12-03", 1233);

    public static void main(String[] args) {

        ArrayList<Resena> resenas = new ArrayList<>();

        resenas.add(new Resena("ABC123", 123456, 8, "casco de juguete infantil unisex", "2023-12-04", 1234));
        resenas.add(new Resena("ABC122", 123455, 7, "casita de juguete infantil unisex", "2023-12-03", 1233));


        LinkedList<String> resenas = new LinkedList<>();
        resenas.add(1, "resena");
        resenas.add(2, "resena");
        resenas.add(3, "resena");
        resenas.add(4, "resena");
        resenas.add(5, "resena");

    }



    //metodos
    public boolean addNewResena(Resena resena) {
        if (findResena(resena.getIdResena(), resena.getIdProducto()) == null) {
            resenas.add(resena);
            return true;
        }
        return false;
    }

}
