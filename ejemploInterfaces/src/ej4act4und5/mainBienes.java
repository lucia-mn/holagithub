package ej4act4und5;

public class mainBienes {

    public static void main(String[] args) {

        Bienes bienes = new Bienes("comida, juguete, libro", 21.99);
        Bienes comida = new Comida("helado", 2.5, 300);
        Bienes juguete = new Juguete("puzzle", 15.95, 9);
        Bienes libro = new Libro("Orgullo y prejuicio", 18.95, "Jane Austen");

        System.out.println("El precio del libro sin impuestos es: " + (libro.precio));
        System.out.println("La comida es un " + comida.descripcion + " con precio de " + comida.precio + " con impuestos"); //calorias
        System.out.println("El juguete es un " + juguete.descripcion + " con una edad mínima para jugarlo de "); //edadMinima


        Bienes[] bienesArray = { bienes, comida, juguete, libro };


    }
}
