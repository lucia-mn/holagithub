package Lambda;

interface Operar{
    public int calcula(int a,int b);
}

public class Calculadora {

    public static void main(String[] args) {

        Operar suma = (a, b) -> (a+b);
        Operar multiplica = (int a, int b) -> (a*b);
        Operar resta = (a, b) -> (a-b);


        System.out.println(multiplica.calcula(10, 20));
        System.out.println(resta.calcula(10, 20));
        System.out.println(suma.calcula(10, 20));
    }
}
