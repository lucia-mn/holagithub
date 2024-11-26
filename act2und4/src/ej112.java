import java.util.Arrays;

public class ej112 {

    /*public static void main(String[] args) {

        int[] fuente = {4, 3, 2, 1};
        int[] destino = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(isArrayOn(fuente, destino));

    }

    public static boolean isArrayOn(int[] fuente, int[] destino) {

        Arrays.sort(fuente);
        Arrays.sort(destino);
        int contador = 0;

        for (int i = 0; i < fuente.length; i++) {

            for (int j = 0; j < destino.length; j++) {
                if (fuente[i] == destino[i])
                    contador++;
            }

            if (contador == fuente.length) {
                return true;
            }
        }
        return true;
    }

}*/ //ESTE CON CONTADORES NO FUNCIONA, HAY QUE HACER UNO CON BOOLEANOS


    public static void main(String[] args) {

        int[] fuente = {4, 3, 2, 1, 9};
        int[] destino = {1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.sort(fuente);
        Arrays.sort(destino);


        for (int i: fuente) {
            System.out.print(i + " ");
        }

        for (int i: destino) {
            System.out.print(i + " ");
        }

        System.out.println("contiene el array fuente al destino?: " + isArrayOn(fuente, destino));
    }

    public static boolean isArrayOn(int[] fuente, int[] destino) {

        Arrays.sort(fuente);
        Arrays.sort(destino);
        int contador = 0;

        for (int i = 0; i < fuente.length; i++) {

            for (int j = 0; j < destino.length; j++) {
                if (fuente[i] == destino[i])
                    contador++;
            }

            if (contador == fuente.length) {
                return true;
            }
        }
        return false;
    }
}



