public class ej5 {

    public static void main(String[] args) {

        int fila;
        int columna;


        /*for (fila = 1; fila <= 6 ; fila++) {
            for (columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        for (fila = 1; fila <= 6 ; fila++) {
            for (columna = 1; columna <= fila; columna++) {
                System.out.print("*");
                if (fila >= 4)
                    break;
            }
            System.out.println();
        }

    }
}
