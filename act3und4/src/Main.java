import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*public static void main(String[] args) {
        int[] array1 = {1,2,3,4};


    }

    public static void reverse(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");


        }



    }*/

    public static void reverse(int[] array) {
        System.out.println("Array original: " + Arrays.toString(array));

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {

            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Array revertido: " + Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        reverse(array);
    }
}

//APARTADO H, EJ2, ACTIVIDAD 3

/*for (int i: destino) {
            System.out.print(i + " ");
        }

        for (int i: fuente) {
            System.out.print(i + " ");
        }

        int contador = 0;
        boolean verde = false;

        for (int i = 0; i < fuente.length; i++) {

            for (int j = 0; j < destino.length; j++) {
                if (fuente[i] == destino[i])
                    contador++;
            }

            if (contador == fuente.length) {
                verde = true;
            }
        }
        return verde;*/






/*
(para el ej2)
1 SOLO RETURN POR FUNCIÓN (la última sentencia de la función)
LOS SOUTS van en el MAIN
NO UTILIZAR EL WHILE TRUE
INTENTAR EVITAR LOS BREAKS EN EL FOR, SOLO LOS NECESARIOS
PROBAR CASOS (método isArrayOn)


CUANDO PASAS UN MÉTODO CON UN ARRAY AL MAIN:
si le pasas un entero le pasa el valor, pero con el arrray pasa una direccion de
memoria (punteros) que no varía, lo que varía es  el contenido del array

pasas el valor (parametro por valor)
pasas la referencia (memoria); paso por referencia


clase estática: no acepta constructor, siempre tiene el mismo valor, no acepta instancias
 */