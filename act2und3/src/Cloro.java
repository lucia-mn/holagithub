public class Cloro {

   //campos
    private double precio;
    private double gramos;
    private TipoCloro tipoCloro;
    //private int cantidadproducto;
    //private String envase;

    public enum TipoCloro {
        PASTILLA, GRANULADO, LÍQUIDO
    }


    //constructor
    public Cloro(double precio, double gramos, TipoCloro tipoCloro) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }

        if (gramos < 0) {
            this.gramos = 0;
        } else {
            this.gramos = gramos;
        }

        this.tipoCloro = tipoCloro;
    }


    //getters-setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoCloro getTipoCloro() {
        return tipoCloro;
    }

    public void setTipoCloro(TipoCloro tipoCloro) {
        this.tipoCloro = tipoCloro;
    }


    //métodos
    public double getGramos() {
        return gramos;
    }

}
