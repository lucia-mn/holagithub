package ej2act5und5;

public class SalaryEmployee extends Employee{

    protected double salarioSemanal;

    //constructor
    public SalaryEmployee(String nombre, String cargo, double salarioSemanal) {
        super(nombre, cargo);
        this.salarioSemanal = salarioSemanal;
    }

    //getter y setter
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    //metodo

    @Override
    public double calculateWeeklyPay() {
        return salarioSemanal;
        //System.out.println("La paga del trabajador asalariado es: " + salarioSemanal + " €");

    }
}
