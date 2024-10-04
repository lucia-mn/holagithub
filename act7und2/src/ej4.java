import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fila;
        int columna;

        System.out.println("Introduce el número de filas:");
        fila = scanner.nextInt();


        System.out.println("Introduce el número de columnas:");
        columna = scanner.nextInt();

        final int MAX_WIDTH = fila;
        //final int MAX_HEIGHT = columna;

        /*for (fila = 1; fila <= MAX_WIDTH ; fila++) {
            for (columna = MAX_WIDTH; columna >= fila; columna--) {
                System.out.print('#');
            }
            System.out.println();
        }*/

        for (fila = 1; fila <= MAX_WIDTH ; fila++) {
            for (columna = 1; columna <= (columna - fila); columna++) {
                System.out.print('#');
            }
            System.out.println();
        }


        /*for (fila = 1; fila <= 5 ; fila++) {
            for (columna = 1; columna <= (6 - fila); columna++) {
                System.out.print('#');
            }
            System.out.println();*/
        }

}
