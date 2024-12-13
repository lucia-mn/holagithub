import java.util.Scanner;

public class PruebaMainAjedrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la pieza (Torre (T), Alfil (A), Peón (P), Dama (D), Caballo (C), Rey (R)): ");
        char pieza = Character.toUpperCase(scan.next().charAt(0));
        System.out.println("Introduce el color (Blanco (0), Negro (1)): ");
        int tonalidad = scan.nextInt();
        boolean color;
        if(tonalidad==0){
            color = false;
        }
        else{
            color = true;
        }
        System.out.println("Introduce la posición inicial: ");

    }


    int opciones = 0;

    switch (opciones) {

        case 'T':
            System.out.println("Torre");
            break;
        case 'P':
            System.out.println("Peón");
            break;
        case 'A':
            System.out.println("Alfil");
            break;
        case 'D':
            System.out.println("Dama");
            break;
        case 'R':
            System.out.println("Rey");
            break;
        case 'C':
            System.out.println("Caballo");
            break;
        default:
            System.out.println("La pieza no existe");
            break;

    }



    public static void codificar(){

    }

}
