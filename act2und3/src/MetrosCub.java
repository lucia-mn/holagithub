public class MetrosCub {

    //campos
    private double ancho;
    private double largo;
    private double profmax;
    private double profmin;


    //constructor
    public MetrosCub(double ancho, double largo, double profmax, double profmin) {
        if (ancho < 0) {
            this.ancho = 0;
        } else {
            this.ancho = ancho;
        }

        if (largo < 0) {
            this.largo = 0;
        } else {
            this.largo = largo;
        }

        if (profmax < 0) {
            this.profmax = 0;
        } else {
            this.profmax = profmax;
        }

        if (profmin < 0) {
            this.profmin = 0;
        } else {
            this.profmin = profmin;
        }
    }


    //getters-setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getProfmax() {
        return profmax;
    }

    public void setProfmax(double profmax) {
        this.profmax = profmax;
    }

    public double getProfmin() {
        return profmin;
    }

    public void setProfmin(double profmin) {
        this.profmin = profmin;
    }


    //métodos
    public double getMetrosCubicos() {
        return ((profmax+profmin)/2)*largo*ancho;
    }

}
