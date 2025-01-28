package ejemplo.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Persona {

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
    /*@Override
    public int compare(ejemplo.comparable.Persona persona, ejemplo.comparable.Persona t1) {
        return 0;
    }*/




    public static void main(String[] args) {

        //creamos 3 objetos y lo smetemos en un array de personas
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Pepe", 25);
        personas[1] = new Persona("Maria", 30);
        personas[2] = new Persona("Fernan", 20);


        // Usando Comparator para ordenar por edad de forma ascendente, creamos una clase anónima
        //el comparator instancia el array con la clase predeterminada comparator

        Comparator<Persona> comparadorNombreAscendente = new Comparator<Persona>() {
            // con generate se generan los métodos como compare en el propio main!!!
            @Override
            public int compare(Persona per1, Persona per2) {
                //aprovechamos que String implementa Comparable
                return per1.getNombre().compareTo(per2.getNombre());
            }
        };

        //ordenamos por nombre
        Arrays.sort(personas, comparadorNombreAscendente);

        // Imprimiendo la lista ordenada ascendente
        for (Persona persona : personas) {
            System.out.println(persona.nombre + " - " + persona.edad);
        }
    }
}

//A. NO SE PUEDE INSTANCIAR, SOLO HAY CONSTANTES Y METODOS
//B. HERENCIA: HEREDAS LOS METODOS Y LOS ATRIBUTOS, EXTENDS
//INTERFAZ: NO PUEDES HEREDAR LA SVARIABLES DE INSTANCIA, NO HEREDAS LOS ATRIBUTOS, IMPLEMENTS
//C. NO DEBERIAN DE SER PRIVADAS PERO EN LA ULTIMA ACTUALIZACION DE JAVA SI QUE DEJAN
//D. NO, SOLO PUEDEN TENER UNA
//E. SI
//F. NO, YA QUE EN LA CLASE HAY QUE OVERRIDE Y NO DEBERIA DE DAR ERROR


//2.
/*public interface Interfaz {

    double methodB();
    public static final int aConstant = 32;
    public static final double pi = 3.14159;
    public void methodA (int x);

}*/

//3. public double y; esta mal, hay que ponerle el valor directamente: public double y = 32;
