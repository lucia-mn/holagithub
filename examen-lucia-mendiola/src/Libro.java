//lucia mendiola naharro

public class Libro extends Artículo {

    protected int isbn;
    protected int numpag;
    protected String autor;

    public Libro(int numref, String titulo, double precio, int isbn, int numpag, String autor) {
        super(numref, titulo, precio);
        this.isbn = isbn;
        this.numpag = numpag;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", numpag=" + numpag +
                ", autor='" + autor + '\'' +
                ", numref=" + numref +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }

    //validaciones
    public static boolean esNumeroEntero(String entrada) {
        return entrada.matches("\\d+");
    }

    public static boolean empiezaConLetra(String entrada) {
        return entrada.matches("^[A-Za-z].*");
    }

}
