import java.util.Scanner;

public class tema2act1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean respuesta;
        System.out.print("¿Eres el propietario de la máquina?: ");
        respuesta = scan.nextBoolean();

        if (respuesta) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Error");
        }
    }
}
