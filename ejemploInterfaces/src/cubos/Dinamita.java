package cubos;

public class Dinamita extends Cubo implements Explotable{

    //constructor
    public Dinamita(String nombre) {
        super(nombre);
    }

    //metodo
    @Override
    public void explotar() {
        System.out.println("Boooo!!!");
    }
}
