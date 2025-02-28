//lucia mendiola naharro

public class Artículo {

    protected int numref;
    protected String titulo;
    protected double precio;

    public Artículo(int numref, String titulo, double precio) {
        this.numref = numref;
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getNumref() {
        return numref;
    }

    public void setNumref(int numref) {
        this.numref = numref;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Artículo{" +
                "numref=" + numref +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }

}
