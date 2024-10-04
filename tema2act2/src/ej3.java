import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Qué sabor quieres?");
        int sabor = scan.nextInt();

        switch (sabor) {
            case 0:
                System.out.println("Vainilla");
                break;
            case 1:
                System.out.println("Chocolate");
                break;
            case 2:
                System.out.println("Fresa");
                break;
            default:
                System.out.println("Error");
        }
    }
}
