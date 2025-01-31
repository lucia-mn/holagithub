package ej4act4und5;

public class Comida extends Bienes {

    //atributo
    protected double calorias;

    //constructor
    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    //metodo
    @Override
    public String toString() {
        return "Comida{" +
                "\ncalorias=" + calorias +
                ", \ndescripcion='" + descripcion + '\'' +
                ", \nprecio=" + precio +
                '}';
    }

}
