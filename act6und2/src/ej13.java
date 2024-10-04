import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        char salir;

        do {

            System.out.print("Introduce una cantidad de dinero mayor que cero (sin decimales): ");
            cantidad = scanner.nextInt();


            int billetes500 = 0;
            for (int i = cantidad; i >= 500; i -= 500) {
                billetes500++;
            }
            System.out.println(billetes500 + " billete(s) de 500 euros");
            cantidad -= billetes500 * 500;


            int billetes200 = 0;
            for (int i = cantidad; i >= 200; i -= 200) {
                billetes200++;
            }
            System.out.println(billetes200 + " billete(s) de 200 euros");
            cantidad -= billetes200 * 200;


            int billetes100 = 0;
            for (int i = cantidad; i >= 100; i -= 100) {
                billetes100++;
            }
            System.out.println(billetes100 + " billete(s) de 100 euros");
            cantidad -= billetes100 * 100;



            int billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0;
            for (int i = cantidad; i >= 50; i -= 50) {
                billetes50++;
            }
            System.out.println(billetes50 + " billete(s) de 50 euros");
            cantidad -= billetes50 * 50;

            for (int i = cantidad; i >= 20; i -= 20) {
                billetes20++;
            }
            System.out.println(billetes20 + " billete(s) de 20 euros");
            cantidad -= billetes20 * 20;

            for (int i = cantidad; i >= 10; i -= 10) {
                billetes10++;
            }
            System.out.println(billetes10 + " billete(s) de 10 euros");
            cantidad -= billetes10 * 10;

            for (int i = cantidad; i >= 5; i -= 5) {
                billetes5++;
            }
            System.out.println(billetes5 + " billete(s) de 5 euros");
            cantidad -= billetes5 * 5;


            int monedas2 = 0, monedas1 = 0;
            for (int i = cantidad; i >= 2; i -= 2) {
                monedas2++;
            }
            System.out.println(monedas2 + " moneda(s) de 2 euros");
            cantidad -= monedas2 * 2;

            for (int i = cantidad; i >= 1; i -= 1) {
                monedas1++;
            }
            System.out.println(monedas1 + " moneda(s) de 1 euro");


            System.out.print("¿Deseas salir del programa? (s/n): ");
            salir = scanner.next().charAt(0);

        } while (salir != 's');

    }
}