package SET;

import java.util.*;

public class main {

    public static void main(String[] args) {

        //ejemplo/ prueba
        Set<String> setB = new HashSet<>();

        setB.add("element 1");
        setB.add("element 2");
        setB.add("element 3");



        //1. AÑADIR ELEMENTOS A UN SET
        Set<String> setA = new HashSet<>();

        setA.add("element 1");
        setA.add("element 2");
        setA.add("element 3");

        //recorrer los elementos con un iterator
        Iterator<String> iterator = setA.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
        }

        //imprimir con un print
        System.out.println();



        //2. CREAR DESDE UNA LISTA
        List<String> palabras = Arrays.asList("hola", "mundo", "hola", "universo", "mundo", "hola");
        Set<String> palabrasUnicas = new HashSet<>(palabras);

        System.out.println("Palabras únicas : " + palabrasUnicas);
        //Palabras únicas : [mundo, hola, universo]



        //3. RECORRER LOS ELEMENTOS
        // for-eachSet<Integer> set = new HashSet();
        Set<Integer> setC = new HashSet();

        for(Integer num: setC) {
            System.out.println(num);
        }



        //4. ELIMINAR UN ELEMENTO DEL SET
        //un elemento
        setA.remove("object-to-remove");

        //todo el set
        setA.clear();



        //5. VERIFICAR SI ESTA VACIO
        Set<String> setf = new HashSet<>();

        boolean isEmpty = setf.isEmpty();



        //6. SI CONTIENE UN ELEMENTO
        Set<String> setD = new HashSet<>();

        setD.add("123");
        setD.add("456");

        boolean contains123 = setD.contains("123");//devuelve true

        //verificar si el conjunto tiene un valor nulo
        Set<String> setE = new HashSet<>();
        setE.add(null);
        boolean containsElement = setE.contains(null);



        //7. CONVERTIR UN SET A ARRAY LIST
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("456");

        List<String> list = new ArrayList<>();
        list.addAll(set);








        /*
        // Conjuntos de ejemplo
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<String> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Unión
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Unión: " + union);
        //Unión: [1, 2, 3, 4, 5, 6, 7, 8]

        // Intersección
        Set<String> interseccion = new HashSet<>(set1);
        interseccion.retainAll(set2);
        System.out.println("Intersección: " + interseccion);
        //Intersección: [4, 5]

        // Diferencia (set1 - set2)
        Set<String> diferencia = new HashSet<>(set1);
        diferencia.removeAll(set2);
        System.out.println("Diferencia (set1 - set2): " + diferencia);
        //Diferencia (set1 - set2): [1, 2, 3]
        */



        // Conjuntos de ejemplo
        HashSet<String> setX = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E", "V"));
        HashSet<String> setY = new HashSet<>(Arrays.asList("V", "W", "X", "Y", "Z", "A"));

        // Unión
        HashSet<String> union2 = new HashSet<>(setX);
        union2.addAll(setY);
        System.out.println("Unión: " + union2);

        // Intersección
        HashSet<String> interseccion2 = new HashSet<>(setX);
        interseccion2.retainAll(setY);
        System.out.println("Intersección: " + interseccion2);

        // Diferencia (setX - setY)
        HashSet<String> diferencia2 = new HashSet<>(setX);
        diferencia2.removeAll(setY);
        System.out.println("Diferencia (setX - setY): " + diferencia2);

    }
}

