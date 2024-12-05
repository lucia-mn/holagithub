public class Main {
    public static void main(String[] args) {

        //ej1 con un array de objetos

        //ej2
        int[] Cadena;

        Cadena[] cadenas = new Cadena[10];
        cadenas[1] = new Cadena(1, "Programación");

        //ej3 no tienen que tener la misma longitud los Strings

        //ej4

        /*ej5 array de Steings con 5 tamaños:
         ¿Con qué valor crees que se inicializarán cada una de las celdas del array?
         Recuerda que cuando hacíamos int[]array = new array[5];
         (Por defecto se inicializaban con valor 0).

        celda 1 se inicializará con el valor 0
        celda 2 con el valor 1
        celda 3 con el valor 2, etc.
        */


        //ej6 aparece un nullPointerException
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("El string " + array[i] + " tiene una longitus de " + array[i].length()
             + " caracteres.");
        }


    }

    //ej2
    public class Cadena {
        private int id;
        private String texto;

        public Cadena(int id, String texto) {
            this.id = id;
            this.texto = texto;
        }
    }
}