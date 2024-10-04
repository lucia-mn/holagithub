import java.util.Scanner;

public class ej7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Número");
        int num = scan.nextInt();

        do {
            System.out.println(num);
            num--;
        } while (num > 0);
    }
}
