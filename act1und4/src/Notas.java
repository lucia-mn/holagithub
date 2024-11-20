//EJERCICIO DE EJEMPLO

import java.util.Scanner;

/**
 * La clase Notas, lee las notas de n alumnos y devuelve la media
 */
public class Notas {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int totalAlumnos;
        System.out.println("Introduzca en número de alumnos");
        //tamaño de array
        totalAlumnos=sc.nextInt();
        //El método nos devuelve un array con las notas de los alumnos
        int[] notas1DAM_FOL = leerNotas(totalAlumnos);

        //imprimimos los valores
        for (int i = 0; i < notas1DAM_FOL.length; i++) {
            System.out.println("La nota del alumno " + i + ": " + notas1DAM_FOL[i]);
        }
        System.out.println("La media de los alumnos de FOL es: " + calcularMedia(notas1DAM_FOL));
    }

    /**
     * Recibe el total de alumnos y deuuelve un array con las notas de los
     * alumnos
     * @param totalAlumnos: total de los alumnos
     * @return array de tamaño totalAlumnos con las notas de los alumnos
     */
    public static int[] leerNotas(int totalAlumnos) {
        //creamos el array
        int[] notas = new int[totalAlumnos];
        //leemos las valores
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduzca la Nota del alumno  " + i + ": ");
            notas[i] = sc.nextInt();
        }
        return notas;
    }

    /**
     * Recibe un array de entereos y calcula su media y la devuelve
     * @param notas: array de enteros con la notas
     * @return: media de las notas de los alumnos
     */
    public static double calcularMedia(int[] notas) {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return (double) suma / (double) notas.length;
    }
}

/*
int[] array =  {2, 19, 1, 5, 1, 27, 9, 5};
    int suma = 0;
    for (int numero : array) {
            suma += numero;    suma = suma + número
    }
 */