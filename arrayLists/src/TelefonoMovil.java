import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;
    private static ArrayList<Contacto> myContacts;

    //constructor
    public TelefonoMovil(String myNumber) {
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

    /*public static boolean updateContact(Contacto contactoExistente, Contacto nuevoContacto) {
        int encontrarPosicion = findContact(contactoExistente);
        if (encontrarPosicion < 0) {
            return false;
        }
        if (findContact(nuevoContacto.getName()) != 1) {
            return false;
        }
        myContacts.set(encontrarPosicion, nuevoContacto);
        return true;
    }*/

    public static boolean removeContact(Contacto contacto) {
        int encontrarPosicion = findContact(contacto);
        if (encontrarPosicion < 0) {
            return false;
        }
        myContacts.remove(encontrarPosicion);
        return true;
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

    public static void printContacts() {
        System.out.println("Lista de contactos:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " " + myContacts.get(i).getPhoneNumber());
        }

    }
}
