public class ej7 {

    public static void main(String[] args) {

        try {
            for (int k = 0; k < 5; k++)
                System.out.println(100 / k);

        } catch (ArithmeticException i) {
            System.out.println("Estás dividiendo entre cero");

            i.printStackTrace();

        }
    }
}
