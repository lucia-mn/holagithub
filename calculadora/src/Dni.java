import java.util.Scanner;

public class Dni {

    public static boolean validarDni(String dni) {
        if (dni.length() != 8) {
            return false;
        }

        for (int i = 0; i < dni.length(); i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static String calculoLetra(String numeroDni) {
        int numero = Integer.parseInt(numeroDni);
        int resto = numero % 23;

        String letra;
        switch (resto) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
            default:
                letra = "";
                break;
        }
        return letra;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dni;

        do {
            System.out.print("Introduce tu DNI: ");
            dni = scanner.nextLine();

            if (validarDni(dni)) {
                String letra = calculoLetra(dni);
                System.out.println("La letra es: " + letra);

            } else {
                System.out.println("DNI inválido. Vuelve a intentarlo.");
            }
        } while (!validarDni(dni)); //mientras que el dni no es válido e bucle se repite

    }
}
