package ej4;

public class Calculadora {

    //atributos
    private Suelo suelo;
    private Alfombra alfombra;

    //constructor
    public Calculadora(Suelo suelo, Alfombra alfombra) {
        this.suelo = suelo;
        this.alfombra = alfombra;
    }

    //métodos
    public double getCosteTotal() {
        return suelo.getArea() * alfombra.getCoste();
    }
}