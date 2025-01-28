package ejemplo.comparable;

import java.util.Arrays;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    // Constructor y otros métodos de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //metodos
    //obligatoriamente hay que ejecutar el compareTo!!!
    //el comparator es para texto, Strings
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparación basada en la edad
        return this.edad - otraPersona.edad;
    }




    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);

        if (persona1.compareTo(persona2) < 0) {
            System.out.println(persona1.getNombre() + " es menor que " + persona2.getNombre());

        } else if (persona1.compareTo(persona2) > 0) {
            System.out.println(persona1.getNombre() + " es mayor que " + persona2.getNombre());

        } else {
            System.out.println(persona1.getNombre() + " tiene la misma edad que " + persona2.getNombre());
        }



        Persona persona3 = new Persona("Carlos", 22);

        Persona[] personas = {persona1, persona2, persona3};
        System.out.println("\nArray de personas antes de ordenar por edad:");
        imprimirArray(personas);
        // Ordenar el array utilizando Arrays.sort()
        Arrays.sort(personas);

        System.out.println("\nArray de personas después de ordenar por edad:");
        imprimirArray(personas);
    }

    // Método para imprimir el array de personas
    private static void imprimirArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " - Edad: " + persona.getEdad());
        }
    }


    // tambien se puede hacer con ARRAYS LISTS

}
