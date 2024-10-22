public class Coche {

    private int puertas;
    private double peso;
    private double precio;
    private String motor;
    private String modelo;
    private String color;
    private String marca;


    //constructor
    public Coche() {
        this.puertas = puertas;
        this.peso = peso;
        this.precio = precio;
        this.motor = motor;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }



    //getters and setters
    public int getPuertas() {
        return puertas;
    }


    //puertas
    public void setPuertas(int puertas) {
        if(puertas>=3 && puertas<=5){
            this.puertas=puertas;
        } else {
            System.out.println("Error: número de puertas incorrecto");
        }
        this.puertas = puertas;
    }


    //peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso<=0){
            this.peso=peso;
        } else {
            System.out.println("Error: el peso no puede ser negativo");
        }
        this.peso = peso;
    }


    //precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>=0 && precio<=15000){
            this.precio=precio;
        } else {
            System.out.println("Error: número de puertas incorrecto");
        }
        this.precio = precio;
    }


    //motor
    public String getMotor() {
        return motor.toUpperCase();
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


    //modelo
    public String getModelo() {
        return modelo.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //color
    public String getColor() {
        return color.toUpperCase();
    }

    public void setColor(String color) {
        this.color = color;
    }


    //marca
    public String getMarca() {
        return marca.toUpperCase();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}



