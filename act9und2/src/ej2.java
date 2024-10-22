public class ej2 {

    public static void main(String[] args) {

        int cont = 0;
        int num = 2;

        for (; num < 1000; num++){
            int div = 0;

            for (int i = 1; i <= num; i++){
                if (num % i == 0) {
                    div++;
                }
                if (div > 2) {
                    break;
                }
            }

            if (div == 2) {
                System.out.println(num);
                cont ++;
            }
        }

    }
}
