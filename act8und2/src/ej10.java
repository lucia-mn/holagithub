import java.util.Scanner;

public class ej10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;

        System.out.println("Introduce un número:");
        m = scanner.nextInt();

        try {
            if (m < 0)
                throw new Exception(m + " debe ser mayor que cero");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " valor negativo en la coordenada " + m);
        }

    }
}
