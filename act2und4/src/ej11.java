import java.util.Arrays;

public class ej11 {

    public static void main(String[] args) {

        int[] src = {4, 3, 2, 1};
        int[] dst = {1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.sort(src);
        Arrays.sort(dst);


        try {

        for (int i: src) {
            System.out.print(i + " ");
        }

        for (int i: dst) {
            System.out.print(i + " ");
        }

        System.out.println("contiene el array fuente al destino?: " + isArrayOn(src, dst));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("no sirve");
        }
    }

    public static boolean isArrayOn(int[] src, int[] dst) {

        Arrays.sort(src);
        Arrays.sort(dst);

        for (int i = 0; i < dst.length; i++) {
            if (dst[i] != src[i]) {
                return false;
            }
        }
        return true;
    }

}
