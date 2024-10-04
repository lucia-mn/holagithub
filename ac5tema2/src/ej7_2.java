import java.util.Scanner;

public class ej7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int limite;
        int contador = 2;
        int fin = 0;


        do {
            System.out.println("Introduce el primer número");
            numero1 = scanner.nextInt();

            System.out.println("Introduce el segundo número");
            numero2 = scanner.nextInt();

            System.out.println("Introduce un límite");
            limite = scanner.nextInt();


            if (numero1 <= 0 || numero2 <= numero1 || limite <= 2 || limite >= 30) {
                System.out.println("Datos incorrectos, vuelve a introducirlos");
            }

            if (numero1 > numero2) {
                System.out.println("el primer número debe ser menor que el segundo");
            } else if (numero1 <= 0) {
                System.out.println("el número debe de ser superior a cero");
            }

            if (limite < 2) {
                System.out.println("el límite debe ser superior a 2");

            } else if (limite > 30) {
                System.out.println("el límite no puede ser superior a 30");

            }


            if ((numero1 > 0) && (numero2 > numero1) && (limite >= 2 && limite <= 30))
            {
                System.out.print(numero1 + " ");
                System.out.print(numero2 + " ");
                do {

                    int suma = numero1 + numero2;
                    numero1 = numero2;
                    numero2 = suma;
                    System.out.print(suma + " ");

                    contador++;
                    fin++;
                }

                while (contador<limite);

            }

        }
        while (fin == 0);
    }
}

//System.out.println();
//numero2 = scanner.nextInt(suma);

//suma = numero1 + numero2;
//numero2 = suma;
//numero1 = numero2;



