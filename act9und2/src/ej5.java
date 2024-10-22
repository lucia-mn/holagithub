import java.util.Scanner;

public class ej5 {

    //decimal a binario

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int decimal = sc.nextInt();

        String resultado = Integer.toBinaryString(decimal);

        System.out.println("El número es: " + resultado);

    }
}
