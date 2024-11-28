import java.util.Arrays;

public class arrayOperations {

    public static void main(String[] args) {

        //1
        int[] array = {1, 2, 3, 4, 5};
        print(array);

        //2
        int[] array2 = {1, 2, 3, 4};
        reverse(array);

        //3
        int[] array3 = {1, 22, -5, 34, 7};
        System.out.println("Máximo del array: " + max(array3));

        //4
        int[] array4 = {1, 22, -5, 34, 7};
        System.out.println("Mínimo del array: " + min(array4));

        //5
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println("Suma del array: " + suma(array5));


    }


    //1
    public static void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        System.out.println(result);
    }

    //2
    public static void reverse(int[] array2) {
        System.out.println("Array original: " + Arrays.toString(array2));

        int n = array2.length;
        for (int i = 0; i < n / 2; i++) {

            int temp = array2[i];
            array2[i] = array2[n - 1 - i];
            array2[n - 1 - i] = temp;
        }

        System.out.println("Array revertido: " + Arrays.toString(array2));
    }

    //3
    public static int max(int[] array3) {

        int maximo = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > maximo) {
                maximo = array3[i];
            }
        }
        return maximo;
    }

    //4
    public static int min(int[] array4) {

        int minimo = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] < minimo) {
                minimo = array4[i];
            }
        }
        return minimo;
    }

    //5
    public static int suma(int[] array5) {

        int totalSuma = 0;
        for (int num : array5) {
            totalSuma += num;
        }
        return totalSuma;
    }



}
