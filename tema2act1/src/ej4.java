import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double i = 300;
        double precio = i;

        System.out.println("Precio:");
        precio = scan.nextDouble();

        if (precio >= i) {
            System.out.println("Artículo con impuestos:" +precio*0.05);
            System.out.println("Total:" +((0.05*precio) + precio));


        } else {
            System.out.println("Artículo sin impuestos. Total:" +precio);
        }
    }
}
