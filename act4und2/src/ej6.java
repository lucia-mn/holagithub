import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número");
        int num = scan.nextInt();
        int m = 1;

        do {
            System.out.println(num*m);
            m++;
        } while (m <= 10);
    }
}
