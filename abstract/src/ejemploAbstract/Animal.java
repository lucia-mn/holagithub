package ejemploAbstract;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void alimentar();
    public abstract void mover();

    public String getNombre() {
        return nombre;
    }
}
