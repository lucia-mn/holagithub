package explicaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class lambdaInterfaces {

    public static void main(String[] args) {

        //CONSUMER
        System.out.println("----- con lambda -----");
        Consumer<String> printer1 = message -> System.out.println(message);
        printer1.accept("Hola mundo desde Lambda");

        System.out.println("----- en mayusculas -----");
        Consumer<String> printer2 = message -> System.out.println(message.toUpperCase());
        printer2.accept("lucia");

        System.out.println("----- concatena opciones -----");
        Consumer<String> printer3 = printer1.andThen(printer2);
        printer3.accept("hola");

        Consumer<String> printer4 = message -> System.out.println(message.toUpperCase());


        // primera en mayusculas el resto en minusculas
        Consumer<String> printer12 = printer1.andThen(printer2);
        printer12.accept("feliz navidad");

        //el tipo de objeto que se pasa es un string, hay que utilizar la clase string que es
        // la que esta relacionada con el metodo



        System.out.println("----- mostrar lita String -----");
        List<String> names = new ArrayList<>();
        Consumer<String> nombre = name -> System.out.println(name);
        names.add("jose");
        names.add("juan");
        names.add("pepe");
        names.add("luis");
        names.forEach(nombre);

        // otra posibilidad es declarar el consumer con un forEach



        System.out.println("----- mostrar lita enteros -----");
        List<Integer> numeros = new ArrayList<>();
        Consumer<Integer> num = numero -> System.out.println(numeros);

        for (int i = 1; i <= 10; i++) {

        }


        //BICONSUMER
        BiConsumer<Integer, String> bimap = (n, s) -> System.out.println(n + " " + s);
        bimap.accept(10, "diez");

        HashMap<Integer, String > mapa = new HashMap<>();
        mapa.put(5, "cinco");
        mapa.put(6, "seis");
        mapa.put(7, "siete");
        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));




        //SUPPLIER
        Supplier<Double> generorandoms= () -> Math.random();
        Double numero = generorandoms.get();

        System.out.println(numero);
        System.out.println(generorandoms.get());
        System.out.println(" ");

        Supplier<Integer> generointrandoms = () -> new Random().nextInt(200+1);
        System.out.println(generointrandoms.get());
        System.out.println(" ");

        //Supplier<Ciudad> city = () -> new Ciudad(Elche);
        //System.out.println(city.get().nombre);
    }
}
