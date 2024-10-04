import java.util.Scanner;

public class if2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String respuesta;
            System.out.print("¿Está lloviendo? (Y or N): ");
            respuesta = scan.nextLine();

            if (respuesta.equals("Y")) {
                System.out.println("Activa limpiaparabrisas");
            } else {
                System.out.println("Desactiva limpiaparabrisas");
            }
        }
}