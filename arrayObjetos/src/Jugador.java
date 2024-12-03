public class Jugador {

    private String nombre;
    private String posicion;
    private double sueldo;
    private int goles;
    private int tarjetas;

    //constructor
    public Jugador(String nombre, String posicion, double sueldo, int goles, int tarjetas) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.sueldo = sueldo;
        this.goles = goles;
        this.tarjetas = tarjetas;
    }


    //getters-setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAmarillas() {
        return tarjetas;
    }

    public void setAmarillas(int amarillas) {
        this.tarjetas = amarillas;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", sueldo=" + sueldo +
                ", goles=" + goles +
                ", amarillas=" + tarjetas +
                '}';
    }

    public void mostrarJugador() {
        System.out.println("Nombre: " + nombre + " , Posición: " + posicion + " , Sueldo: " + sueldo + " , Goles: " + goles + " , Tarjetas: " + tarjetas);
    }

}
