package ej7act5und5;

import java.util.Arrays;

public class mainEstudiante {
    public static void main(String[] args) {

        Estudiante[] estudiantes = {
                new Estudiante("Lucía", 12, 170),
                new Estudiante("Andrea", 43, 173),
                new Estudiante("Antonio", 72, 189),
                new Estudiante("Reme", 52, 168),
                new Estudiante("Pepe", 35, 189)
        };

        Arrays.sort(estudiantes);

        System.out.println(" ");
        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}
