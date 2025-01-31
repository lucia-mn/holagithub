package ej4act4und5;

public class Juguete extends Bienes implements Imponible {

    //atributo
    protected int edadMinima;

    //constructor
    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    //metodo
    @Override
    public String toString() {
        return "Juguete{" +
                "\nedadMinima=" + edadMinima +
                ", \ndescripcion='" + descripcion + '\'' +
                ", \nprecio=" + precio +
                ", \ntasaImpuestos=" + calcularImpuestos();
    }

    @Override
    public double calcularImpuestos() {
        return tasaImpuestos * precio;
    }
}
