public class Monitor {

    private String modelo;
    private String resolucion;
    private int tam;

    public Monitor(String modelo, String resolucion, int tam) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.tam = tam;
    }

    public void dibujarPixel(int x, int y) {
        System.out.println("Pixel en " + x + y);
    }


    //getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }


    @Override
    public String toString() {
        return "Monitor{" +
                "modelo='" + modelo + '\'' +
                ", resolucion='" + resolucion + '\'' +
                ", tam=" + tam +
                '}';
    }
}