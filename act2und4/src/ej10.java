import java.util.Arrays;

public class ej10 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,6,5,8,7,9};
        int[] array2 = {2,3,4,6,5,7,9,8,1};

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i: array1) {
            System.out.print(i + " ");
        }

        for (int i: array2) {
            System.out.print(i + " ");
        }


        //forma de hacerlo con el if
        boolean soniguales = true;

        for (int i = 0; i > array1.length; i++) {

            if (array1[i] != array2[i]) { //array 1 distinto a array2 en esa posición (en la posición [i])
                soniguales = false;
                break;
            }
        }

        //impirmir con el if
        if (soniguales) {
            System.out.println("iguales");

        } else {
            System.out.println("no son iguales");
        }


        //imprimir con el método
        System.out.println("son iguales?: " + iguales(array1, array2));
    }


    //forma de hacerlo con el método
    public static boolean iguales (int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

}
