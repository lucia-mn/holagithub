package ej4;

public class mainAlfombra {

    public static void main(String[] args) {
        Alfombra alfombra = new Alfombra(3.5);
        Suelo suelo = new Suelo(2.75, 4.0);
        Calculadora calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
        alfombra = new Alfombra(1.5);
        suelo = new Suelo(5.4, 4.5);
        calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
    }

    /*
    OUTPUT
    total= 38.5
    total= 36.45
     */
}
