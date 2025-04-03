package generico;

public class Box<T> {

    //atributos
    private T elemento;

    //¿?
    public T get() { return elemento; }
    public void set(T elemento) { this.elemento = elemento; }
}
