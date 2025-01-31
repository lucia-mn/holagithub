package ej1act5und5;

public class mainClaseAbstracta {

    public static void main(String[] args) {

        ClaseAbstracta SubClase = new SubClase();

        SubClase.abstract_method();
        SubClase.no_abstract_method();

        // "Este es un constructor de la clase abstracta"
        // Sale ese mensaje para cualquiera de las dos

    }
}
