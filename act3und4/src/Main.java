//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};


    }

    public static void reverse(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");


        }



    }
}




/*
(para el ej2)
1 SOLO RETURN POR FUNCIÓN (la última sentencia de la función)
LOS SOUTS van en el MAIN
NO UTILIZAR EL WHILE TRUE


CUANDO PASAS UN MÉTODO CON UN ARRAY AL MAIN:
si le pasas un entero le pasa el valor, pero con el arrray pasa una direccion de
memoria (punteros) que no varía, lo que varía es  el contenido del array

pasas el valor (parametro por valor)
pasas la referencia (memoria); paso por referencia


clase estática: no acepta constructor, siempre tiene el mismo valor, no acepta instancias
 */