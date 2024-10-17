import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1 {

    public static int pedirnum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scan.nextInt();
        return num;
    }


    //1
    public static boolean esCapicua(int num) {
        boolean esCapicua;
        if (num == voltea(num))
        {
            esCapicua = true;
        } else {
            esCapicua = false;
        }

        return esCapicua;
    }


    //2
    public static boolean esPrimo(int num) {

        /*if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;*/

        boolean prim = false;
        int div = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
            if (div > 2) {
                break;
            }
        }
        if (div == 2) {
            prim = true;


        }
        return prim;

    }


    //3
    public static int siguientePrimo(int num) {
        num++;

        while (!esPrimo(num)) {
            num++;
        }

        return num;
    }


    //4
    public static double potencia(int num, int num2) {
        return Math.pow(num, num2);
    }


    //5
    public static int digitos(int num) {
        int x=0;

        while (num > 0) {
            x++;
            num = num / 10;
        }
        return x;
    }


    //6
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


    //7
    public static int digitoN(int num, int num2) {
        int cont = digitos(num);
        int res = 0;
        if (num2<cont) {
            int pot = cont - num2;
            res = num / (int)Math.pow(10, pot);
        }
        return res%10;
    }

    /*
    715678954, volteo: 459876571, divido entre 10 elevado a posicion menos 1
    queda: 459876 % 10; así sacas la posición
    la clave está en dejar el dígito que yo quiero al final para hacer el módulo (%) de 10

    otra manera: utilizar la funcion contar dígitos (int digitos)- int posicion
    10 elevado a (contar digitos - posicion), luego hacer el módulo de 10

    otra manera más: utilizar la funcion 9: quitar números por detrás y luego hacer el módulo de 10
    */


    /*
    public static int posicionDeDigito(int numero, int n) {
        String numStr = String.valueOf(numero);
        if (n >= 0 && n < numStr.length()) {
            return Character.getNumericValue(numStr.charAt(n));
        }
        return -1;
    }*/




    public static void main (String[]args){
        //Scanner sc = new Scanner(System.in);

        System.out.println("""
                    Selecciona una opción:
                    1. Comprobar si es capicúa
                    2. Comprobar si es primo
                    3. Encontrar el siguiente número primo
                    4. Calcular potencia
                    5. Contar dígitos
                    6. Voltear número
                    7. Devolver dígito en la posición n
                    8. Posición dígito
                    9. Quitar n dígitos por detrás
                    10. Quitar n dígitos por delante
                    11. Añadir n dígitos por detrás
                    12. Añadir n dígitos por delante
                    13. Devolver trozo de número
                    14. Juntar dos números
                    0. Salir
                    """);
        Scanner scan=new Scanner(System.in);

        System.out.println("Elige una opción:");
        int num = scan.nextInt();


        switch (num) {
            case 0:
                System.out.println("Fin del programa");
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

            case 7:
                int d;
                System.out.print("Introduce un número: ");
                num = scan.nextInt();
                System.out.print("Introduce la posición del dígito: ");
                d = scan.nextInt();
                System.out.println("Dígito en la posición " + d + ": " + digitoN(num, d));
                break;

            case 8:
                    /*int numero, digito;
                    System.out.print("Introduce un número: ");
                    numero = scan.nextInt();
                    System.out.print("Introduce el dígito que quieres buscar: ");
                    digito = scan.nextInt();
                    System.out.println("Posición del dígito " + digito + ": " + posicionDeDigito(numero, digito));
                    break;*/

            case 9:
                System.out.println("El número volteado es: ");
                break;

            case 10:
                System.out.println("El número volteado es: ");
                break;

            case 11:
                System.out.println("El número volteado es: ");
                break;

            case 12:
                System.out.println("El número volteado es: ");
                break;

            case 13:
                System.out.println("El número volteado es: ");
                break;

            case 14:
                System.out.println("El número volteado es: ");
                break;

            default:
                System.out.println("Introduce una opción válida");

        }

    }
}