package ej4act4und5;

public class Comida {

    //atributo
    public double calorias;

    //constructor
    public Comida(double calorias) {
        this.calorias = calorias;
    }

    //metodo
    @Override
    public String toString() {
        return "Comida{" +
                "calorias=" + calorias +
                '}';
    }
}
