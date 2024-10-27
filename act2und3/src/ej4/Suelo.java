package ej4;

public class Suelo {

    //atributos
    private double ancho;
    private double largo;

    //constructor
    public Suelo(double ancho, double largo) {

        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }

        if (largo < 0) {
            this.largo = 0;
        } else {
            this.largo = largo;
        }
    }

    //métodos
    public double getArea() {
        return ancho * largo;
    }
}
