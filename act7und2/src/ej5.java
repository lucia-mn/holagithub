import java.util.Scanner;

public class ej5 {

    public static void main(String[] args) {

        int fila;
        int columna;

        //a
        for (fila = 1; fila <= 6; fila++) {
            for (columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //b
        for (fila = 1; fila <= 6; fila++) {
            System.out.println("*");
            for (columna = 1; columna <= fila; columna++) {
                System.out.print(" ");
            }
        }

        //c
        for (int i = 0; i <= 5; i++) {
            //System.out.println(+ a);
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        //d
        for (fila = 1; fila <= 6; fila++) {
            System.out.print("*");
            for (columna = fila; columna >= fila; columna--) {
                System.out.print("#");

            }
            System.out.println();

        }

    }
}

