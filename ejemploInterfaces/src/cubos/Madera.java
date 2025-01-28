package cubos;

public class Madera extends Cubo implements Incinerable{

    //costructor
    public Madera(String nombre) {
        super(nombre);
    }

    //metodo
    @Override
    public void incinerar() {
        System.out.println("fuegooooo!!!");
    }
}
