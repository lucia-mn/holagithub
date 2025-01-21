public class Circulo {

    // Atributo
    protected double radio;

    // Constructor
    public Circulo(double radio) {
        if (radio >= 0.0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }

    // Getter: método getRadio
    public double getRadio() {
        return this.radio;
    }

    // Setter: método setRadio
    public void setRadio(double radio) {
        if (radio >= 0.0) {
            this.radio = radio;
        } else {
            this.radio = 0.0;
        }
    }

    // Método getArea
    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}

class Cilindro extends Circulo {

    // Atributo
    protected double altura;

    // Constructor
    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura >= 0.0) {
            this.altura = altura;
        } else {
            this.altura = 0.0;
        }
    }

    // Getter: método getAltura
    public double getAltura() {
        return this.altura;
    }

    // Setter: método setAltura
    public void setAltura(double altura) {
        if (altura >= 0.0) {
            this.altura = altura;
        } else {
            this.altura = 0.0;
        }
    }

    // Método getVolume
    public double getVolume() {
        return this.getArea() * this.altura;
    }

}


