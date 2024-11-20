public class ej8al10 {

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

}

