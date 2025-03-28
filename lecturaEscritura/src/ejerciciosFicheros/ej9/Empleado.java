package ejerciciosFicheros.ej9;

import java.io.Serializable;

public class Empleado implements Serializable {

    protected String dni;
    protected String nombre;
    protected int edad;
    protected double sueldo;

    //constructor
    public Empleado(String dni, String nombre, int edad, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    //getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }

}
