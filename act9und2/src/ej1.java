import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1 {

    public static int pedirnum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scan.nextInt();
        return num;
    }

    public static boolean esCapicua(int num) {
        boolean esCapicua;
        if(num == voltea(num))
        {
            esCapicua = true;
        } else {
            esCapicua = false;
        }

        return esCapicua;
    }



    public static boolean esPrimo(int num) {
        boolean esPrimo;

        if (num >= 2 && num/num == 1) {

            esPrimo = true;
        } else {
            esPrimo = false;
        }

        return esPrimo;

    }



    public static int siguientePrimo(int num) {
        num++;

        do {
            if (!esPrimo(num)) {
                num++;
            }
        } while
    }




        return num;

    }




    public static double potencia(int num, int num2) {
      return Math.pow(num, num2);
    }



    public static int digitos(int num) {
        int x=0;

        while (num > 0) {
            x++;
            num = num / 10;
        }
        return x;
    }



    public static int voltea(int num) { //nos devuelve un entero cuando llamamos a voltea
        int volteado = 0;
        int digito;

        while (num > 0) {
            digito = num % 10;
            num = num / 10;
            volteado = volteado * 10 + digito;

        }
        return volteado;
    }



        public static void main (String[]args){
            //Scanner sc = new Scanner(System.in);

            System.out.println("""
                    ("Selecciona una opción:");
                    System.out.println("1. Comprobar si es capicúa");
                    System.out.println("2. Comprobar si es primo");
                    System.out.println("3. Encontrar el siguiente número primo");
                    System.out.println("4. Calcular potencia");
                    System.out.println("5. Contar dígitos");
                    System.out.println("6. Voltear número");
                    """);
            Scanner scan=new Scanner(System.in);

            System.out.println("Elige una opción:");
            int num = scan.nextInt();


            switch (num) {
                case 0:
                    System.out.println("");
                    break;

                case 1:
                    System.out.println("Comprobar si es capicúa: "+esCapicua(pedirnum()));
                    break;

                case 2:
                    System.out.println("Comprobar si es primo: "+esPrimo(pedirnum()));
                    break;

                case 3:
                    System.out.println("El siguiente primo es: "+siguientePrimo(pedirnum()));
                    break;

                case 4:
                    System.out.println("Calcular potencia, introdce el primer número (base) y el segundo (exponente)");
                    int x = pedirnum();
                    int y = pedirnum();
                    System.out.println("La potencia es: "+potencia(x,y));
                    break;

                case 5:
                    System.out.println("Contar dígitos: "+digitos(pedirnum()));
                    break;

                case 6:
                    System.out.println("El número volteado es: "+voltea(pedirnum()));
                    break;

                default:
                    System.out.println("Introduce un número válido");

            }

        }
}