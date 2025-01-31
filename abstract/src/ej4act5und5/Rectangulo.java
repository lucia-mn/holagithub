package ej4act5und5;

public class Rectangulo extends Forma{

    protected double ancho;
    protected double alto;

    //constructor
    public Rectangulo(int numLados, double ancho, double alto) {
        super(numLados);
        this.ancho = ancho;
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

}