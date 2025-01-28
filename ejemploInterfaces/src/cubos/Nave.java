package cubos;

public class Nave implements Explotable{
    String nombre;

    //metodo de explotable
    @Override
    public void explotar() {
        System.out.println("Exxxxxploooosiooooon!!!!");
    }
}
