// Clase base Vehiculo
/*class Vehiculo2 {
    protected String nombre;
    protected double velocidad; // En km/h

    // Constructor
    public Vehiculo(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    // Método mover (compartido por todos los vehículos)
    public void mover() {
        if (velocidad > 0) {
            System.out.println(nombre + " está en movimiento a " + velocidad + " km/h.");
        } else {
            System.out.println(nombre + " está detenido.");
        }
    }

    // Método para detener el vehículo
    public void detener() {
        velocidad = 0;
        System.out.println(nombre + " se ha detenido.");
    }
}

// Clase intermedia Coche
class Coche extends Vehiculo {
    protected int ruedas;
    protected int marcha; // Solo para coches con marchas

    // Constructor
    public Coche(String nombre, double velocidad, int ruedas, int marcha) {
        super(nombre, velocidad);
        this.ruedas = ruedas;
        this.marcha = marcha;
    }

    // Método para cambiar de marcha
    public void cambiarMarcha(int nuevaMarcha) {
        this.marcha = nuevaMarcha;
        System.out.println(nombre + " ha cambiado a la marcha " + marcha + ".");
    }

    // Método para acelerar
    public void acelerar(double incremento) {
        velocidad += incremento;
        System.out.println(nombre + " ha acelerado. Velocidad actual: " + velocidad + " km/h.");
    }

    // Método para desacelerar
    public void desacelerar(double decremento) {
        velocidad = Math.max(0, velocidad - decremento); // Evitar velocidades negativas
        System.out.println(nombre + " ha desacelerado. Velocidad actual: " + velocidad + " km/h.");
    }
}

// Clase CocheCombustion
class CocheCombustion extends Coche {
    private double capacidadTanque; // En litros

    // Constructor
    public CocheCombustion(String nombre, double velocidad, int ruedas, int marcha, double capacidadTanque) {
        super(nombre, velocidad, ruedas, marcha);
        this.capacidadTanque = capacidadTanque;
    }

    // Método específico para coches de combustión
    public void reabastecer(double litros) {
        System.out.println(nombre + " ha sido reabastecido con " + litros + " litros.");
    }
}

// Clase CocheElectrico
class CocheElectrico extends Coche {
    private double capacidadBateria; // En kWh

    // Constructor (sin marchas, por lo que se pasa siempre marcha = 0)
    public CocheElectrico(String nombre, double velocidad, int ruedas, double capacidadBateria) {
        super(nombre, velocidad, ruedas, 0);
        this.capacidadBateria = capacidadBateria;
    }

    // Sobreescritura para eliminar funcionalidad de marchas
    @Override
    public void cambiarMarcha(int nuevaMarcha) {
        System.out.println(nombre + " no tiene marchas.");
    }

    // Método específico para coches eléctricos
    public void recargar(double energia) {
        System.out.println(nombre + " ha sido recargado con " + energia + " kWh.");
    }
}*/

