package cubos;

public class Butano extends Cubo implements Incinerable,Explotable{


    //constructor
    public Butano(String nombre) {
        super(nombre);
    }

    //Metodos de incinareable y explotable
    @Override
    public void explotar() {
        System.out.println("Bataboooo!!!");
    }

    @Override
    public void incinerar() {
        System.out.println("Fuegoonnnn!!!");
    }
}
