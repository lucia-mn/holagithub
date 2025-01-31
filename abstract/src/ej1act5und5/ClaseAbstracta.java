package ej1act5und5;

public abstract class ClaseAbstracta {

    //constructr
    public ClaseAbstracta() {
        System.out.println("Este es un constructor de la clase abstracta");
    }

    //metodos
    public abstract void abstract_method();

    public void no_abstract_method() {
        System.out.println("Este es un método normal de una clase abstracta");
    }
}
