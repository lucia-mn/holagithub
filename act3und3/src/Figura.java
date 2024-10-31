public class Figura {

    private double radio;
    private double area;


    //constructor
    /*public Figura(double radio, double area) {
        this.radio = radio;
        this.area = area;
    }*/


    //get-set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    //métodos
    public double area(double radio) {
        if (radio < 0) {
            return -1;
        }
        return Math.PI * radio * radio;
    }

    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public double area(double)
}

