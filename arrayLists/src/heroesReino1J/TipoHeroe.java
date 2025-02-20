package heroesReino1J;

public class TipoHeroe {

    protected String atributo;
    protected String metodo;
    protected String nombre;

    //constructor
    public TipoHeroe(String atributo, String metodo, String nombre) {
        this.atributo = atributo;
        this.metodo = metodo;
        this.nombre = nombre;
    }

    //getters y setters
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void add(TipoHeroe tipoHeroes) {
    }

    //metodos


}
