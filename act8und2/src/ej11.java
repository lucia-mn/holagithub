import java.util.InputMismatchException;
import java.util.Scanner;

public class ej11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sel;

        try {

        do {

        System.out.println("""
                1 jugar
                2 bailar
                3 cantar
                0 salir
                """);

        sel = sc.nextInt();

        switch (sel){
            case 0:
                System.out.println("has seleccionado salir");
                break;

            case 1:
                System.out.println("has seleccionado jugar");
                break;

            case 2:
                System.out.println("has seleccionado bailar");
                break;

            case 3:
                System.out.println("has seleccionado cantar");
                break;

            default:
                System.out.println("introduce un número válido");

        }

        }

        while (sel != 0);

    } catch

        (InputMismatchException e){
            System.out.println("solo son válidos los números: " + e.getMessage());
        }

    }
}
