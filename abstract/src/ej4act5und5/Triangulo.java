package ej4act5und5;

public class Triangulo extends Forma{

    protected double ancho;
    protected double alto;

    //constructor
    public Triangulo(int numLados, double ancho, double alto) {
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

    //metodos
    @Override
    public double getPerimeter() {
        return ancho*3;
    }

    @Override
    public double getArea() {
        return (alto*ancho)/2;
    }

}