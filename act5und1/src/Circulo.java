import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el radio: ");
        double rc = sc.nextInt();
        System.out.println("area circulo" + Math.pow(rc, 2) * Math.PI);
        System.out.println("perimetro circulo: " + 2 * Math.PI * rc);
    }
}
