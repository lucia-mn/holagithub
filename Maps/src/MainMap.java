import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> idiomas = new HashMap<>();
        idiomas.put("es", "Español");
        idiomas.put("en", "English EEUU");
        idiomas.put("ca", "English Canadá");
        idiomas.put("de", "Aleman");
        idiomas.put("fr", "Francés");
        idiomas.put("it", "Italian");

        //imprimir
        System.out.println(idiomas);

        //imprimir los valores clave del key (todas las entradas); SIN ORDEN
        System.out.println(" ");
        for(String key: idiomas.keySet()) {
            System.out.println(key + " " + idiomas.get(key));
        }

        //imprimir cada una de las entradas del mapa; SIN ORDEN
        System.out.println(" ");
        for (Map.Entry<String, String> entradaMapa: idiomas.entrySet()) {
            System.out.println(entradaMapa.getKey() + " " + entradaMapa.getValue());
        }



        // EL PUT ALIMENTA AL MAPA Y EL GET EXTRAE VALORES
        Map<String, String> mundo = new HashMap<>();

        idiomas.put("es", "Español");
        idiomas.put("en", "English EEUU");
        idiomas.put("ca", "English Canadá");
        idiomas.put("de", "Aleman");
        idiomas.put("fr", "Francés");
        idiomas.put("ch", "Chino");
        System.out.println(" ");
        System.out.println(idiomas.put("it", "Italian")); //devuelve null
        System.out.println(idiomas.put("it", "Italiano")); //devuelve el valor previo "Italian", lo que significa que se ha sobreescrito
        //esto no funciona
        String valor = idiomas.get("it");


        //ELIMINAR UNA CLAVE
        //Forma 1
        //boolean eliminado = idiomas.remove("fr");

        //Forma 2
        if (idiomas.remove("de", "Ingles")) {
            System.out.println("de ha sido eliminado");
        } else {
            System.out.println("No existe un par clave-valor con de-Ingles");
        }


        //REPLACE = ACTUALIZA UNA CLAVE
        idiomas.replace("es", "Spain");
        idiomas.replace("en", "English", "English EEUU");//Reemplazo
        // el antiguo valor por el nuevo, pero antes me aseguro que el antiguo valor sea ese dato antes de cambiarlo




        //JSON
        System.out.println(" ");
        System.out.println(" ");
        //El valor debe ser Object porque podemos contener diversos tipos de datos
        HashMap<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Juan");
        persona.put("edad", 30);
        persona.put("ciudad", "Madrid");

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("612345678");
        telefonos.add("987654321");

        persona.put("telefonos", telefonos);


        //casting para imprimir
        String nombre = (String) persona.get("nombre");
        int edad = (int) persona.get("edad");
        String ciudad = (String) persona.get("ciudad");
        telefonos = (ArrayList<String>) persona.get("telefonos");

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Teléfonos: " + telefonos);


        //el remove y el replace son métodos sobrecargado
        //métodos hasta el clear de momento
    }

}
