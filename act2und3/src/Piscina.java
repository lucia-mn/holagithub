public class Piscina {

    //campos
    private String color;
    private TipoPiscina tipoPiscina;
    private String material;
    private int fechaconstruccion;

    public enum TipoPiscina {
        RECTANGULAR, OVALADA, TRIANGULAR, CIRCULAR, CUADRADA
    }


    //constructor
    public Piscina(String color, TipoPiscina tipoPiscina, String material, int fechaconstruccion) {
        this.color = color;
        this.tipoPiscina = tipoPiscina;
        this.material = material;
        this.fechaconstruccion = fechaconstruccion;
    }


    //getters-setterss
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoPiscina getTipoPiscina() {
        return tipoPiscina;
    }

    public void setTipoPiscina(TipoPiscina tipoPiscina) {
        this.tipoPiscina = tipoPiscina;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getFechaconstruccion() {
        return fechaconstruccion;
    }

    public void setFechaconstruccion(int fechaconstruccion) {
        this.fechaconstruccion = fechaconstruccion;
    }
}
