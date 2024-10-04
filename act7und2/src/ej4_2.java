import java.util.Scanner;

public class ej4_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas:");
        int ancho = scanner.nextInt();

        System.out.println("Introduce el número de columnas:");
        int largo = scanner.nextInt();

        for (int fila = 1; fila <= ancho ; fila++) {
            for (int columna = 1; columna <= largo; columna++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
