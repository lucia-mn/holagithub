package act5und7.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej2 {

    public static void main(String[] args) {

        System.out.println("----- mostrar lita enteros -----");
        List<Integer> numeros = new ArrayList<>();
        Consumer<Integer> num = numero -> System.out.println(numeros);

        for (int i = 1; i <= 10; i++) {

        }
    }
}
