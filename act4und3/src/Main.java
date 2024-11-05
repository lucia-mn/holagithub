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



    }
    /*
    //String s1 = "Andrea";
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


}

