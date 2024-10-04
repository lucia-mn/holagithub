import java.util.Scanner;

public class ej9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double i;

        System.out.println("Introduzca un valor o -1 para salir: ");
        i = scanner.nextDouble();

        for ( ; i >= 0.0; ){
            System.out.println("La raíz cuadrada de " + i + " es " + Math.sqrt(i));

            System.out.println("Introduzca un valor o -1 para salir: ");
            i = scanner.nextDouble();
        }
    }
    /*
    a) No están incluidos dentro del bucle ni el inicializador ni el modificador
    b) Que al poner -1 no se saldría del bucle

    */
}
