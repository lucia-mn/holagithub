public class ej8 {

    public static void main(String[] args) {
        double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42 };

        double sumatorio = 0;
        //int media = (double[] array / 2);

        for (double i : array) {
            sumatorio = sumatorio + i;
        }

        double promedio = (sumatorio/array.length);
        System.out.print("El promedio es: " + promedio);
    }
}
