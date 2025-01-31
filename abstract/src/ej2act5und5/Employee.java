package ej2act5und5;

public abstract class Employee {

    protected String nombre;
    protected String cargo;

    //constructor
    public Employee(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //metodo
    public abstract double calculateWeeklyPay();

}
