package ej4act5und5;

import java.util.Arrays;

public class mainForma {

    public static void main(String[] args) {

        /*Forma rectangulo = new Rectangulo(4, 12.00, 8.00);
        Forma triangulo = new Triangulo(3, 5.5, 12.5);


        System.out.println("Área de un triángulo = " + triangulo.getArea());
        System.out.println("Perimetro de un rectángulo = " + rectangulo.getPerimeter());
        System.out.println("Perímetro de un triángulo = " + triangulo.getPerimeter());
        System.out.println("Área de un rectángulo = " + rectangulo.getArea());


        //para que los getters de getAncho y Alto se vean en el main puedes hacer añadir los métodos abstractos en la clase forma
        //y luego implementarlos con un override en los getters en las clases hijas (opcion1)
        System.out.println("Triángulo - Ancho (Base): " + triangulo.getAncho() + ", Alto: " + triangulo.getAlto());

        //o hacer un casting sobre el main (opcion2), que no se recomienda
        System.out.println("Triángulo - Ancho (Base): " + ((Triangulo) triangulo).getAncho() + ", Alto: " + ((Triangulo) triangulo).getAlto());*/


        //System.out.println(" ");
        //EJ4
        Rectangulo rectangulo = new Rectangulo(4, 2, 3);

        System.out.println("Rectángulo original:");
        System.out.println("Ancho: " + rectangulo.getAncho() + ", Alto: " + rectangulo.getAlto());
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());

        rectangulo.setAncho(rectangulo.getAncho() * 2);
        rectangulo.setAlto(rectangulo.getAlto() * 2);

        System.out.println(" ");
        System.out.println("Rectángulo después de escalar por 2:");
        System.out.println("Ancho: " + rectangulo.getAncho() + ", Alto: " + rectangulo.getAlto());
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());


        //EJ5
        rectangulo.redimensionar(2);

        System.out.println(" ");
        System.out.println("Rectángulo después de redimensionar por 2:");
        System.out.println("Ancho: " + rectangulo.getAncho() + ", Alto: " + rectangulo.getAlto());
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());


        //EJ6
        Rectangulo[] rectangulos = {
                new Rectangulo(4, 2, 3),
                new Rectangulo(4, 5, 6),
                new Rectangulo(4, 1, 2),
                new Rectangulo(4, 4, 5),
                new Rectangulo(4, 7, 8),
                new Rectangulo(4, 6, 7),
                new Rectangulo(4, 3, 4),
                new Rectangulo(4, 9, 10),
                new Rectangulo(4, 8, 9),
                new Rectangulo(4, 10, 11)
        };

        Arrays.sort(rectangulos);

        System.out.println(" ");
        System.out.println("Rectángulos por orden de área:");
        for (Rectangulo r : rectangulos) {
            System.out.println(r);
        }
    }
}

