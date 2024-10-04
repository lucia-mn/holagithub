public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println(1/2 + 1/2); //porque es 0 + 0
        System.out.println(0.5 + 0.5); //las dos expresiones hay que cambiarlas a double

        System.out.println(-9/10);

        System.out.println(9/10);
        // devuelve cero porque estás utilizando números enteros

        System.out.println((35 + 0.0) / 7); //devuelve un double

        System.out.println((3/4 + 6.7)/3.0); //primero se hace la división de
        //la suma que da 0 y luego se suma al decimal y por último se divide entre 3.0



        int entero = 10;
        double decimal = 20.0;
        //(decimal / entero - 2) / 4;   resultado final 0.0 (double)
    }
}