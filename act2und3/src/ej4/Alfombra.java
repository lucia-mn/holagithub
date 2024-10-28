package ej4;

public class Alfombra {

    //atributos
    private double coste;

    //constructor
    public Alfombra(double coste) {

        if (coste < 0) {
            this.coste = 0;
        } else {
            this.coste = coste;
        }
    }

    //métodos
    public double getCoste() {
        return coste;
    }
}
