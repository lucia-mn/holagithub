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
    /*@Override
    public int compareTo(Estudiante o) {

        if (this.altura != o.altura) {
            return Integer.compare(o.altura, this.altura);
        }
        return Integer.compare(this.edad, o.edad);
    }*/

    @Override
    public int compareTo(Estudiante o) {
        int resultado = 0;

        if (this.altura > o.altura) {
            resultado = -1;
        } else if (this.altura < o.altura) {
            resultado = 1;
        } else {
            if (this.edad < o.edad) {
                resultado = -1;
            } else if (this.edad > o.edad) {
                resultado = 1;
            } else {
                resultado = 0;
            }
        }

        return resultado;
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
