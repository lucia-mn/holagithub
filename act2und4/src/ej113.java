public class ej113 {


    public static void main(String[] args) {

        int[] array1 = {4, 3, 2, 1, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(isArrayOn(array1, array2));


    }

    public static boolean isArrayOn (int[] array1, int[] array2) {

        for (int i : array1) {
            boolean encontrado = false;

            for (int j : array2) {
                if (i == j) {
                    encontrado = true;
                    break;
                }

            } if (!encontrado) return false;
        }
        return true;
    }
}
