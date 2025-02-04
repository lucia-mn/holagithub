import Ejemplos.Persona;

import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;
    private static ArrayList<Contacto> myContacts = new ArrayList<Contacto>();

    //constructor
    public TelefonoMovil(String myNumber, ArrayList<Contacto> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    //metodos
    public static boolean addNewContact(Contacto contacto) {
        if (!myContacts.contains(contacto)) {
            myContacts.add(contacto);
            return true;
        } else return false;
    }

    public static boolean updateContact(Contacto contacto, int newContacto) {
        if (myContacts.contains(contacto)) {
            myContacts.get(newContacto);
            return true;
        } else return false;
    }

    public static boolean removeContact(Contacto contacto) {
        if (myContacts.contains(contacto)) {
            myContacts.remove(contacto);
            return true;
        } else return false;
    }

    public static int findContact(Contacto contacto) {
        if (myContacts.contains(contacto)) {
            return myContacts.indexOf(contacto);
        } else return -1;
    }

    //se hace con el constructor2
    public static int findContact(String name) {
        if (myContacts.contains(new Contacto(name))) {
            return myContacts.indexOf(new Contacto(name));
        } else return -1;
    }

    public static Contacto queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public static void printContacts () {
        System.out.println("Lista de contactos:");
        for (Contacto contacto : myContacts) {
            System.out.println(contacto);
        }
    }

}
