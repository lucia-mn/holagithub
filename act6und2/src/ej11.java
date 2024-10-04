public class ej11 {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int j = 0; j < 8; j=j+2)
            sumEven = sumEven + j;

        System.out.println(sumEven);

        int j = 0;

        for (j = 1; j < 8; j=j+2)
            sumOdd = sumOdd + j;

        System.out.println(sumOdd);
    }
}
