public class Cama {

    //atributos
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;


    //constructor
    public Cama(String estilo, int almohadas, int altura, int sabanas, int colcha) {
        this.estilo = estilo;
        this.almohadas = almohadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
    }


    //getters y setters
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public void setAlmohadas(int almohadas) {
        this.almohadas = almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public void setSabanas(int sabanas) {
        this.sabanas = sabanas;
    }

    public int getColcha() {
        return colcha;
    }

    public void setColcha(int colcha) {
        this.colcha = colcha;
    }


    //métodos
    public void hacer() {
        System.out.println("Se ha hecho la cama");
    }
}
