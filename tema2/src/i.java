public class i {
    public static void main(String[] args) {
        // Calcular el valor absoluto de un número
        double numeroNegativo = -10.5;
        double valorAbsoluto = Math.abs(numeroNegativo);
        System.out.println("Valor absoluto de " + numeroNegativo + " es " + valorAbsoluto);

        int num1 = 30;
        int num2 = 60;
        int maximo = Math.max(num1, num2);
        System.out.println("El valor máximo entre " + num1 + " y " + num2 + " es " + maximo);

        int base = 2;
        int exponente = 3;
        double resultadoPotencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultadoPotencia);
    }
}