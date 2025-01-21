import java.util.Scanner;

public class Vehiculo {

    //atributos
    protected String nombre;
    protected double velocidad;

    //constructor
    public Vehiculo (String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    //métodos
    public void mover () {
        if (velocidad > 0) {
            System.out.println(nombre + " el coche está en movimiento");
        } else {
            System.out.println(nombre + " el coche está parado");
        }
    }

    /*public void parar () {
        velocidad = 0;
        System.out.println(nombre + " se ha parado");
    }*/
}


class Coche extends Vehiculo {

    //atributos
    protected int matricula;
    protected String marca;
    protected int ruedas;

    //constructor
    public Coche(String nombre, double velocidad, int matricula, String marca, int ruedas) {
        super(nombre, velocidad);
        this.matricula = matricula;
        this.marca = marca;
        this.ruedas = ruedas;
    }

    //métodos
    public void acelerar (double incremento) {
        velocidad += incremento;
        System.out.println(nombre + " ha acelerado");
    }

    public void desacelerar (double decremento) {
        velocidad = Math.max(0, velocidad - decremento); // Evitar velocidades negativas
        System.out.println(nombre + " ha desacelerado");
    }
}


class CocheCombustion extends Coche {

    //atributos
    protected int autonomia;
    protected int marchas;

    //constructor
    public CocheCombustion(String nombre, double velocidad, int matricula, String marca, int ruedas, int autonomia, int marchas) {
        super(nombre, velocidad, matricula, marca, ruedas);
        this.autonomia = autonomia;
        this.marchas = marchas;
    }

    //getter
    public int getAutonomia() {
        return autonomia;
    }

    public int getMarchas() {
        return marchas;
    }


    //setter
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }


    //métodos
    public void cambiarMarcha() {

        int marcha = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce una marcha");
            marcha = scan.nextInt();

            if (marcha > 1 && marcha < 6) {
                this.marchas = marcha;
                System.out.println(nombre + " que va a una velocidad de " + velocidad + " con matrícula " + matricula + " y coche " + marca + " ha cambiado la marcha a la " + marchas);

            } else {
                System.out.println("no se puede");
            }

        } while (marcha < 0 || marcha > 7);

    }
}

