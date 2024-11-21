public class ej1al7 {

    // A falta de cualquier otra información, las celdas de un array se inicializan con el valor predeterminado para su tipo.
    // Cada celda de un array de tipo numérico se inicializa a cero.
    // Y cada celda de un array de referencias a objetos se inicializa en nulo (null).


    //ej1
    /*
    a) 10
    b) entero
    c) 103
    d) array [3]
    e)
    f) int[] notas = new int[9];
    notas[10] = 2;
    g) 52
    h) array[6]++ = 10
    i) array[6++] = 103
    j) array[0] = array[14] + 10 = saltaría una excepción
     */


    //ej2
    /*
    int[] data = new int[3];
    data[3]= 1;
    ¿longitus array? 3
    ¿índices? 0,1,2
    ¿qué sucede al ejercutar el código? saltaría una  excepción
     */


    //ej3
    /*
    son inocrrectas:
    scores [1.2]
    scores [25]
    scores [-1]
     */


    //CORREGIDO HASTA EL 3, A PARTIR DEL 4 NO ESTÁS CORREGIDOS!!!


    //ej4
    /*
    2, 54, 30, null, null
     */

    /*public static void main(String[] args) {
        int [] data = new int [5];
        data [0] = 2;
        data [1] = 54;
        data [2] = 5*6;

        System.out.println(data [0]); //2
        System.out.println(data [1]); //54
        System.out.println(data [2]); //30
        System.out.println(data [3]); //0
        System.out.println(data [4]); //0
    }*/


    //ej5
    /*
    0 | 1 | 2 | 3 | 4 | 5 | 6
    71  0   71  0   0  23  42

    0 | 1 | 2 | 3 | 4 | 5 | 6
    71  0   0   0   71  23  42
     */

    /*public static void main(String[] args) {
        int array [] = new int[7];
        int indice;

        array [6] = 42;

        indice = 0;
        array [indice] = 71;

        indice = 5;
        array [indice] = 23;

        indice = 3;
        array [2+2] = array [indice-3];
    }*/
    // array con nuevos valores: indice = 4;  |  array [indice+2] = array [indice-1];


    //ej6
    /*
    0   |  1  |  2  | 3
    0.21  4.31  9.28  0

    sout: 0
    sout: 9,28
    sout: 0 o null
     */


    //ej7
    public static void main(String[] args) {
        double [] array = new double [4];
        array [0] = 5.1;
        array [1] = 10.0;
        array [2] = 51.5;

        int j = 3;
        array [j] = array [j-1] + array [j-2];
        System.out.println("array j == " + array [j]);
    }
    //solución: array 2 (51.5) +  array 1 (10.0) = 61.5
}
