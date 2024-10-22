import java.util.Scanner;

public class ej4 {

    //binario a decimal

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        String binario = sc.nextLine();

        int resultado = Integer.parseInt(binario,2);
        System.out.println(resultado);

    }
}
