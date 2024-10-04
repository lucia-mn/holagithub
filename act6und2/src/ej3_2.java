import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        int billetes500 = 0;
        int billetes200 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;
        int monedas2 = 0;
        int monedas1 = 0;
        String salir;

        do {
            System.out.println("Introduce la cantidad de dinero:");
            cantidad = scanner.nextInt();
            if (cantidad > 0) {

                for (int i = cantidad; i >= 500; i -= 500) { //i(cantidad) -= 500 ==> (cantidad=cantidad - 500)
                    billetes500++;
                }
                System.out.println("tienes " + billetes500 + " billete(s) de 500");
                cantidad = (cantidad - billetes500 * 500);


                for (int i = cantidad; i >= 200; i -= 200) {
                    billetes200++;
                }
                System.out.println("tienes " + billetes200 + " billete(s) de 200");
                cantidad = (cantidad - billetes200 * 200);


                for (int i = cantidad; i >= 100; i -= 100) {
                    billetes100++;
                }
                System.out.println("tienes " + billetes100 + " billete(s) de 100");
                cantidad = (cantidad - billetes100 * 100);


                for (int i = cantidad; i >= 50; i -= 50) {
                    billetes50++;
                }
                System.out.println("tienes " + billetes50 + " billete(s) de 50");
                cantidad = (cantidad - billetes50 * 50);


                for (int i = cantidad; i >= 20; i -= 20) {
                    billetes20++;
                }
                System.out.println("tienes " + billetes20 + " billete(s) de 20");
                cantidad = (cantidad - billetes20 * 20);


                for (int i = cantidad; i >= 10; i -= 10) {
                    billetes10++;
                }
                System.out.println("tienes " + billetes10 + " billete(s) de 10");
                cantidad = (cantidad - billetes10 * 10);


                for (int i = cantidad; i >= 5; i -= 5) {
                    billetes5++;
                }
                System.out.println("tienes " + billetes5 + " billete(s) de 5");
                cantidad = (cantidad - billetes5 * 5);


                for (int i = cantidad; i >= 2; i -= 2) {
                    monedas2++;
                }
                System.out.println("tienes " + monedas2 + " moneda(s) de 2");
                cantidad = (cantidad - monedas2 * 2);


                for (int i = cantidad; i >= 1; i -= 1) {
                    monedas1++;
                }
                System.out.println("tienes " + monedas1 + " moneda(s) de 1");
                cantidad = (cantidad - monedas1 * 1);
            }

            else
                System.out.println("Error");

            System.out.println("¿Quieres salir? s/n");
            salir = scanner.next().toLowerCase();



        } while (salir.equals("n")); // while = mientras que no pongas n no vas a salir

    }
}
