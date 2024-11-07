public class Main {
    public static void main(String[] args) {

        String s1 = "Andrea";
        String s2 = "Lucía";
        String s3 = "a";
        String s4 = "c";
        String s5 = "andrea";
        String s6 = "Hola Mundo";
        String s7 = "mundo";
        String caracter = "Mundo";
        String s8 = "hola";
        String cadena = "Hoy estamos a 13 grados";
        String s9 = "programacion";
        String s10 = "abbacec";
        String s11 = "abcdefghijklmnopqrst";
        int i = 5;


        //1
        System.out.println(caracter(s1, 0));
        //2
        System.out.println(codePoint(s1, 2));
        //3
        System.out.println(compararStrings(s1, s2));
        //5
        System.out.println(compararStringsLexicograficos(s3, s4));
        System.out.println(compararStringsLexicograficos(s4, s3));
        System.out.println(compararStringsLexicograficos(s1, s1));
        System.out.println(compararStringsLexicograficos(s1, s5));
        //7
        System.out.println(patron(s6, s7));
        //8
        System.out.println(empezarMismoTexto(s7, caracter));
        //9
        System.out.println(imprimirIndices(caracter));
        //10
        System.out.println(reemplazarCaracter(s3, s4, s6));
        //11
        System.out.println(eliminarCaracter(s8, 2));
        //12
        System.out.println(revertir(s6));
        //13
        System.out.println(devolverSubtexto(cadena, 0, 3));
        //14
        System.out.println(eliminarDuplicado(s9));
        //15
        System.out.println(caracterNoRepetido(s10));
        //16
        System.out.println(divisible(s11, 5));
    }

    //1
    /*String s1 = "Andrea";
    String s1 = new String("Andrea");

    int caracter = s1.indexOf("Andrea");
    */

    //1
    public static String caracter(String s1, int num) {
        if (num < 0 || num >= s1.length()) {
            return "Valor inválido";
        }
        return String.valueOf(s1.charAt(num));
        //System.out.println("El caractér de " + s1 + " en la posición " + num + " es "+ caracter(s1, 0));
    }

    //2
    public static String codePoint(String s1, int num2) {
        if (num2 <= 0 || num2 > s1.length()) {
            return "Valor inválido";
        }

        int codePoint = s1.codePointAt(num2 - 1);
        return "El code point " + num2 + " es: " + codePoint;
    }

    //3
    public static Boolean compararStrings(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            return true;

        } else {
            return false;
        }
    }

    //5
    public static String compararStringsLexicograficos(String s3, String s4) {
        int resultado = s3.compareToIgnoreCase(s4);

        if (resultado < 0) {
            return s3 + " es menor que " + s4;

        } else if (resultado > 0) {
            return s3 + " es mayor que " + s4;

        } else {
            return s3 + " es igual a " + s4;
        }
    }

    //7
    public static Boolean patron(String s6, String s7) {
        //if (s6.compareToIgnoreCase(contains(s7.compareToIgnoreCase())))
        if (s6.toLowerCase().contains(s7.toLowerCase())) {
            return true;

        } else {
            return false;
        }
    }

    //8
    public static Boolean empezarMismoTexto(String s6, String caracter) {
        if (s6.toLowerCase().startsWith(caracter.toLowerCase())) {
            return true;

        } else {
            return false;
        }
    }

    //9
    public static String imprimirIndices(String caracter) {
        for (int i = 0; i < caracter.length(); i++) {
            System.out.print(caracter.charAt(i) + " índice " + i + " ");
        }
        return caracter;
    }

    //10
    public static String reemplazarCaracter(String s3, String s4, String s6) {
        return s6.replace(s3, s4);
    }

    //11
    public static String eliminarCaracter(String s8, int posicion) {
        if (posicion < 0 || posicion >= s8.length()) {
            return "Valor inválido";
        }
        return s8.substring(0, posicion) + s8.substring(posicion + 1);
    }

    //12
    public static String revertir(String s6) {
        StringBuilder sb = new StringBuilder(s6);
        sb.reverse();
        return sb.toString();
    }

    //13
    public static String devolverSubtexto(String cadena, int posicion1, int posicion2) {
        if (posicion1 < 0 || posicion2 >= cadena.length()) {
            return "Valor inválido";
        }
        return cadena.substring(posicion1, posicion2);
    }

    //14
    /*public static String caracterRepetido(String s9, int posicion3) {
        if (posicion3 < 0 || posicion3 >= s9.length()) {
            return "Valor inválido";
        } else {
            return s9.indexOf(s9);
        }
    }*/

    //14
    public static String eliminarDuplicado(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);

            if (resultado.indexOf(String.valueOf(caracterActual)) == -1) {
                resultado.append(caracterActual);
            }
        }
        return resultado.toString();
    }

    //15
    public static String caracterNoRepetido(String s10) {
        StringBuilder resultado = new StringBuilder();
        for (int x = 0; x < s10.length(); x++) {
            char caracterActual = s10.charAt(x);

            if (resultado.indexOf(String.valueOf(caracterActual)) == -1) {
                resultado.append(caracterActual);
            }
        }
        return resultado.toString();
    }

    //16
    public static String divisible(String s11, int i) {
        StringBuilder resultado = new StringBuilder();
        for (i = 0; i < s11.length(); i++) {
            char caracterActual = s11.charAt(i);

            if (resultado.indexOf(String.valueOf(caracterActual)) == -1);
        }
        return resultado.toString();
    }
}

