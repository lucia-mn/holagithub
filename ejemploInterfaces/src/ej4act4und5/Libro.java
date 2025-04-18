package ej4act4und5;

public class Libro extends Bienes implements Imponible {

    //atributo
    protected String autor;

    //constructor
    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    //metodo
    @Override
    public String toString() {
        return "Libro{" +
                "\nautor='" + autor + '\'' +
                ", \ndescripcion='" + descripcion + '\'' +
                ", \nprecio=" + precio +
                ", \ntasaImpuestos=" + calcularImpuestos();
    }

    @Override
    public double calcularImpuestos() {
        return tasaImpuestos * precio;
    }

    public String getAutor() {
        return autor;
    }
}
