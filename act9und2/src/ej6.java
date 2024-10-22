import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;


        System.out.println("""
                Opciones:
                1. De decimal a binario
                2. De decimal a hexadecimal
                3. De decimal a octal
                4. De binario a decimal
                5. De binario a hexadecimal
                6. De binario a octal
                7. De hexadecimal a decimal
                8. De hexadecimal a binario
                9. De hexadecimal a octal
                10. De octal a decimal
                11. De octal a binario
                12. De octal a hexadecimal
                0. Salir
                """);


        do{
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();


        switch (opcion) {
            case 0:
                System.out.println("Fin del programa");
                break;

            case 1:
                System.out.println("Introduce un número decimal: ");
                int num = sc.nextInt();

                String resultado1 = Integer.toBinaryString(num);

                System.out.println("El número " + num + " de decimal a binario es: " + resultado1);
                break;

            case 2:
                System.out.println("Introduce un número decimal: ");
                int num2 = sc.nextInt();

                String resultado2 = Integer.toHexString(num2);

                System.out.println("El número " + num2 + " de decimal a hexadecimal es: " + resultado2);
                break;

            case 3:
                System.out.println("Introduce un número decimal: ");
                int num3 = sc.nextInt();

                String resultado3 = Integer.toOctalString(num3);

                System.out.println("El número " + num3 + " de decimal a octal es: " + resultado3);
                break;

            case 4:
                System.out.println("Introduce un número binario: ");
                String binario = sc.nextLine();

                int resultado4 = Integer.parseInt(binario,2);

                System.out.println("El número " + binario + " de binario a decimal es: " + resultado4);
                break;

            case 5:
                System.out.println("Introduce un número binario: ");
                String binario = sc.nextLine();
                System.out.println("El número " + binario + " de binario a decimal es: " + resultado4);
                break;

            default:
                System.out.println("Introduce una opción válida");

        }
        } while (opcion != 0);

    }
}
