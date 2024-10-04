import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("¿Qué sabor quieres?");
        String vainilla;
        String chocolate;
        String fresa;
        String sabores;


        switch (sabores) {
            case vainilla:
                System.out.println("Vainilla");
                break;
            case chocolate:
                System.out.println("Chocolate");
                break;
            case fresa:
                System.out.println("Fresa");
                break;
            default:
                System.out.println("Error");
        }
    }
    //las constantes van en mayúscula para diferenciarlas de las variables
    //las constantes tienen que ser enteras, no strings
    //ej 5: hacer el ejercicio del ajedrez sin if
}

