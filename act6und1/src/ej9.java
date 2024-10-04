import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {

        final double TARTAS=4.5;
        double personas=2;
        double total=TARTAS/personas;
        System.out.println("tartas por persona: " +total);

        Scanner sc = new Scanner (System.in);

        /*System.out.println("n tartas: ");
        double =sc.nextDouble();
        System.out.println("tartas por persona" +total );*/


        Scanner sc = new Scanner (System.in);

        System.out.println("radio: ");
        double rc = sc.nextDouble();
        System.out.println("area circulo" + Math.pow(rc, 2) * Math.PI);
        //System.out.println("perimetro circulo: " + 2 * Math.PI * rc);

        System.out.println("perimetro: ");
        double pr = sc.nextDouble();
        System.out.println("lado: ");
    }
}
