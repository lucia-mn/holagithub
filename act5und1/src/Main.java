import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double lado1=5;
    double area=lado1*lado1;
        System.out.println("el area del cuadrado es: " +area);

    double base=8;
    double altura=4;
    double perimetro=2*base+2*altura;
        System.out.println("el perimetro del rectangulo es: " +perimetro);

    int baset=18;
    int alturat=15;
    double areat=baset*alturat/2;
        System.out.println("el area del triangulo es: " +areat);



        Scanner sc = new Scanner(System.in);

        System.out.println("pon los cm del cuadrado: ");
        lado1=sc.nextDouble();
        area=lado1*lado1;
        System.out.println("el area del cuadrado es: " +area);



        System.out.println("introduce base rectangulo: ");
        base= sc.nextDouble();
        System.out.println("introduce la altura rectangulo: ");
        altura= sc.nextDouble();
        perimetro=2*base+2*altura;
        System.out.println("el perimetro del rectangulo es: " +perimetro);



        System.out.println("introduce base triangulo: ");
        double b= sc.nextDouble();
        System.out.println("introduce la altura: ");
        double h= sc.nextDouble();
        area= ((b*h)/2);
        System.out.println("el area del triangulo es: " +area);




        System.out.println("introduce el radio: ");
        double rc= sc.nextInt();
        System.out.println("area circulo" + Math.pow(rc,2)*Math.PI);
        System.out.println("perimetro circulo: " + 2*Math.PI*rc);

    }
}