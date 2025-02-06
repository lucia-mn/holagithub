import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class mainTelefonoMovil {

    private static Scanner scanner = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil("123456789");

    public static void imprimirMenu() {
        System.out.println("Menú: ");
        System.out.println("0 - Salir");
        System.out.println("1 - Imprimir contactos");
        System.out.println("2 - Agregar nuevo contacto");
        System.out.println("3 - Actualizar contacto existente");
        System.out.println("4 - Eliminar contacto de la lista");
        System.out.println("5 - Buscar/ encontrar contacto por nombre");
        System.out.println("6 - Volver a imprimir la lista de opciones");
    }


    //metodos
    public static void addNewContact() {
        System.out.println("Inserta el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Inserta el número de teléfono: ");
        String phoneNumber = scanner.nextLine();

        //aqui llamas al constructor para crear un nuevo contacto en vez de al metodo createContact en Contacto.java
        Contacto nuevoContacto = new Contacto(name, phoneNumber);
        if (telefonoMovil.addNewContact(nuevoContacto)) {
            System.out.println("Contacto agregado: " + name + " " + phoneNumber);
        } else {
            System.out.println("El contacto ya existe en la agenda");
        }
    }

    public static void updateContact() {
        System.out.println("Nombre del contacto: ");
        String oldName = scanner.nextLine();
        Contacto contactoExistente = telefonoMovil.queryContact(oldName);
        if (contactoExistente == null) {
            System.out.println("No existe");
        }

        System.out.println("Ingresa el nuevo nombre: ");
        String newName = scanner.nextLine();
        System.out.println("Ingresa el nuevo número de teléfono: ");
        String numTel = scanner.nextLine();

        //aqui llamas al constructor para crear un nuevo contacto
        Contacto nuevoContacto = new Contacto(newName, numTel);
        if (telefonoMovil.updateContact(contactoExistente, nuevoContacto)) {
            System.out.println("Contacto agregado correctamente");
        } else {
            System.out.println("El contacto ya existe en la agenda.");
        }
    }

    public static void removeContact() {
        System.out.println("Inserta el nombre del contacto que quieres borrar: ");
        String borrarContacto = scanner.nextLine();

        Contacto contactoExistente = telefonoMovil.queryContact(borrarContacto);
        if (contactoExistente == null) {
            System.out.println("No existe");
        }

        if (telefonoMovil.removeContact(contactoExistente)) {
            System.out.println("Contacto eliminado");

        } else {
            System.out.println("hola");
        }
    }

    public static void queryContact() {
        System.out.println("Inserta el nombre del contacto que quieres encontrar: ");
        String buscarContacto = scanner.nextLine();

        Contacto contactoExistente = telefonoMovil.queryContact(buscarContacto);
        if (contactoExistente == null) {
            System.out.println("No existe");

        } else {
            System.out.println("Nombre " + contactoExistente.getName() + "teléfono: " + contactoExistente.getPhoneNumber());
        }

    }


    //switch
    public static void main(String[] args) {
        boolean continuar = true;
        int opcion = 0;
        imprimirMenu();

        while(continuar) {
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;

                case 6:
                    imprimirMenu();
                    break;
            }
        }
    }
}
