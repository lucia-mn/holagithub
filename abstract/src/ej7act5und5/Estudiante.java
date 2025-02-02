package ej7act5und5;

public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private int edad;
    private int altura;

    //constructor
    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }


    //compareTo
    @Override
    public int compareTo(Estudiante otro) {

        if (this.altura != otro.altura) {
            return Integer.compare(otro.altura, this.altura);
        }
        return Integer.compare(this.edad, otro.edad);
    }

    //toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "\nnombre='" + nombre + '\'' +
                ", \nedad=" + edad +
                ", \naltura=" + altura +
                '}';
    }
}
