package ej4act4und5;

public class Libro extends Bienes implements Imponible {

    public String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double calcularImpuestos() {
        return precio * tasaImpuestos;
    }
}
