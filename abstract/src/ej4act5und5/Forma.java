package ej4act5und5;

public abstract class Forma {

    protected int numLados;

    //constructor
    public Forma(int numLados) {
        this.numLados = numLados;
    }

    //getter
    public int getNumLados() {
        return numLados;
    }

    //metodos
    public abstract double getArea();

    public abstract double getPerimeter();
}
