/*import java.util.Scanner;

public class ej1 {

    public static int pedirnum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scan.nextInt();
        return num;
    }


    //1
    public static boolean esCapicua(int num) { //nos devuelve un booleano cuando llamamos a esCapicua
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
        boolean primo = false;
        int div = 0; //contador

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
            if (div > 2) {
                break;
            }
        }
        if (div == 2) {
            primo = true;
        }
        return primo;
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
        int x=0; //contador

        while (num > 0) {
            //divides el número entre 10 y le sumas al contador hasta que el número sea menor a cero
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
        int resultado = 0;

        if (num2<cont) {
            int pot = cont - num2;
            resultado = num / (int)Math.pow(10, pot);
        }
        return resultado % 10;
    }

    /*
    715678954, volteo: 459876571, divido entre 10 elevado a posicion menos 1
    queda: 459876 % 10; así sacas la posición
    la clave está en dejar el dígito que yo quiero al final para hacer el módulo (%) de 10

    otra manera: utilizar la funcion contar dígitos (int digitos)- int posicion
    10 elevado a (contar digitos - posicion), luego hacer el módulo de 10

    otra manera más: utilizar la funcion 9: quitar números por detrás y luego hacer el módulo de 10
    */


    //8
    /*public static int posicionDigito(int num, int di) {
        int posicion = 1;

        if (num < 0) {
            num = Math.abs(num);
        }
        while (num > 0) {
            int digitoActual = num % 10;
            if (digitoActual == di) {
                return posicion;
            }
            num /= 10;
            posicion++;
        }
        return -1;
    }


    //9
    public static int quitaPorDetras(int num, int di) {
        for (int i = 0; i < di; i++) {
            num /= 10;

        }
        return num;
    }


    //10
    public static int quitaPorDelante(int num, int di) {
        num = voltea(num);

        for (int i = 0; i < di; i++) {
            num /= 10;
        }
        return voltea(num);
    }


    //11
    public static int pegaPorDetras(int num, int di) {
        return num * 10 + di;
    }


    //12
    public static int pegaPorDelante(int num, int di) {
        num = voltea(num);
        num = num * 10 + di;
        return voltea(num);
    }


    //13
    public static int trozoDeNumero(int num, int inicio, int fin) {

        inicio = quitaPorDelante(num);
        fin = quitaPorDetras(num);

        int trozonum = num - (inicio, fin)
        return trozonum;

        public static int trozoDeNumero(int num, int inicio, int fin) {

            num = quitaPorDelante(num, inicio);

            num = quitaPorDetras(num, fin);

            return num;
        }


        return quitaPorDetras(quitaPorDelante(num, inicio), digitos(num) - fin - 1);
    }


    trozo (num, 3, 6)
    5134783 sería igual a 3478 una vez pasado por la funcion;

    numero = digitoN (num, 3)

    3*10 elevado a 0
    3*10 el 1 + 4
    3*10 el 2 + 4*10 el 1 + 7
    3*10 el 3 + 4*10 el 2 + 7*10 el 1 + 8
     */


    //14
    /*public static int juntaNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }*/






    /*public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num;

        do {

            System.out.println("""
                    Opciones:
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
                    11. Añadir un dígito por detrás
                    12. Añadir un dígito por delante
                    13. Devolver trozo de número
                    14. Juntar dos números
                    0. Salir
                    """);


            System.out.println("Elige una opción:");
            num = sc.nextInt();

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
                    num = sc.nextInt();
                    System.out.print("Introduce la posición del dígito: ");
                    d = sc.nextInt();
                    System.out.println("Dígito en la posición " + d + ": " +digitoN(num, d));
                    break;

                case 8:
                    int di;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce la posición del dígito que quieres buscar: ");
                    di = sc.nextInt();
                    System.out.println("Posición del dígito " +di + ": " +posicionDigito(num, di));
                    break;

                case 9:
                    int dig;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número de dígitos que quieres quitar: ");
                    dig = sc.nextInt();
                    System.out.println("El número sin " +dig + " dígitos es: " +quitaPorDetras(num,dig));
                    break;

                case 10:
                    int digi;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número de dígitos que quieres quitar: ");
                    digi = sc.nextInt();
                    System.out.println("El número sin " +digi + " dígitos es: " +quitaPorDelante(num,digi));
                    break;

                case 11:
                    int digit;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número que quieres pegar por detrás: ");
                    digit = sc.nextInt();
                    System.out.println("El número más " +digit + " pegado por detrás es: " +pegaPorDetras(num,digit));
                    break;

                case 12:
                    int digito;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número que quieres pegar por delante: ");
                    digito = sc.nextInt();
                    System.out.println("El número " +num + " más " +digito + " pegado por delante es: " +pegaPorDelante(num,digito));
                    break;

                case 13:
                    int a = pedirnum();
                    System.out.println("Introduce la primera posición:");
                    int b = sc.nextInt();
                    System.out.println("Introduce la segunda posición:");
                    int c = sc.nextInt();
                    System.out.println("El número es: " + trozoDeNumero(a, b, c));
                    break;

                case 14:
                    int digitos;
                    System.out.print("Introduce un número: ");
                    num = sc.nextInt();
                    System.out.print("Introduce el número que quieres pegar por detrás: ");
                    digitos = sc.nextInt();
                    System.out.println("El número combinado es: " + juntaNumeros(num, digitos));
                    break;

                default:
                    System.out.println("Introduce una opción válida");

            }

        } while (num != 0);

    }
}*/