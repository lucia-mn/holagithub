public class ej8al11 {

    //ej8
    char[] profesora = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};

    // el tamaño es de 8
    // la tercera posición tiene un valor de "t"


    //ej9
    char[] profesora2 = new char[]{'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};


    //ej10
    public class Main {
        public static void main(String[] args) {
            char[] profesora = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};

            System.out.println("Elementos del array en orden inverso:");
            for (int i = profesora.length - 1; i >= 0; i--) {
                System.out.print(profesora[i] + " ");
            }
        }
    }

    //ej11

    // data B = 23 + 12 + 0 + 23 + 0 + 0

    public static void main(String[] args) {
        int [] dataA = {12, 23, 45, 56};

        double [] dataB = new double[6];

        dataB [0] = dataA [2];
        dataB [3] = dataA [2];
        dataB [1] = dataA [1];
        dataB [5] = dataA [0];

        System.out.println(dataB [0] + dataB [1] + dataB [2] + dataB [3] + dataB [4] + dataB [5]);
    }
}

