package ej2act5und5;

public class HourlyEmployee extends Employee{

    protected double tasaPago;
    protected int horasTrabajo;

    //constructor
    public HourlyEmployee(String nombre, String cargo, double tasaPago, int horasTrabajo) {
        super(nombre, cargo);
        this.tasaPago = tasaPago;
        this.horasTrabajo = horasTrabajo;
    }

    //metodos
    @Override
    public double calculateWeeklyPay() {
        return tasaPago * horasTrabajo;
        //System.out.println("El pago de un empleado por hora es: " + tasaPago * horasTrabajo + " €");

    }
}
