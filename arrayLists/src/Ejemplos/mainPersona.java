package Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class mainPersona {

    public static void main(String[] args) {

        // Crear una ArrayList de personas
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Agregar algunas personas a la lista
        listaPersonas.add(new Persona("Juan", 25));
        listaPersonas.add(new Persona("Maria", 30));
        listaPersonas.add(new Persona("Carlos", 22));


        // Mostrar la lista mediante foreach
        System.out.println("Lista de Personas:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        //Mostrar la lista mediante for
        System.out.println("Lista de Personas:");
        for(int i=0;i<listaPersonas.size();i++)
            System.out.println(listaPersonas.get(i));



        //obtenemos el iterador del ArrayList
        Iterator<Persona> iterator=listaPersonas.iterator();
        Persona persona;
        //mientras queden elementos
        while (iterator.hasNext()){
            //elemento siguiente
            persona=iterator.next();
            System.out.println(persona);
        }

        //obtenemos el iterador del ArrayList
        /*Iterator<Persona> iterator=listaPersonas.iterator();
        Persona persona;
        //mientras queden elementos
        while (iterator.hasNext()){
            //elemento siguiente
            persona=iterator.next();
            if(persona.edad>20){
                //elimina el elemento, no usar listaPersona.remove(persona)
                iterator.remove();
            }
        }*/



    }

}