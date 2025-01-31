package ej2act5und5;

public class mainEmployee {

    public static void main(String[] args) {

        Employee HourlyEmployee = new HourlyEmployee("Antonio", "gerente", 12.5, 300);
        Employee SalaryEmployee = new SalaryEmployee("José Luis", "jefe", 350.00);

        System.out.println("El pago de un empleado por hora es: " + SalaryEmployee.calculateWeeklyPay() + " €");
        System.out.println("La paga del trabajador asalariado es: " + HourlyEmployee.calculateWeeklyPay() + " €");
    }
}
