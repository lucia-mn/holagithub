import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = scan.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = scan.nextInt();
        System.out.println("Introduce el tercer número");
        int num3 = scan.nextInt();


        if (num1>num2&&num1>num3) {
            System.out.println("num1" +" Es el mayor");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2 +" Es el mayor");
        } else {
            System.out.println(num3 +" Es el mayor");
        }
    }
}
