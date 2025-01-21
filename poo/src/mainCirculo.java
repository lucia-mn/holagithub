public class mainCirculo {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        System.out.println("El área del círculo es: " + circulo.getArea() + " m2");

        Cilindro cilindro = new Cilindro(5.0, 10.0);
        System.out.println("El volumen del cilindro es: " + cilindro.getVolume() + " m3");

    }
}

