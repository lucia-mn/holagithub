package ej4act4und5;

public class Juguete extends Bienes implements Imponible {

    //atributo
    public int edadMinima;

    //constructor
    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    //metodos
    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double calcularImpuestos() {
        return precio * tasaImpuestos;
    }
}
