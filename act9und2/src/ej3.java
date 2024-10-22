public class ej3 {

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

    public static void main(String[] args) {
        int num = 10;

        for (; num < 99999; num++) {
            int volteado = voltea(num);

            if (num == volteado)
                System.out.println("El número es " + num);
        }

    }
}
