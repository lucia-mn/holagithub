public class Teclado {

    private String color;
    private int teclas;

    public Teclado(String color, int teclas) {
        this.color = color;
        this.teclas = teclas;
    }

    public void pushKey(char key) {
        System.out.println("Se ha presionado la tecla " + key);
    }


    //getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTeclas() {
        return teclas;
    }

    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }


    @Override
    public String toString() {
        return "Teclado{" +
                "color='" + color + '\'' +
                ", teclas=" + teclas +
                '}';
    }
}
