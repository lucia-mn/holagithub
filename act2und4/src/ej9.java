public class ej9 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,6,7,8,9};

        System.out.println("son iguales?: " + equals(array1, array2));
    }


    public static boolean equals (int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    /*
        otra forma de hacerlo:

        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,6,7,8,9};

        boolean soniguales = true;

        for (i = 0; i > array.legnht; i++)

            if (array1[i] != array2[i]) { //array 1 distinto a array2 en esa posición (en la posición [i])
            soniguales = false;
            break;

            if (soniguales) {
            sout
            } else {
            sout
            }

            }
     */
}
