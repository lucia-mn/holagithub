package ej4act5und5;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo> {

    protected double ancho;
    protected double alto;

    //constructor
    public Rectangulo(int numLados, double ancho, double alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    //getters
    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    //setters
    public void setAncho(double ancho) {
        this.ancho =ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //metodos
    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2*ancho + 2*alto;
    }

    //interfaz
    @Override
    public void redimensionar(int factor) {
        this.ancho *= factor;
        this.alto *= factor;
    }


    //compareTo
    @Override
    public int compareTo(Rectangulo otro) {
        return Double.compare(this.getArea(), otro.getArea());
    }

    //toString para ver los datos de los rectángulos


    @Override
    public String toString() {
        return "Rectangulo{" +
                "\nancho=" + ancho +
                ", \nalto=" + alto +
                '}';
    }
}