//lucia mendiola naharro

import java.util.ArrayList;

public class Escritor {

    protected String nombre;
    protected ArrayList<Libro> libros;

    public Escritor(String nombre, ArrayList<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }

}
