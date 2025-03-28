package ejemploEduardo;// Modificaoo el 9-3-2024 test hoy
// Modificado por devportatil

public class Colchon {
    private String marca;
    private double coste;
    private int precio;

    public Colchon(String marca, double coste, int precio) {
        this.marca = marca;
        this.coste = coste;
        this.precio=precio;
    }

    public Colchon(double coste)
    { if (coste<0) coste=0;
        this.coste=coste;}

    public double getCoste() {
        return coste;
    }
}
