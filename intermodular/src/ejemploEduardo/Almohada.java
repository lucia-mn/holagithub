package ejemploEduardo;// Modificaoo el 9-3-2024 test hoy


public class Almohada {
    private String modelo;
    private int categoria;
    private double precio;

    public Almohada(String modelo, int categoria, double precio) {
        this.modelo = modelo;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
