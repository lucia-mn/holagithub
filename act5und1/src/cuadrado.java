import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("pon los cm del cuadrado: ");
        double lado1=sc.nextDouble();
        double area=lado1*lado1;
        System.out.println("el area del cuadrado es: " +area);
    }
}