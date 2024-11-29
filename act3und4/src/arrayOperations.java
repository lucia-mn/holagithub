import java.util.Arrays;

public class arrayOperations {

    public static void main(String[] args) {

        //a
        int[] array = {1, 2, 3, 4, 5};
        print(array);

        //b
        int[] array2 = {1, 2, 3, 4};
        reverse(array);

        //c
        int[] array3 = {1, 22, -5, 34, 7};
        System.out.println("Máximo array: " + max(array3));

        //d
        int[] array4 = {1, 22, -5, 34, 7};
        System.out.println("Mínimo array: " + min(array4));

        //e
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println("Suma del array: " + suma(array5));

        //f
        int[] array6 = {1,2,3,4,5,6,7,8,9};
        int[] array7 = {1,2,3,4,5,6,7,8,9};
        System.out.println("son iguales?: " + equals(array6, array7));

        //g
        int[] array8 = {1,2,3,4,6,5,8,7,9};
        int[] array9 = {2,3,4,6,5,7,9,8,1};

        Arrays.sort(array8);
        Arrays.sort(array9);

        for (int i: array8) {
            System.out.print(i + " ");
        }

        for (int i: array9) {
            System.out.print(i + " ");
        }

        System.out.print("son iguales?: " + iguales(array8, array9));

        //h
        int[] destino = {1, 2, 3, 20, -5, 7};
        int[] fuente = {3, 20};

        System.out.print(isArrayOn(destino, fuente));
        //ordenar los arrays con sort en el método
        //el array destino tiene qu eser menor o igual en longitud que el primero

        //i


    }



    //a
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
    }

    //b
    public static void reverse(int[] array2) {
        System.out.println("Array: " + Arrays.toString(array2));

        int n = array2.length;
        for (int i = 0; i < n / 2; i++) {

            int temp = array2[i];
            array2[i] = array2[n - 1 - i];
            array2[n - 1 - i] = temp;
        }

        System.out.println("Array revertido: " + Arrays.toString(array2));
    }

    //c
    public static int max(int[] array3) {
        int maximo = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > maximo) {
                maximo = array3[i];
            }
        }
        return maximo;
    }

    //d
    public static int min(int[] array4) {
        int minimo = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] < minimo) {
                minimo = array4[i];
            }
        }
        return minimo;
    }

    //e
    public static int suma(int[] array5) {
        int totalSuma = 0;
        for (int num : array5) {
            totalSuma += num;
        }
        return totalSuma;
    }

    //f
    public static boolean equals(int[] array6, int[] array7) {
        boolean verdadero = true;

        if (array6.length != array7.length) {
            verdadero = false;
        }

        for (int i = 0; i < array6.length; i++) {
            if (array6[i] != array7[i]) {
                verdadero = false;
            }
        }
        return verdadero;
    }

    //g
    public static boolean iguales (int[] array8, int[] array9) {
        boolean verOf = true;

        for (int i = 0; i < array8.length; i++) {
            if (array8[i] != array9[i]) {
                verOf = false;
            }
        }
        return verOf;
    }

    //h
    public static boolean isArrayOn (int[] destino, int[] fuente) {
        Arrays.sort(destino);
        Arrays.sort(fuente);

        for (int i: destino) {
            System.out.print(i + " ");
        }

        for (int i: fuente) {
            System.out.print(i + " ");
        }

        int contador = 0;
        boolean verde = false;

        for (int i = 0; i < fuente.length; i++) {

            for (int j = 0; j < destino.length; j++) {
                if (fuente[i] == destino[i])
                    contador++;
            }

            if (contador == fuente.length) {
                verde = true;
            }
        }
        return verde;

        /*for (int i : array10) {
            boolean encontrado = false;

            for (int j : array11) {
                if (i == j) {
                    encontrado = true;
                    break;
                }

            } if (!encontrado) return false;
        }
        return true;*/
    }

    //i

}

